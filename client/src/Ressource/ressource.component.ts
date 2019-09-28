import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import { Ressource } from './ressource';
import { WebRessourceService } from './web-ressource.service';
@Component({
  selector: 'app-ressource',
  templateUrl: './ressource.component.html',
  styleUrls: ['./ressource.component.css']
})
export class RessourceComponent implements OnInit {
  ressource : Ressource;
  localisations: any[];
  constructor(
    private route : ActivatedRoute,
    private webService : WebRessourceService,
  ) { }

  ngOnInit() {
   var id = Number(this.route.snapshot.paramMap.get('id'));
   this.webService.getLocalisation(id).subscribe(res => {
    this.localisations = res;
    console.log(this.localisations);
   });
  }

}
