import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {User} from "../_models/user";
import {Observable, BehaviorSubject} from "rxjs/index";
import {ApiResponse} from "../_models/api.response";
import { UserService } from './user.service';
import { Router } from '@angular/router';
import { Role } from '../_models/role';

@Injectable()
export class ApiService {
    
    public currentUser: Observable<ApiResponse>;
    public username: String;
    users : any;
    constructor(private http: HttpClient,private router: Router) {
       
        this.username = window.localStorage.getItem('username');
       // this.username.replace(/[^a-zA-Z ]/g, "");
       
    }

    baseUrl: string = 'http://localhost:8083/users/';



    
  login(loginPayload) : Observable<ApiResponse> {
    return this.http.post<ApiResponse>('http://localhost:8083/' + 'auth/login', loginPayload);
  }
 

  getUsers() : Observable<ApiResponse> {
    return this.http.get<ApiResponse>(this.baseUrl);
  }
  getUserById(id: number): Observable<ApiResponse> {
    return this.http.get<ApiResponse>(this.baseUrl + id);
  }
  getUserByUsername(username: String): Observable<ApiResponse> {
    console.log(username)
    return this.http.get<ApiResponse>(this.baseUrl +"username/"+username);
  }

  getRoles():Observable<Role[]>{
    return this.http.get<Role[]>('http://localhost:8083/roles/all');
  }

 

  getCurrentUser():any{       
     this.getUserByUsername(this.username)
      .subscribe(user =>{
        this.currentUser = user.result;
      });      
    
     this.users =this.currentUser;
    return this.users;
  }

  createUser(val): Observable<ApiResponse> {
    var user ={
      "username": val.username,
      "password":val.password,
      "nom":val.nom,
      "prenom":val.prenom,
      "telephone" :val.telephone,
      "email":val.email,
      "roles":{"id":val.role}

    }
    return this.http.post<ApiResponse>(this.baseUrl+"signup", user);
  }

 /**  updateUser(user: User): Observable<ApiResponse> {
    return this.http.put<ApiResponse>(this.baseUrl + user.id, user);
 }
 */

  deleteUser(id: number): Observable<ApiResponse> {
    return this.http.delete<ApiResponse>(this.baseUrl+"delete/" + id);
  }

  loggedIn() {
    return !!localStorage.getItem('token')    
  }

  logoutUser() {
    localStorage.removeItem('token')
    localStorage.removeItem('username')
    localStorage.removeItem('user_id')
    localStorage.removeItem('role') 
    this.router.navigate(['/'])
  }
 
}
