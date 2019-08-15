import { Component, OnInit } from '@angular/core';
import { AppComponent } from './../app.component';
declare var M:any;
@Component({
  selector: 'navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {
 title = "Client";
  constructor() { }

  ngOnInit() {
    var elems = document.querySelectorAll('.sidenav');
    const options = {};
    var instances = M.Sidenav.init(elems, options);
  }
  Accueil(event){
  }

}
