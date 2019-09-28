import { Component, OnInit } from '@angular/core';
import { Contact } from 'src/app/_models/contact';
import { PresentationService } from 'src/app/_services/presentation.service';
import { Router } from '@angular/router';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-add-contact',
  templateUrl: './add-contact.component.html',
  styleUrls: ['./add-contact.component.css']
})
export class AddContactComponent implements OnInit {
  addForm: FormGroup;


  constructor(private formBuilder: FormBuilder,private router: Router,private presentationService :PresentationService) { }

  ngOnInit() {
    if(!window.localStorage.getItem('token')) {
      this.router.navigate(['/']);
      return;
    }
  
    this.addForm = this.formBuilder.group({
      name: ['', Validators.required],
      titre: ['', Validators.required],
      email: ['', Validators.required],
      telephone: ['', Validators.required],
      adresse: ['', Validators.required],
    });
  }
   
  onSubmit() {
    debugger;
    console.log( this.addForm.value);
   
    this.presentationService.createContact(this.addForm.value)
    
      .subscribe( data => {
        this.router.navigate(['list-contact']);
      });
  }
}
