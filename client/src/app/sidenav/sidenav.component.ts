import { Component, OnInit } from '@angular/core';
declare var M:any;
@Component({
  selector: 'sidenav',
  templateUrl: './sidenav.component.html',
  styleUrls: ['./sidenav.component.css']
})
export class SidenavComponent implements OnInit {
  public role:string;
  constructor() { }

  ngOnInit() {
    debugger;
    this.role = JSON.parse(JSON.stringify(window.localStorage.getItem('role')));
    //alert(this.role);
    console.log(this.role);
    var elems = document.querySelectorAll('.sidenav');
    const options = {};
   var instances = M.Sidenav.init(elems, options);
  }

}
