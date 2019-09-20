import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Document } from './documents/model/document';
import { Observable } from 'rxjs';

@Injectable()
export class DocumentService {

  private usersUrl: string;

  constructor(private http: HttpClient) {
    this.usersUrl = 'http://localhost:8081/lot1/allDocuments/unordered';
  }

  public findAll(): Observable<Document[]> {
    return this.http.get<Document[]>(this.usersUrl);
  }
}
