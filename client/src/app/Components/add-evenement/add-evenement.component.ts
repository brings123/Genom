import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { PresentationService } from 'src/app/_services/presentation.service';
declare var M:any;

@Component({
  selector: 'app-add-evenement',
  templateUrl: './add-evenement.component.html',
  styleUrls: ['./add-evenement.component.css']
})
export class AddEvenementComponent implements OnInit {
  addForm: FormGroup;
  


  constructor(private formBuilder: FormBuilder,private router: Router,private presentationService :PresentationService) { }

  ngOnInit() {
    if(!window.localStorage.getItem('token')) {
      this.router.navigate(['/']);
      return;
    }
    document.addEventListener('DOMContentLoaded', function() {
      var elems = document.querySelectorAll('.datepicker');
      const options={};
      var instances = M.Datepicker.init(elems, options);
     
    });
  
    
    this.addForm = this.formBuilder.group({
      titre: ['', Validators.required],
      start_evnt: ['', Validators.required],
      end_evnt: ['', Validators.required],
    });
 
  }
    
   
  onSubmit() {
 
    debugger;
    console.log( this.addForm.value);
   
    this.presentationService.createEvent(this.addForm.value)
    
      .subscribe( data => {
        this.router.navigate(['evenement']);
      });
  }
}
