import { Component, ViewChild } from '@angular/core';
import { FullCalendarComponent } from '@fullcalendar/angular';
import { EventInput } from '@fullcalendar/core';
import dayGridPlugin from '@fullcalendar/daygrid';
import timeGrigPlugin from '@fullcalendar/timegrid';
import interactionPlugin from '@fullcalendar/interaction'; // for dateClick
import { Router } from '@angular/router';
import { PresentationService } from 'src/app/_services/presentation.service';
import { Events } from 'src/app/_models/event';

@Component({
  selector: 'app-evenement',
  templateUrl: './evenement.component.html',
  styleUrls: ['./evenement.component.css']
})
export class EvenementComponent {

  @ViewChild('calendar',{static: false}) calendarComponent: FullCalendarComponent; // the #calendar in the template
  events$ : Events[]; 
  eventsTrue:Events[];
  evnt:Events;
  calendarVisible = true;
  calendarPlugins = [dayGridPlugin, timeGrigPlugin, interactionPlugin];
  calendarWeekends = true;
  calendarEvents: EventInput[] = [
    { title: 'Event Now', start: new Date() }
  ];

 

  constructor(private router: Router, private presentationService: PresentationService) { }

  ngOnInit() {
    this.presentationService.getEvents().subscribe(data=>{
      debugger; 
      this.events$ = data.result;
      console.log(this.events$.filter); //use i instead of 0

    });

    
        
  }
  

  toggleVisible() {
    this.calendarVisible = !this.calendarVisible;
  }

  toggleWeekends() {
    this.calendarWeekends = !this.calendarWeekends;
  }

  gotoPast() {
    let calendarApi = this.calendarComponent.getApi();
    calendarApi.gotoDate('2000-01-01'); // call a method on the Calendar object
  }

  handleDateClick(arg) {
    if (confirm('Would you like to add an event to ' + arg.dateStr + ' ?')) {
      this.calendarEvents = this.calendarEvents.concat({ // add new event data. must create new array
        title: 'New Event',
        start: arg.date,
        end:'2019-09-26'
      })
    }
  }

}
