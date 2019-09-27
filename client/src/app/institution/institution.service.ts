import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {User} from "../_models/user";
import {Observable, BehaviorSubject} from "rxjs/index";
import {ApiResponse} from "../_models/api.response";
import { Router } from '@angular/router';
import { Role } from '../_models/role';
import { Validators } from '@angular/forms';

@Injectable()
export class InstitutionService {
    
    public currentUser: Observable<ApiResponse>;
    public username: String;
    users : any;
    currentDate :string;
    
    
    constructor(private http: HttpClient,private router: Router) {
     
    }

    baseUrl: string = 'http://localhost:8083/';
  getInstitutions() : Observable<ApiResponse> {
    return this.http.get<ApiResponse>(this.baseUrl+"Institution/all");
  }
  createInstitution(val): Observable<ApiResponse> {
      debugger;
      var institution = {
          "name": val.nom,
          "description":val.description,
          "email":val.email,
          "telephone":val.telephone,
          "adresse":val.adresse,
          "siteWeb":val.siteweb,
      }
      debugger;
      //this.router.navigate.
    return this.http.post<ApiResponse>(this.baseUrl+"Institutions/new", institution);
  }
 
}
