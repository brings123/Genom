import { Component, OnInit } from '@angular/core';
import { Location } from '@angular/common';
import { Categorie } from '../categorie';
import { Router, ActivatedRoute } from '@angular/router';
import { WebRessourceService } from '../web-ressource.service';
@Component({
  selector: 'app-categorie-update',
  templateUrl: './categorie-update.component.html',
  styleUrls: ['./categorie-update.component.css']
})
export class CategorieUpdateComponent implements OnInit {
  form;
  categorie : Categorie = new Categorie();
    constructor(
      private route : ActivatedRoute,
      private router : Router,
      private webService:WebRessourceService,
      private location : Location
    ) { }
  
    ngOnInit() {
      var id = Number(this.route.snapshot.paramMap.get('id'));
      this.webService.getCategorie(id).subscribe(res => {
        this.categorie = res;
      });
    }
    update(){
      console.log(this.categorie);
      this.webService.postCategorie(this.categorie).subscribe(res => {
        this.router.navigate(['/categories']);
      });
    }
    onBack(){
      this.location.back();
    }
  
  }