import { Component, OnInit } from '@angular/core';
import { Location } from '@angular/common';
import { FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';
import { WebRessourceService } from '../web-ressource.service';
declare var M:any;
@Component({
  selector: 'app-categorie',
  templateUrl: './categorie.component.html',
  styleUrls: ['./categorie.component.css']
})
export class CategorieComponent implements OnInit {
  form;
    constructor(
      private fb:FormBuilder,
      private router : Router,
      private webService:WebRessourceService,
      private location : Location
    ) { 
      this.form = fb.group({
        name:'',
        description:''
      })
    }
  
    ngOnInit() {
    }
    onSubmit(){
      this.webService.postCategorie(this.form.value).subscribe(res => {
        this.router.navigate(['/categories']);
      })
    }
    onBack(){
      this.location.back();
    }
  
  }