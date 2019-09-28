import { Component, OnInit } from '@angular/core';
import { Video } from 'src/app/_models/video';
import { Router } from '@angular/router';
import { PresentationService } from './presentation.service';

@Component({
  selector: 'app-video',
  templateUrl: './video.component.html',
  styleUrls: ['./video.component.css']
})
export class VideoComponent implements OnInit{

  videos$: Video[]

  constructor(private router: Router, private presentationService: PresentationService) { }

  ngOnInit() {
    this.presentationService.getVideos().subscribe(data => {
      debugger;
      this.videos$ = data.result;
      console.log(this.videos$)
    })
  }

}
