import { Component, OnInit } from '@angular/core';
import {WebRessourceService} from '../web-ressource.service'
import { Observable } from 'rxjs';
import { Ressource } from '../ressource';

@Component({
  selector: 'app-ressources',
  templateUrl: './ressources.component.html',
  styleUrls: ['./ressources.component.css']
})
export class RessourcesComponent implements OnInit {

  ressources$ : Observable<Ressource[]>

  constructor(private webService:WebRessourceService) { }

  ngOnInit() {
    this.ressources$ = this.webService.getRessources();
  }

}
