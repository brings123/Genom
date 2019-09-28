import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { PresentationService } from 'src/app/_services/presentation.service';

@Component({
  selector: 'app-list-fiche-information',
  templateUrl: './list-fiche-information.component.html',
  styleUrls: ['./list-fiche-information.component.css']
})
export class ListFicheInformationComponent implements OnInit {
   documents$ : Document[]
   constructor(private router: Router, private presentationService: PresentationService) { }

   ngOnInit() {
     this.presentationService.getDocuments().subscribe(data=>{
       debugger; 
       this.documents$ = data.result;
       console.log(this.documents$)
     })
   }
}
