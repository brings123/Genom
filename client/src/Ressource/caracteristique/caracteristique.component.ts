import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import {ActivatedRoute, Router} from '@angular/router';
import { ValeurAbs } from '../valeurAbs';
import { WebRessourceService } from '../web-ressource.service';
import { Location } from '@angular/common';

@Component({
  selector: 'app-caracteristique',
  templateUrl: './caracteristique.component.html',
  styleUrls: ['./caracteristique.component.css']
})
export class CaracteristiqueComponent implements OnInit {
  valeur$ : Observable<ValeurAbs[]>
  idCaracteristique ;
  constructor(
    private route : ActivatedRoute,
    private webService : WebRessourceService,
    private location : Location ,
    private router : Router,
  ) { }

  ngOnInit() {
    var id = Number(this.route.snapshot.paramMap.get('id'));
    this.idCaracteristique = id;
    this.valeur$ = this.webService.getValeurAbs(id);
  }
  onBack(){
    this.location.back();
  }
  onClick(){
    this.router.navigate(['/addvaleurabs',this.idCaracteristique]);
  }
}
