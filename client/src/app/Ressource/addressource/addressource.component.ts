import { Component, OnInit } from '@angular/core';
import {FormControl, Validators, FormBuilder} from '@angular/forms';
import{Router} from '@angular/router'
import { Categorie } from '../categorie';
import { WebRessourceService } from '../web-ressource.service';
import { Observable } from 'rxjs';
import { Type } from '@angular/compiler';
declare var M:any;
@Component({
  selector: 'app-addressource',
  templateUrl: './addressource.component.html',
  styleUrls: ['./addressource.component.css']
})
export class AddressourceComponent implements OnInit {
  form;
  idSelectedCat : number = null;
  categories$ : Observable<Categorie[]>;
  type$ : Observable<Type[]>;
  constructor(
    private fb:FormBuilder,
    private router : Router,
    private webService:WebRessourceService
  ) { 
    this.form = fb.group({
      name:'',
      description:'',
      categorie:'',
      classe:'',
      type:''
    })
  }

  ngOnInit() {
    this.categories$ = this.webService.getCategories();
    document.addEventListener('DOMContentLoaded', function() {
      setTimeout(function(){
        var elems = document.querySelectorAll('select');
        const options = {};
        var instances = M.FormSelect.init(elems, options);
      },500);
    });
  }

  onSubmit(){
    this.webService.postRessource(this.form.value);
    this.router.navigate(['/addressourceval',this.idSelectedCat]);
  }

  selectCat(id : number){
    var event ;
    this.idSelectedCat = id ;
    this.type$ = this.webService.getTypeCat(this.idSelectedCat);
    setTimeout(function(){
      event = document.createEvent("HTMLEvents");
      event.initEvent("DOMContentLoaded", true, true);
      event.eventName = "DOMContentLoaded";
      document.dispatchEvent(event);
    },500);
    
  }

}
