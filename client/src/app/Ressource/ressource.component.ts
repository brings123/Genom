import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import { Ressource } from './ressource';
import { WebRessourceService } from './web-ressource.service';
import { Caracteristique } from './caracteristique';
import { Observable } from 'rxjs';
import{wilayas} from './wilaya';
import{communes} from './commune';
@Component({
  selector: 'app-ressource',
  templateUrl: './ressource.component.html',
  styleUrls: ['./ressource.component.css']
})
export class RessourceComponent implements OnInit {
  localisations;
  ville = [];
  commune = [];
  caracteristiques : Caracteristique[];
  vals;
  valeurs=[];
  images=[];
  constructor(
    private route : ActivatedRoute,
    private webService : WebRessourceService,
  ) { }

  ngOnInit() {
   var id = Number(this.route.snapshot.paramMap.get('id'));
   this.webService.getImage(id).subscribe(res => {
    this.images = res;
   });
   this.webService.getLocalisation(id).subscribe(res => {
    this.localisations = res;
    this.ville.push(wilayas[this.localisations[0].pays]);
    this.commune.push(communes[this.localisations[0].ville]);
    this.webService.getCaracteristique(this.localisations[0].ressource.categorie.id).subscribe(res => {
      this.caracteristiques = res; 
      this.caracteristiques.forEach((item,i)=>{
        this.valeurs.push(this.vals.filter((val)=>{
          return val.caracteristique.id == item.id;
        }));
      });
      console.log(this.valeurs);
    });
   });
   this.webService.getValeur(id).subscribe(res => {
     this.vals = res;
   });
   
  }

}
