import { Injectable } from '@angular/core';
import { HttpClient ,HttpHeaders,HttpRequest} from '@angular/common/http';
import { Observable, of } from 'rxjs';
import {map} from 'rxjs/operators';
import {Ressource} from './ressource'
import { Categorie } from './categorie';
import { Type } from '@angular/compiler';

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

  getRessourcesCat (categorie : Categorie):Observable<Ressource []> {
    return this.http.get<Ressource[]>("http://localhost:8081/ressource/categorie/"+categorie.id);
  }

  searchRessource(name:string){
    return this.http.get<Ressource[]>("http://localhost:8081/ressource/name/"+name);
  }

  getCategories ():Observable<Categorie []> {
    return this.http.get<Categorie[]>("http://localhost:8081/categories");
  }

  getTypeCat (idCat:number): Observable<Type[]> {
    return this.http.get<Type[]>("http://localhost:8081/type/categorie/"+idCat);
  }

  postRessource(val){
    var ressource = {
      "name": val.name,
      "description": val.description,
      "categorie":{"id":val.categorie},
      "classe":{"id":val.classe},
      "type":{"id":val.type}
    }
    this.http.post("http://localhost:8081/ressource",ressource)
  }
 

}
