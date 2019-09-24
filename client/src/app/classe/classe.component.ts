import { Component, OnInit } from '@angular/core';
import { Location } from '@angular/common';
import { Observable } from 'rxjs';
import { Categorie } from '../Ressource/categorie';
import { FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';
import { WebRessourceService } from '../Ressource/web-ressource.service';
declare var M:any;

@Component({
  selector: 'app-classe',
  templateUrl: './classe.component.html',
  styleUrls: ['./classe.component.css']
})
export class ClasseComponent implements OnInit {

  form;
  categories$ : Observable<Categorie[]>;
    constructor(
      private fb:FormBuilder,
      private router : Router,
      private webService:WebRessourceService,
      private location : Location
    ) { 
      this.form = fb.group({
        name:'',
        description:'',
        categorie:'',
      })
    }
  
    ngOnInit() {
      this.categories$ = this.webService.getCategories();
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
    }
    onSubmit(){
      this.webService.postClasse(this.form.value).subscribe(res => {
        this.router.navigate(['/classes']);
      })
    }
    onBack(){
      this.location.back();
    }
  
  }