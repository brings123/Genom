import { Component, OnInit } from '@angular/core';
declare var M:any;
@Component({
  selector: 'app-demande',
  templateUrl: './demande.component.html',
  styleUrls: ['./demande.component.css']
})
export class DemandeComponent implements OnInit, AfterViewInit {

  constructor() { }

  ngOnInit() {
    var elems = document.querySelectorAll('select');
    const options={};
    var instances = M.FormSelect.init(elems, options);
  }
  commercial(){
    
  }

}
