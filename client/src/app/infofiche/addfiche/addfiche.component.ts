import { Component, OnInit } from '@angular/core';
declare var M:any;
@Component({
  selector: 'app-addfiche',
  templateUrl: './addfiche.component.html',
  styleUrls: ['./addfiche.component.css']
})
export class AddFicheComponent implements OnInit{

  constructor() { }

  ngOnInit() {

    document.addEventListener('DOMContentLoaded', function() {
        var elems = document.querySelectorAll('.datepicker');
        const options={};
        var instances = M.Datepicker.init(elems, options);
      });

  }

}
