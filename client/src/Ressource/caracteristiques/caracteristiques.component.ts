import { Component, OnInit } from '@angular/core';
import { Caracteristique } from '../caracteristique';
import{Router} from '@angular/router'
import { Categorie } from '../categorie';
import { Observable } from 'rxjs';
import { WebRessourceService } from '../web-ressource.service';

@Component({
  selector: 'app-caracteristiques',
  templateUrl: './caracteristiques.component.html',
  styleUrls: ['./caracteristiques.component.css']
})
export class CaracteristiquesComponent implements OnInit {
  caracteristique$ : Observable<Caracteristique[]>;
  categories$ : Observable<Categorie[]>;
  selectedCat : Categorie;
  All = 'All';
  constructor(
    private webService:WebRessourceService,
    private router : Router,
  ) { }

  ngOnInit() {
    this.caracteristique$ = this.webService.getCaracteristiques();
    this.categories$ = this.webService.getCategories();
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

}
