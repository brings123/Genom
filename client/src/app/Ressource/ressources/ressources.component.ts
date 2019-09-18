import { Component, OnInit } from '@angular/core';
import {WebRessourceService} from '../web-ressource.service'
import { Observable } from 'rxjs';
import { Ressource } from '../ressource';
import { Categorie } from '../categorie';

@Component({
  selector: 'app-ressources',
  templateUrl: './ressources.component.html',
  styleUrls: ['./ressources.component.css']
})
export class RessourcesComponent implements OnInit {

  ressources$ : Observable<Ressource[]>;
  categories$ : Observable<Categorie[]>;
  selectedCat : Categorie;
  All = 'All';
  searchString = '';

  constructor(private webService:WebRessourceService) { }

  ngOnInit() {
    this.ressources$ = this.webService.getRessources();
    this.categories$ = this.webService.getCategories();
  }

  onSelectCat(categorie : Categorie){
    this.All ="";
    this.selectedCat = categorie;
    this.ressources$ = this.webService.getRessourcesCat(categorie);
  }
  selectAllCat (){
    this.All = "All";
    this.selectedCat = null;
    this.ressources$ = this.webService.getRessources();
  }
  inputChanged(){
    if(this.searchString != '')
    this.ressources$ = this.webService.searchRessource(this.searchString);
    else if(this.selectedCat)
    this.ressources$ = this.webService.getRessourcesCat(this.selectedCat);
    else 
    this.ressources$ = this.webService.getRessources();
  }

}
