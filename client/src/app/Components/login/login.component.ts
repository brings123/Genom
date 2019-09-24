import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {Router} from "@angular/router";
import {ApiService} from "../../_services/api.service";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  noHome:boolean;
  private roles : string ;
  loginForm: FormGroup;
  invalidLogin: boolean = false;
  constructor(private formBuilder: FormBuilder ,private router: Router, private apiService: ApiService) { }

  onSubmit() {
    if (this.loginForm.invalid) {
      debugger;
      return;

    }
    const loginPayload = {
      username: this.loginForm.controls.username.value,
      password: this.loginForm.controls.password.value
    }
    this.apiService.getUserByUsername(loginPayload.username).subscribe(
      user => {
        debugger;
        this.roles = user.result.roles.name;
        console.log(this.roles)
        window.localStorage.setItem('role',user.result.roles.name);
      }
    );
    this.apiService.login(loginPayload).subscribe(data => {
      debugger;
      if(data.status === 200) {
        window.localStorage.setItem('token', data.result.token);
        window.localStorage.setItem('username',data.result.username);
        debugger;
        if(this.roles === "ADMIN"){
          this.router.navigate(['list-user']);
         }
        else{
          this.router.navigate(['add-user']);
    }
       // window.localStorage.setItem('role',data.result.roles.name);     
        //console.log(JSON.stringify(window.localStorage.getItem('token')));
        //
      }else {
        this.invalidLogin = true;
        alert(data.message);
      }
    });
    
    
  }

  ngOnInit() {

    
    window.localStorage.removeItem('username')
    window.localStorage.removeItem('role') 
    window.localStorage.removeItem('token');
    this.loginForm = this.formBuilder.group({
      username: ['', Validators.compose([Validators.required])],
      password: ['', Validators.required]
    });
    
  }



}