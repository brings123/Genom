import { Component, OnInit } from '@angular/core';
@Component({
  selector: 'app-addfiche',
  templateUrl: './addfiche.component.html',
  styleUrls: ['./addfiche.component.css']
})
export class AddFicheComponent implements OnInit{

  constructor() { }

  ngOnInit() {

    $(document).ready(function () {
      $('.datepicker').datepicker();
    });

  }

}
