import { Component, OnInit } from '@angular/core';
declare var M:any;
@Component({
  selector: 'app-addnews',
  templateUrl: './addnews.component.html',
  styleUrls: ['./addnews.component.css']
})
export class AddNewsComponent implements OnInit{

  constructor() { }

  ngOnInit() {
    document.addEventListener('DOMContentLoaded', function() {
        var elems = document.querySelectorAll('.datepicker');
        const options={};
        var instances = M.Datepicker.init(elems, options);
      });


  }

}
