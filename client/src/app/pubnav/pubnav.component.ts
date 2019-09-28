import { Component, OnInit } from '@angular/core';
declare var M:any;
@Component({
  selector: 'pubnav',
  templateUrl: './pubnav.component.html',
  styleUrls: ['./pubnav.component.css']
})
export class PubnavComponent implements OnInit {

  constructor() { }

  ngOnInit() {
    var elems = document.querySelectorAll('.pubnav');
    const options = {};
   var instances = M.Pubnav.init(elems, options);
  }

}
