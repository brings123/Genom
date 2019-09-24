import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { ActivatedRoute, Router } from '@angular/router';
import { Document } from './model/document';
import { DocumentService } from '../document.service';
declare var M:any;
@Component({
  selector: 'app-documents',
  templateUrl: './documents.component.html',
  styleUrls: ['./documents.component.css']
})
export class DocumentsComponent implements OnInit {
  currentInput;
  documents:Document[];
 document: Document;
  constructor(private route: ActivatedRoute, private router: Router, private documentService: DocumentService) { 
    this.document = new Document();
    this.document.createur = 1;
    
  }
  onFileSelected(event) {
        console.log(this.currentInput);
        this.document.nom_document = this.currentInput;
        this.document.chemin_document = this.currentInput;
        console.log(this.document);
    }
  onSubmit() {
    this.documentService.save(this.document).subscribe(result => this.gotoDocumentList());
  }

  gotoDocumentList() {
    this.router.navigate(['/documents']);
  }
  ngOnInit() {
    this.documentService.findAll().subscribe(
      data => {
      this.documents = data;
    });
    document.addEventListener('DOMContentLoaded', function() {
      var elems = document.querySelectorAll('.modal');
      const options = {};
      var instances = M.Modal.init(elems, options);
    });
  
  }
}
