import { Component, OnInit } from '@angular/core';
@Component({
  selector: 'app-addnews',
  templateUrl: './addnews.component.html',
  styleUrls: ['./addnews.component.css']
})
export class AddNewsComponent implements OnInit{

  constructor() { }

  ngOnInit() {
    $(document).ready(function () {
      $('.datepicker').datepicker();
    });

    $(document).ready(function () {
      $('input#input_text, textarea#news_description').characterCounter();
    });

  }

}
