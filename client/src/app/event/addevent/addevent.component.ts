import { Component, OnInit } from '@angular/core';
@Component({
  selector: 'app-addevent',
  templateUrl: './addevent.component.html',
  styleUrls: ['./addevent.component.css']
})
export class AddEventComponent implements OnInit{

  constructor() { }

  ngOnInit() {
    $(document).ready(function () {
      $('.datepicker').datepicker();
    });

    $(document).ready(function () {
      $('input#input_text, textarea#event_description').characterCounter();
    });
  }

}
