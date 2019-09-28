import { Component, OnInit } from '@angular/core';
import { Contact } from 'src/app/_models/contact';
import { Router } from '@angular/router';
import { PresentationService } from 'src/app/_services/presentation.service';

@Component({
  selector: 'app-list-contact',
  templateUrl: './list-contact.component.html',
  styleUrls: ['./list-contact.component.css']
})
export class ListContactComponent implements OnInit {

  contacts$:Contact[]

  constructor(private router: Router, private presentationService: PresentationService) { }

  ngOnInit() {
    this.presentationService.getContacts().subscribe(data=>{
      debugger; 
      this.contacts$ = data.result;
      console.log(this.contacts$)
    })
  }
}
