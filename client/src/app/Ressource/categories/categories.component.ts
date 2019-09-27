import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Categorie } from '../categorie';
import { WebRessourceService } from '../web-ressource.service';
import { Router } from '@angular/router';
declare var M:any;
@Component({
  selector: 'app-categories',
  templateUrl: './categories.component.html',
  styleUrls: ['./categories.component.css']
})
export class CategoriesComponent implements OnInit {
  categories$ : Observable<Categorie[]>;
  idToDelete ;
  constructor(
    private webService:WebRessourceService,
    private router : Router,
  ) { }

  ngOnInit() {
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

  supprimer(id){
    this.idToDelete = id ;
  }
  confirmer(){
    this.webService.deleteCategorie(this.idToDelete).subscribe(res => {
      this.categories$ = this.webService.getCategories();
    });
  }
  modifier(){
    
  }

}
