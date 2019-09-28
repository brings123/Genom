import { Component, OnInit } from '@angular/core';
import { Classe } from '../Ressource/classe';
import { Observable } from 'rxjs';
import { Categorie } from '../Ressource/categorie';
import { WebRessourceService } from '../Ressource/web-ressource.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-classes',
  templateUrl: './classes.component.html',
  styleUrls: ['./classes.component.css']
})
export class ClassesComponent implements OnInit {
  classes$ : Observable<Classe[]>;
  categories$ : Observable<Categorie[]>;
  selectedCat : Categorie;
  All = 'All';
  constructor(
    private webService:WebRessourceService,
    private router : Router,
  ) { }

  ngOnInit() {
    this.classes$ = this.webService.getClasses();
    this.categories$ = this.webService.getCategories();
  }
  onSelectCat(categorie : Categorie){
    this.All ="";
    this.selectedCat = categorie;
    this.classes$ = this.webService.getClasseCat(categorie.id);
  }
  selectAllCat (){
    this.All = "All";
    this.selectedCat = null;
    this.classes$ = this.webService.getClasses();
  }

}
