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

  url = "http://localhost:8083"
  httpOptions = {
    headers : new HttpHeaders({ 'X-Requested-With':  'XMLHttpRequest'})
  };

  constructor(private http:HttpClient) {  }

  getRessources ():Observable<Ressource []> {
    return this.http.get<Ressource[]>(this.url+"/ressources");
  }
  getRessource (id):Observable<Ressource> {
    return this.http.get<Ressource>(this.url+"/ressource/"+id);
  }

  getRessourcesCat (categorie : Categorie):Observable<Ressource []> {
    return this.http.get<Ressource[]>(this.url+"/ressource/categorie/"+categorie.id);
  }

  searchRessource(name:string){
    return this.http.get<Ressource[]>(this.url+"/ressource/name/"+name);
  }

  getCategories ():Observable<Categorie []> {
    return this.http.get<Categorie[]>(this.url+"/categories");
  }
  getCategorie (id):Observable<Categorie> {
    return this.http.get<Categorie>(this.url+"/categorie/"+id);
  }

  getTypeCat (idCat:number): Observable<Type[]> {
    return this.http.get<Type[]>(this.url+"/type/categorie/"+idCat);
  }
  getTypes (): Observable<Type[]> {
    return this.http.get<Type[]>(this.url+"/types");
  }
  getClasseCat (idCat:number): Observable<Classe[]> {
    return this.http.get<Classe[]>(this.url+"/classe/categorie/"+idCat);
  }
  getClasses (): Observable<Classe[]> {
    return this.http.get<Classe[]>(this.url+"/classes");
  }
  getValeurAbs (id:number):Observable<ValeurAbs[]>{
    return this.http.get<ValeurAbs[]>(this.url+"/valeurabs/caracteristique/"+id);
  }
  getValeur (id:number):Observable<Valeur[]>{
    return this.http.get<Valeur[]>(this.url+"/valeur/ressource/"+id);
  }
  getCaracteristique (id:number):Observable<Caracteristique[]>{
    return this.http.get<Caracteristique[]>(this.url+"/caracteristique/categorie/"+id);
  }
  getCaracteristiqueById (id:number):Observable<Caracteristique>{
    return this.http.get<Caracteristique>(this.url+"/caracteristique/"+id);
  }
  getCaracteristiques ():Observable<Caracteristique[]>{
    return this.http.get<Caracteristique[]>(this.url+"/caracteristiques");
  }
  getLocalisation (id):Observable<any[]>{
    return this.http.get<any[]>(this.url+"/localisation/ressource/"+id);
  }
  getImage(id):Observable<any []>{
    return this.http.get<any[]>(this.url+"/image/ressource/"+id);
  }
  getImages():Observable<any []>{
    return this.http.get<any[]>(this.url+"/images");
  }

  postRessource(val):Observable<Ressource>{
    var ressource = {
      "name": val.name,
      "description": val.description,
      "categorie":{"id":val.categorie},
      "classe":{"id":val.classe},
      "type":{"id":val.type}
    }
    return this.http.post<Ressource>(this.url+"/ressource",ressource)
  }

  postValeur (valeur:Valeur){
    this.http.post<Valeur>(this.url+"/valeur",valeur).subscribe(res => {
      console.log(res);
    });
  }

  postLocation (id1 , id2, id3){
    var location = {
      "pays": id1,
      "ville": id2,
      "ressource":{"id":id3}
    }
    this.http.post(this.url+"/localisation",location).subscribe(res =>{
      console.log(res);
    })
  }

  postCaracteristique (val):Observable<any>{
    val.categorie = {"id": val.categorie};
    return this.http.post(this.url+"/caracteristique",val)
  }
  postCaracteristique2 (val):Observable<any>{
    return this.http.post(this.url+"/caracteristique",val)
  }
  postType (val):Observable<any>{
    val.categorie = {"id": val.categorie};
    return this.http.post(this.url+"/type",val)
  }
  postClasse (val):Observable<any>{
    val.categorie = {"id": val.categorie};
    return this.http.post(this.url+"/classe",val)
  }

  postCategorie (val):Observable<any>{
    return this.http.post(this.url+"/categorie",val)
  }

  postValeurAbs (val,id):Observable<any>{
    val.caracteristique = {"id": id};
    console.log(val);
    return this.http.post(this.url+"/valeurabs",val)
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
    return this.http.post(this.url+"/image",img);
  }

  deleteCategorie(id){
    return this.http.delete(this.url+"/categorie/"+id)
  }
  deleteCaracteristique(id){
    /*this.getValeur(id).subscribe(res => {
      res.forEach((item , index) => {
        this.deleteValeur(item.id).subscribe(res => {
          
        });
      });
    });
    this.getValeurAbs(id).subscribe(res => {
      res.forEach((item , index) => {
        this.deleteValeurAbs(item.id).subscribe(res => {

        });
      });
    })*/
    return this.http.delete(this.url+"/caracteristique/"+id)
  }

  deleteValeur(id){
    return this.http.delete(this.url+"/valeur/"+id)
  }
  deleteValeurAbs(id){
    return this.http.delete(this.url+"/valeurabs/"+id)
  }
 

}
