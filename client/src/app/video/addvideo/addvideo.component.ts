import { Component, OnInit } from '@angular/core';
@Component({
  selector: 'app-addvideo',
  templateUrl: './addvideo.component.html',
  styleUrls: ['./addvideo.component.css']
})
export class AddVideoComponent implements OnInit{

  constructor() { }

  ngOnInit() {
    $(document).ready(function () {
      $('.datepicker').datepicker();
    });

    $(document).ready(function () {
      $('input#input_text, textarea#video_description').characterCounter();
    });
  }

}
