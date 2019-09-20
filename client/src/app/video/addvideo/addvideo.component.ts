import { Component, OnInit } from '@angular/core';
declare var M:any;

@Component({
  selector: 'app-addvideo',
  templateUrl: './addvideo.component.html',
  styleUrls: ['./addvideo.component.css']
})
export class AddVideoComponent implements OnInit{

  constructor() { }

  ngOnInit() {
    document.addEventListener('DOMContentLoaded', function() {
        var elems = document.querySelectorAll('.datepicker');
        const options={};
        var instances = M.Datepicker.init(elems, options);
      });
  }

}
