import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from "../_models/user";
import { Observable, BehaviorSubject } from "rxjs/index";
import { ApiResponse } from "../_models/api.response";
import { Router } from '@angular/router';
import { Role } from '../_models/role';
import { Validators } from '@angular/forms';
import { DatePipe } from '@angular/common';

@Injectable()
export class PresentationService {

    public currentUser: Observable<ApiResponse>;
    public username: String;
    users: any;
    currentDate: string;
    myDate = new Date();


    constructor(private http: HttpClient, private router: Router, private datePipe: DatePipe) {
        this.currentDate = this.datePipe.transform(this.myDate, 'yyyy-MM-dd');


    }

    baseUrl: string = 'http://localhost:8083/';


    getVideos(): Observable<ApiResponse> {
        return this.http.get<ApiResponse>(this.baseUrl + "videos/all");
    }


    createVideo(val): Observable<ApiResponse> {
        console.log(val)
        debugger;
        this.currentDate = this.datePipe.transform(this.myDate, 'yyyy-MM-dd');

        console.log(this.currentDate);
        var video = {
            "titre": val.titre,
            "date": this.currentDate,
            "description": val.description,
            "url": val.url,
            "valide": false,
            "creator": { "id": JSON.parse(window.localStorage.getItem('user_id')) }
        }

        return this.http.post<ApiResponse>(this.baseUrl + "videos/new", video);
    }

  


}
