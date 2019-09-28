import { Component, OnInit } from '@angular/core';
import { Caracteristique } from '../caracteristique';
import{Router} from '@angular/router'
import { Categorie } from '../categorie';
import { Observable } from 'rxjs';
import { WebRessourceService } from '../web-ressource.service';
declare var M:any;
@Component({
  selector: 'app-caracteristiques',
  templateUrl: './caracteristiques.component.html',
  styleUrls: ['./caracteristiques.component.css']
})
export class CaracteristiquesComponent implements OnInit {
  caracteristique$ : Observable<Caracteristique[]>;
  categories$ : Observable<Categorie[]>;
  selectedCat : Categorie;
  idToDelete;
  All = 'All';
  constructor(
    private webService:WebRessourceService,
    private router : Router,
  ) { }

  ngOnInit() {
    this.caracteristique$ = this.webService.getCaracteristiques();
    this.categories$ = this.webService.getCategories();
    document.addEventListener('DOMContentLoaded', function() {
      var elems = document.querySelectorAll('.modal');
      const options = {};
      var instances = M.Modal.init(elems, options);
    });
    var event;
    setTimeout(function(){
      event = document.createEvent("HTMLEvents");
      event.initEvent("DOMContentLoaded", true, true);
      event.eventName = "DOMContentLoaded";
      document.dispatchEvent(event);
    },800);
  }
  onSelectCat(categorie : Categorie){
    this.All ="";
    this.selectedCat = categorie;
    this.caracteristique$ = this.webService.getCaracteristique(categorie.id);
  }
  selectAllCat (){
    this.All = "All";
    this.selectedCat = null;
    this.caracteristique$ = this.webService.getCaracteristiques();
  }

  caraClick(id){
    this.router.navigate(['/caracteristique',id]);
  }
  supprimer(id){
    this.idToDelete = id ;
  }
  confirmer(){
    this.selectedCat = null ; 
    this.All="All";
    this.webService.deleteCaracteristique(this.idToDelete).subscribe(res => {
      this.caracteristique$ = this.webService.getCaracteristiques();
    });
  }

}
