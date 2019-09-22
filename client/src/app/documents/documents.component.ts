import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Document } from './model/document';
import { DocumentService } from '../document.service';

@Component({
  selector: 'app-documents',
  templateUrl: './documents.component.html',
  styleUrls: ['./documents.component.css']
})
export class DocumentsComponent implements OnInit {
 documents:Document[];
  constructor(private documentService: DocumentService) { }

  ngOnInit() {
    this.documentService.findAll().subscribe(
      data => {
      this.documents = data;
    });
  }
}
