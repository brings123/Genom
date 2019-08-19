import { Component, OnInit } from '@angular/core';
declare var M:any;
@Component({
  selector: 'sidenav',
  templateUrl: './sidenav.component.html',
  styleUrls: ['./sidenav.component.css']
})
export class SidenavComponent implements OnInit {

  constructor() { }

  ngOnInit() {
    var elems = document.querySelectorAll('.sidenav');
    const options = {};
   var instances = M.Sidenav.init(elems, options);
  }

}
