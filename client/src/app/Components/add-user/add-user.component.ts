import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {Router} from "@angular/router";
import { of, Observable } from 'rxjs';
import {ApiService} from "../../_services/api.service";
import { Role } from 'src/app/_models/role';
declare var M:any;

@Component({
  selector: 'app-add-user',
  templateUrl: './add-user.component.html',
  styleUrls: ['./add-user.component.css']
})
export class AddUserComponent implements OnInit {
  
  addForm: FormGroup;
  roles$ : Observable<Role[]>
  constructor(private formBuilder: FormBuilder,private router: Router, private apiService: ApiService) { 
  
  }

  
  

  ngOnInit() {

    if(!window.localStorage.getItem('token')) {
      this.router.navigate(['login']);
      return;
    }
    document.addEventListener('DOMContentLoaded', function() {
      var elems = document.querySelectorAll('select');
      const options={};
      var instances = M.FormSelect.init(elems, options);
    });
    //debugger;
   
   

    this.addForm = this.formBuilder.group({
      username: ['', Validators.required],
      password: ['', Validators.required],
      nom: ['', Validators.required],
      prenom: ['', Validators.required],
      telephone: ['', Validators.required],
      email: ['', Validators.required],
      role:['',Validators.required]
    });
    this.roles$ = this.apiService.getRoles()
    document.addEventListener('DOMContentLoaded', function() {
      setTimeout(function(){
        var elems = document.querySelectorAll('select');
        const options = {};
        var instances = M.FormSelect.init(elems, options);
      },1500);
    });
  
    console.log(this.roles$)
    let ro
    this.roles$.subscribe(data=>{
      //debugger;
      ro = data
      console.log(ro)
    })
    
  }

  

  onSubmit() {
    console.log( this.addForm.value);
   
    this.apiService.createUser(this.addForm.value)
    
      .subscribe( data => {
        this.router.navigate(['list-user']);
      });
  }

}