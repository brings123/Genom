import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { InstitutionService } from '../institution.service';

@Component({
  selector: 'app-add-institution',
  templateUrl: './add-institution.component.html',
  styleUrls: ['./add-institution.component.css']
})
export class AddInstitutionComponent implements OnInit {

  constructor(private formBuilder: FormBuilder,private router: Router,private institutionService :InstitutionService) { }
  addForm: FormGroup;
  ngOnInit() {
    
    
  
    this.addForm = this.formBuilder.group({
      nom: ['', Validators.required],
      description: ['', Validators.required],
      email: ['', Validators.required],
      telephone: ['', Validators.required],
      adresse: ['', Validators.required],
      siteweb:['', Validators.required]
    });
  }
   
  onSubmit() {
    debugger;
    console.log( this.addForm.value);
   
    this.institutionService.createInstitution(this.addForm.value)
    
      .subscribe( data => {
        this.router.navigate(['list-institution']);
      });
  }

}
