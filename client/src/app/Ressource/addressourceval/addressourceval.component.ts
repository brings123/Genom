import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';
import { Caracteristique } from '../caracteristique';
import { Observable } from 'rxjs';
import { WebRessourceService } from '../web-ressource.service';
import { ValeurAbs } from '../valeurAbs';
import{wilayas} from '../wilaya';
import{communes} from '../commune';
declare var M:any;
@Component({
  selector: 'app-addressourceval',
  templateUrl: './addressourceval.component.html',
  styleUrls: ['./addressourceval.component.css']
})
export class AddressourcevalComponent implements OnInit {
 form;
 idRessource: number ;
  idCategorie : number ;
  onUpload : boolean = false ;
 caracteristiques : Caracteristique[];
 valeurs=[];
 wilayas = wilayas;
 communes ;
 idWilaya ;
 idCommune ;
 
  constructor(
    private route : ActivatedRoute,
    private webService : WebRessourceService,
    private router : Router
  ) { 
  }

  ngOnInit() {
    document.addEventListener('DOMContentLoaded', function() {
      setTimeout(function(){
        var elems = document.querySelectorAll('select');
        const options = {};
        var instances = M.FormSelect.init(elems, options);
      },600);
    });
    var event;
    setTimeout(function(){
      event = document.createEvent("HTMLEvents");
      event.initEvent("DOMContentLoaded", true, true);
      event.eventName = "DOMContentLoaded";
      document.dispatchEvent(event);
    },800);

    this.idRessource =Number(this.route.snapshot.paramMap.get('id'));
    this.webService.getRessource(this.idRessource).subscribe(res => {
      this.idCategorie = res.categorie.id ;
      this.webService.getCaracteristique(this.idCategorie).subscribe(res => {
        this.caracteristiques =  res ;
        this.caracteristiques.forEach((carac,i) => {
          this.webService.getValeurAbs(carac.id).subscribe(res =>{
            this.valeurs.push(res);
          })
        })
      });
    })
  }

  onSubmit(){
    this.valeurs.forEach((elem ,i)=>{
      elem.forEach((item,j)=>{
        item.ressource = {"id":this.idRessource};
        delete item.id;
        item.caracteristique = {"id": item.caracteristique.id};
        this.webService.postValeur(item);
      });
      
    }) ;

    this.webService.postLocation(this.idWilaya,this.idCommune, this.idRessource);
    this.router.navigate(['/ressources']);
  }

  selectWilaya(id){
    this.idWilaya = id;
    var event;
    this.communes = communes.filter((commune)=>{
      return commune.wilaya_id == id ;
    });

    setTimeout(function(){
      event = document.createEvent("HTMLEvents");
      event.initEvent("DOMContentLoaded", true, true);
      event.eventName = "DOMContentLoaded";
      document.dispatchEvent(event);
    },600);
    setTimeout(function(){
      event = document.createEvent("HTMLEvents");
      event.initEvent("DOMContentLoaded", true, true);
      event.eventName = "DOMContentLoaded";
      document.dispatchEvent(event);
    },800);
  }

  selectCommune(id){
    this.idCommune = id ;
  }

  onPhotoSelected (event){
    this.onUpload = true ;
   var file = event.target.files[0];
   this.webService.postImageToCloud(file).subscribe(res => {
   this.webService.postImage(res['secure_url'],this.idRessource).subscribe(res => {
     this.onUpload = false;
   });
   });

  }
}
