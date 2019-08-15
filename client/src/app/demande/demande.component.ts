import { Component, OnInit } from '@angular/core';
declare var M:any;
@Component({
  selector: 'app-demande',
  templateUrl: './demande.component.html',
  styleUrls: ['./demande.component.css']
})
export class DemandeComponent implements OnInit{

  constructor() { }

  ngOnInit() {
    var elems = document.querySelectorAll('select');
    const options={};
    var instances = M.FormSelect.init(elems, options);
  }
  commercial(){
    var d = document.getElementById("scientifique");
    d.className += " none";
    var s = document.getElementById("commercial");
    s.classList.remove("none");
  }
  scientifique(){
    var d = document.getElementById("commercial");
    d.className += " none";
    var s = document.getElementById("scientifique");
    s.classList.remove("none");
  }

}
