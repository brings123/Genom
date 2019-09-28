import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {User} from "../_models/user";
import {Observable, BehaviorSubject} from "rxjs/index";
import {ApiResponse} from "../_models/api.response";
import { UserService } from './user.service';
import { Router } from '@angular/router';
import { Role } from '../_models/role';
import { Validators } from '@angular/forms';
import { DatePipe } from '@angular/common';

@Injectable()
export class PresentationService {
    
    public currentUser: Observable<ApiResponse>;
    public username: String;
    users : any;
    currentDate :string;
    myDate = new Date();
    
    
    constructor(private http: HttpClient,private router: Router,private datePipe: DatePipe) {
      this.currentDate = this.datePipe.transform(this.myDate, 'yyyy-MM-dd');

       
    }

    baseUrl: string = 'http://localhost:8083/';



  
 

  getContacts() : Observable<ApiResponse> {
    return this.http.get<ApiResponse>(this.baseUrl+"contacts/all");
  }
  

 

  createContact(val): Observable<ApiResponse> {
      debugger;
      var contact = {
          "name": val.name,
          "titre":val.titre,
          "email":val.email,
          "telephone":val.telephone,
          "adresse":val.adresse,
          "valide" :false,
          "creator":{"id":JSON.parse(window.localStorage.getItem('user_id'))}
      }
    
    return this.http.post<ApiResponse>(this.baseUrl+"contacts/new", contact);
  }

  createDocument(val):Observable<ApiResponse>{
    console.log(val)
    debugger;


    this.currentDate = this.datePipe.transform(this.myDate, 'yyyy-MM-dd');

    console.log(this.currentDate);
    var document = {
      "titre" : val.titre,
      "description": val.htmlContent,
      "date_ajout": this.currentDate,
      "valide" :false,
      "creator":{"id":JSON.parse(window.localStorage.getItem('user_id'))}

    }
      return this.http.post<ApiResponse>(this.baseUrl+"document",document);
  }

  
  getDocuments() : Observable<ApiResponse> {
    return this.http.get<ApiResponse>(this.baseUrl+"documents");
  }
  getEvents() : Observable<ApiResponse> {
    return this.http.get<ApiResponse>(this.baseUrl+"events/all");
  }
  
  

  createEvent(val):Observable<ApiResponse>{
    debugger;
    let start = new Date(val.start_evnt)
    let end = new Date(val.end_evnt)

    
    var evenement = {
      "titre" : val.titre,
      "start_evnt":  val.start_evnt,
      "end_evnt": val.end_evnt,
      "valide" :false,
      "creator":{"id":JSON.parse(window.localStorage.getItem('user_id'))}

    }
      return this.http.post<ApiResponse>(this.baseUrl+"event",evenement);
  }
 
 
}
