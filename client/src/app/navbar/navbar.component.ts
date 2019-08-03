import { Component, OnInit } from '@angular/core';
import { AppComponent } from './../app.component';

@Component({
  selector: 'navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {
 title = "Client";
  constructor() { }

  ngOnInit() {
  }
  Accueil(event){
  }

}
