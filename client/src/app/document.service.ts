import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Document } from './documents/model/document';
import { Observable } from 'rxjs';

@Injectable()
export class DocumentService {

  private usersUrl: string;
  private addDocUrl:string;

  constructor(private http: HttpClient) {
    this.usersUrl = 'http://localhost:8083/lot1/allDocuments/unordered';
    this.addDocUrl = 'http://localhost:8083/lot1/add_document';
  }

  public findAll(): Observable<Document[]> {
    return this.http.get<Document[]>(this.usersUrl);
  }
  public save(document: Document) {
    console.log(document);
    return this.http.post<Document>(this.addDocUrl, document);
  }
}
