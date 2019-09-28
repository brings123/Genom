import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import {ActivatedRoute, Router} from '@angular/router';
import { ValeurAbs } from '../valeurAbs';
import { WebRessourceService } from '../web-ressource.service';
import { Location } from '@angular/common';
declare var M:any;
@Component({
  selector: 'app-caracteristique',
  templateUrl: './caracteristique.component.html',
  styleUrls: ['./caracteristique.component.css']
})
export class CaracteristiqueComponent implements OnInit {
  valeur$ : Observable<ValeurAbs[]>
  idCaracteristique ;
  idToDelete;
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
  onBack(){
    this.location.back();
  }
  onClick(){
    this.router.navigate(['/addvaleurabs',this.idCaracteristique]);
  }
  supprimer(id){
    this.idToDelete = id ;
  }
  confirmer(){
    this.webService.deleteValeurAbs(this.idToDelete).subscribe(res => {
      this.valeur$ = this.webService.getValeurAbs(this.idCaracteristique);
    });
  }
}
