import { Component, OnInit } from '@angular/core';
import {WebRessourceService} from '../web-ressource.service'
import { Observable } from 'rxjs';
import { Ressource } from '../ressource';
import { Categorie } from '../categorie';
import { Location } from '@angular/common';
import { Router } from '@angular/router';
import { switchMap, tap, map } from 'rxjs/operators';

@Component({
  selector: 'app-ressources',
  templateUrl: './ressources.component.html',
  styleUrls: ['./ressources.component.css']
})
export class RessourcesComponent implements OnInit {

  ressources$ : Observable<Ressource[]>;
  categories$ : Observable<Categorie[]>;
  images = [];
  selectedCat : Categorie;
  All = 'All';
  searchString = '';

  constructor(
    private webService:WebRessourceService,
    private location:Location,
    private router : Router,
    ) { }

  ngOnInit() {
    this.webService.getImages().subscribe(res => {
      this.images = res ;
    });
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

  onBack(){
    this.location.back();
  }

}
