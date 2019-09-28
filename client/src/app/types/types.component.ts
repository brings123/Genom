import { Component, OnInit } from '@angular/core';
import { Categorie } from '../Ressource/categorie';
import { WebRessourceService } from '../Ressource/web-ressource.service';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Type } from '../Ressource/type';


@Component({
  selector: 'app-types',
  templateUrl: './types.component.html',
  styleUrls: ['./types.component.css']
})
export class TypesComponent implements OnInit {
  types$ : Observable<Type[]>;
  categories$ : Observable<Categorie[]>;
  selectedCat : Categorie;
  All = 'All';
  constructor(
    private webService:WebRessourceService,
    private router : Router,
  ) { }

  ngOnInit() {
    this.types$ = this.webService.getTypes();
    this.categories$ = this.webService.getCategories();
  }
  onSelectCat(categorie : Categorie){
    this.All ="";
    this.selectedCat = categorie;
    this.types$ = this.webService.getTypeCat(categorie.id);
  }
  selectAllCat (){
    this.All = "All";
    this.selectedCat = null;
    this.types$ = this.webService.getTypes();
  }

}
