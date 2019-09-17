import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import {map} from 'rxjs/operators';
import {Ressource} from './ressource'

@Injectable({
  providedIn: 'root'
})
export class WebRessourceService {

  constructor(private http:HttpClient) {  }

  getRessources ():Observable<Ressource []> {
    return this.http.get<Ressource[]>("http://localhost:8081/ressources");
  }
}
