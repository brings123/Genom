import { Component, OnInit } from '@angular/core';
declare var M:any;
@Component({
  selector: 'app-addlink',
  templateUrl: './addlink.component.html',
  styleUrls: ['./addlink.component.css']
})
export class AddLinkComponent implements OnInit{

  constructor() { }

  ngOnInit() {
    document.addEventListener('DOMContentLoaded', function() {
        var elems = document.querySelectorAll('.datepicker');
        const options={};
        var instances = M.Datepicker.init(elems, options);
      });
  }

}
