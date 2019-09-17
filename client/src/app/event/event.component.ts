import { Component, OnInit } from '@angular/core';
declare var M:any;
@Component({
  selector: 'app-event',
  templateUrl: './event.component.html',
  styleUrls: ['./event.component.css']
})
export class EventComponent implements OnInit{

  constructor() { }

  ngOnInit() {
    document.addEventListener('DOMContentLoaded', function() {
      var elems = document.querySelectorAll('.collapsible');
      const options={};
      var instances = M.Collapsible.init(elems, options);
    });

  }

}
