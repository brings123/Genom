import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, FormBuilder, Validators } from '@angular/forms';
import { AngularEditorConfig } from '@kolkov/angular-editor';
import { Router } from '@angular/router';
import { PresentationService } from 'src/app/_services/presentation.service';
declare var M:any;
@Component({
  selector: 'app-add-fiche-information',
  templateUrl: './add-fiche-information.component.html',
  styleUrls: ['./add-fiche-information.component.css']
})
export class AddFicheInformationComponent implements OnInit {
  editorForm : FormGroup
  htmlContent = '';

  editorConfig: AngularEditorConfig = {
    editable: true,
    spellcheck: true,
    height: '15rem',
    minHeight: '5rem',
    placeholder: 'Enter text here...',
    translate: 'no',   
    defaultFontName: 'Arial',
    customClasses: [
      {
        name: "quote",
        class: "quote",
      },
      {
        name: 'redText',
        class: 'redText'
      },
      {
        name: "titleText",
        class: "titleText",
        tag: "h1",
      },
    ]
  };
   constructor(private formBuilder: FormBuilder,private router: Router,private presentationService :PresentationService) { }
 

  ngOnInit() {
   
      if(!window.localStorage.getItem('token')) {
        this.router.navigate(['/']);
        return; 
        
      }
      this.editorForm = this.formBuilder.group({
        titre: ['', Validators.required],
        htmlContent: ['', Validators.required],
      });
  }
  onSubmit() {
    console.log( this.editorForm.value);
   
    this.presentationService.createDocument(this.editorForm.value)
    
      .subscribe( data => {
        this.router.navigate(['add-fiche-information']);
      });
  }
}


