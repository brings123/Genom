import { Injectable } from '@angular/core';
import { HttpClient ,HttpHeaders,HttpRequest} from '@angular/common/http';
import { Observable, of } from 'rxjs';
import {map} from 'rxjs/operators';
import {Ressource} from './ressource'

@Injectable({
  providedIn: 'root'
})
export class WebRessourceService {

  httpOptions = {
    headers : new HttpHeaders({ 'Content-Type':  'application/json', 'Access-Control-Allow-Origin': '*'})
  };

  constructor(private http:HttpClient) {  }

  getRessources ():Observable<Ressource []> {
    return this.http.get<Ressource[]>("http://localhost:8081/ressources");
  }
}
