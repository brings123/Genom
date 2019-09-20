import { Component, OnInit } from '@angular/core';
import { AppComponent } from './../app.component';
import { ApiService } from '../_services/api.service';
declare var M:any;
@Component({
  selector: 'navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {
 title = "Client";
  constructor(private apiService: ApiService) { }

  ngOnInit() {
    var elems = document.querySelectorAll('.sidenav');
    const options = {};
    var instances = M.Sidenav.init(elems, options);
  }
  Accueil(event){
  }

}
