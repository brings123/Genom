import { Component, OnInit } from '@angular/core';
import { Video } from 'src/app/_models/video';
import { PresentationService } from '../presentation.service';
import { Router } from '@angular/router';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

declare var M:any;

@Component({
  selector: 'app-addvideo',
  templateUrl: './addvideo.component.html',
  styleUrls: ['./addvideo.component.css']
})
export class AddVideoComponent implements OnInit {

  addForm: FormGroup;

  constructor(private formBuilder: FormBuilder, private router: Router, private presentationService: PresentationService) { }


  ngOnInit() {
    if (!window.localStorage.getItem('token')) {
      this.router.navigate(['/']);
      return;
    }

    
    document.addEventListener('DOMContentLoaded', function() {
        var elems = document.querySelectorAll('.datepicker');
        const options={};
        var instances = M.Datepicker.init(elems, options);
      });

    this.addForm = this.formBuilder.group({
      titre: ['', Validators.required],
      date: ['', Validators.required],
      description: ['', Validators.required],
      url: ['', Validators.required],
    });

  }

  onSubmit() {
    debugger;
    console.log(this.addForm.value);

    this.presentationService.createVideo(this.addForm.value)

      .subscribe(data => {
        this.router.navigate(['videos']);
      });
  }

}
