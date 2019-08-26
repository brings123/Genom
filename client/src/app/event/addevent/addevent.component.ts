import { Component, OnInit } from '@angular/core';
var M: any
@Component({
  selector: 'app-addevent',
  templateUrl: './addevent.component.html',
  styleUrls: ['./addevent.component.css']
})
export class AddEventComponent implements OnInit{

  constructor() { }

  ngOnInit() {

    document.addEventListener('DOMContentLoaded', function () {
      var elems = document.querySelectorAll('.datepicker');
      const options = {};
      var instances = M.Collapsible.init(elems, options);
    });

  }

}
