import { Component, OnInit } from '@angular/core';
import { Location } from '@angular/common';
import { Caracteristique } from '../Ressource/caracteristique';
import { ActivatedRoute, Router } from '@angular/router';
import { WebRessourceService } from '../Ressource/web-ressource.service';
@Component({
  selector: 'app-caracteristique-update',
  templateUrl: './caracteristique-update.component.html',
  styleUrls: ['./caracteristique-update.component.css']
})
export class CaracteristiqueUpdateComponent implements OnInit {
  caracteristique : Caracteristique = new Caracteristique();
    constructor(
      private route : ActivatedRoute,
      private router : Router,
      private webService:WebRessourceService,
      private location : Location
    ) { }
  
    ngOnInit() {
      var id = Number(this.route.snapshot.paramMap.get('id'));
      this.webService.getCaracteristiqueById(id).subscribe(res => {
        this.caracteristique = res;
      });
    }
    update(){
      this.webService.postCaracteristique2(this.caracteristique).subscribe(res => {
        this.router.navigate(['/caracteristiques']);
      });
    }
    onBack(){
      this.location.back();
    }
  
  }