import { Injectable } from '@angular/core';
import { HttpClient ,HttpHeaders,HttpRequest} from '@angular/common/http';
import { Observable, of } from 'rxjs';
import {map} from 'rxjs/operators';
import {Ressource} from './ressource'
import { Categorie } from './categorie';
import { Type } from './type';
import { Classe } from './classe';
import { Valeur } from './valeur';
import { Caracteristique } from './caracteristique';
import { ValeurAbs } from './valeurAbs';
const CLOUDINARY_URL = 	"https://api.cloudinary.com/v1_1/drnkzhxcp/image/upload";
const CLOUDINARY_UPLOUD_PRESET = "pudg1yjq";
@Injectable({
  providedIn: 'root'
})
export class WebRessourceService {

  httpOptions = {
    headers : new HttpHeaders({ 'X-Requested-With':  'XMLHttpRequest'})
  };

  constructor(private http:HttpClient) {  }

  getRessources ():Observable<Ressource []> {
    return this.http.get<Ressource[]>("http://localhost:8081/ressources");
  }
  getRessource (id):Observable<Ressource> {
    return this.http.get<Ressource>("http://localhost:8081/ressource/"+id);
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
  getTypes (): Observable<Type[]> {
    return this.http.get<Type[]>("http://localhost:8081/types");
  }
  getClasseCat (idCat:number): Observable<Classe[]> {
    return this.http.get<Classe[]>("http://localhost:8081/classe/categorie/"+idCat);
  }
  getClasses (): Observable<Classe[]> {
    return this.http.get<Classe[]>("http://localhost:8081/classes");
  }
  getValeurAbs (id:number):Observable<ValeurAbs[]>{
    return this.http.get<ValeurAbs[]>("http://localhost:8081/valeurabs/caracteristique/"+id);
  }
  getCaracteristique (id:number):Observable<Caracteristique[]>{
    return this.http.get<Caracteristique[]>("http://localhost:8081/caracteristique/categorie/"+id);
  }
  getCaracteristiques ():Observable<Caracteristique[]>{
    return this.http.get<Caracteristique[]>("http://localhost:8081/caracteristiques");
  }
  getLocalisation (id):Observable<any[]>{
    return this.http.get<any[]>("http://localhost:8081/localisation/ressource/"+id);
  }

  postRessource(val):Observable<Ressource>{
    var ressource = {
      "name": val.name,
      "description": val.description,
      "categorie":{"id":val.categorie},
      "classe":{"id":val.classe},
      "type":{"id":val.type}
    }
    return this.http.post<Ressource>("http://localhost:8081/ressource",ressource)
  }

  postValeur (valeur:Valeur){
    this.http.post<Valeur>("http://localhost:8081/valeur",valeur).subscribe(res => {
      console.log(res);
    });
  }

  postLocation (id1 , id2, id3){
    var location = {
      "pays": id1,
      "ville": id2,
      "ressource":{"id":id3}
    }
    this.http.post("http://localhost:8081/localisation",location).subscribe(res =>{
      console.log(res);
    })
  }

  postCaracteristique (val):Observable<any>{
    val.categorie = {"id": val.categorie};
    return this.http.post("http://localhost:8081/caracteristique",val)
  }
  postType (val):Observable<any>{
    val.categorie = {"id": val.categorie};
    return this.http.post("http://localhost:8081/type",val)
  }
  postClasse (val):Observable<any>{
    val.categorie = {"id": val.categorie};
    return this.http.post("http://localhost:8081/classe",val)
  }

  postCategorie (val):Observable<any>{
    return this.http.post("http://localhost:8081/categorie",val)
  }

  postValeurAbs (val,id):Observable<any>{
    val.caracteristique = {"id": id};
    console.log(val);
    return this.http.post("http://localhost:8081/valeurabs",val)
  }

  postImageToCloud (img){
    var formData = new FormData();
    formData.append('file',img);
    formData.append('upload_preset',CLOUDINARY_UPLOUD_PRESET)
    formData.append('api_key','646985756989386');
    return this.http.post(CLOUDINARY_URL,formData,this.httpOptions);
  }

  postImage(url,id){
    var img = {
      "url" : url,
      "ressource": {"id":id}
    }
    this.http.post("http://localhost:8081/image",img).subscribe(res => {
      console.log('photo added');
    })
  }
 

}
