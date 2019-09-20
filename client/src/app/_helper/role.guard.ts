import { Injectable } from '@angular/core';
import { Router, CanActivate, ActivatedRouteSnapshot } from '@angular/router';
import { ApiService } from '../_services/api.service';
import { decode } from 'punycode';
 
@Injectable()
export class RoleGuardService implements CanActivate {
  constructor(public auth: ApiService, public router: Router) {}
  canActivate(route: ActivatedRouteSnapshot): boolean {
    
    let expectedRoleArray = route.data;
     expectedRoleArray = expectedRoleArray.expectedRole;
   
    const token = window.localStorage.getItem('token');
    const role = window.localStorage.getItem('role');
 
    // decode the token to get its payload

    let  expectedRole = '';
 
    for(let i=0; i<expectedRoleArray.length; i++){
      if(expectedRoleArray[i]== role){
        console.log("Roles Matched");
        expectedRole = role;
    
      }
    }
  
    if (token && role == expectedRole) {
      console.log("User permitted to access the route");
      return true;
    }
    return false;
 
    //this.router.navigate(['login']);
  }
}
