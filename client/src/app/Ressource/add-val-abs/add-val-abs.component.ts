import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import {FormControl, Validators, FormBuilder} from '@angular/forms';
import{Router} from '@angular/router'
import { WebRessourceService } from '../web-ressource.service';
import { Observable } from 'rxjs';
import { Categorie } from '../categorie';
import { Location } from '@angular/common';

@Component({
  selector: 'app-add-val-abs',
  templateUrl: './add-val-abs.component.html',
  styleUrls: ['./add-val-abs.component.css']
})
export class AddValAbsComponent implements OnInit {
form;
idCaracteristique;
  constructor(
    private fb:FormBuilder,
    private router : Router,
    private route: ActivatedRoute,
    private webService:WebRessourceService,
    private location : Location
  ) {
    this.form = fb.group({
      name:'',
      description:'',
    })
  }

  ngOnInit() {
    this.idCaracteristique =Number(this.route.snapshot.paramMap.get('id'));
  }

  onSubmit(){
    this.webService.postValeurAbs(this.form.value,this.idCaracteristique).subscribe(res =>  {
      this.router.navigate(['/caracteristique', this.idCaracteristique]);
    });
  }

  onBack(){
    this.location.back();
  }

}
