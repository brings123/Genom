  
import { Component, OnInit , Inject, EventEmitter} from '@angular/core';
import {Router} from "@angular/router";
import {User} from "../../_models/user"
import {ApiService} from "../../_services/api.service";
declare var M:any;

@Component({
  selector: 'app-list-user',
  templateUrl: './list-user.component.html',
  styleUrls: ['./list-user.component.css']
})

export class ListUserComponent implements OnInit {

  users: User[];
  currentUser : User;
  username : string;
  userToDelete:User;
  

  constructor(private router: Router, private apiService: ApiService) {
     this.username =JSON.stringify(window.localStorage.getItem('username'));
   }

  ngOnInit() {
    if(!window.localStorage.getItem('token')) {
      this.router.navigate(['login']);
      return;
    }
 
  


  
    this.apiService.getUsers()
      .subscribe( data => {
        this.users = data.result;
        console.log(data.result);
      });
      document.addEventListener('DOMContentLoaded', function() {
        var elems = document.querySelectorAll('.modal');
        const options = {};
        var instances = M.Modal.init(elems, options);
      });
      var event;
      setTimeout(function(){
        event = document.createEvent("HTMLEvents");
        event.initEvent("DOMContentLoaded", true, true);
        event.eventName = "DOMContentLoaded";
        document.dispatchEvent(event);
      },800);
    }
    
      
   

  confirmer(){
    debugger;
   
    this.deleteUser(this.userToDelete)
  }
  

  deleteUser(user: User): void {
    this.apiService.deleteUser(user.id)
      .subscribe( data => {
        this.users = this.users.filter(u => u !== user);
      })
    

  };

  editUser(user: User): void {
    window.localStorage.removeItem("editUserId");
    window.localStorage.setItem("editUserId", user.id.toString());
    this.router.navigate(['edit-user']);
  };

  addUser(): void {
    this.router.navigate(['add-user']);
  };

  getUser():User{
    return this.currentUser;
  }
  
  supprimer(user){
    debugger;
    this.userToDelete = user ;
  }

}