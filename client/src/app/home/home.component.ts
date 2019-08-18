import { Component, OnInit } from '@angular/core';
declare var M:any;

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor() { }

  ngOnInit() {
    var elems = document.querySelectorAll('.slider');
    var options = {};
      var instances = M.Slider.init(elems, options);
      var elemsp = document.querySelectorAll('.parallax');
          var instancesp = M.Parallax.init(elemsp, options);
          var elem = document.querySelectorAll('.carousel');
   var instance = M.Carousel.init(elem, options);
  }
}
