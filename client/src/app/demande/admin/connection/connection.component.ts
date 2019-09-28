import { Component, OnInit } from '@angular/core';
declare var M:any;
@Component({
  selector: 'app-connection',
  templateUrl: './connection.component.html',
  styleUrls: ['./connection.component.css']
})
export class ConnectionComponent implements OnInit {

  constructor() { }

  ngOnInit() {
    var elems = document.querySelectorAll('select');
    const options={};
    var instances = M.FormSelect.init(elems, options);
    document.addEventListener('DOMContentLoaded', function() {
      var elems = document.querySelectorAll('.modal');
      const options = {};
      var instances = M.Modal.init(elems, options);
    });
  
  }

}
