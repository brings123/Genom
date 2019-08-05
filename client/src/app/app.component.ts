import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Location } from '@angular/common';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
noHome:boolean;
  constructor(private location: Location) {
    console.log(this.location.path());
    if(this.location.path()!=""){
      this.noHome=true;
    }else{
      this.noHome=false;
    }
    console.log(this.noHome);
   }
  title = "Gestionnaire des documents";
}
