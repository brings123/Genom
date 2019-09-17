import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NavbarComponent } from './navbar/navbar.component';
import { SidenavComponent } from './sidenav/sidenav.component';
import { PubnavComponent } from './pubnav/pubnav.component';
import { DocumentCardComponent } from './document-card/document-card.component';
import { DocumentsComponent } from './documents/documents.component';
import { HomeComponent } from './home/home.component';
import { DemandeComponent } from './demande/demande.component';
import { AdminDocumentComponent } from './admin/admin-document/admin-document.component';
import { NewsComponent } from './news/news.component';
import { AddNewsComponent } from './news/addnews/addnews.component';
import { InfoFicheComponent } from './infofiche/infofiche.component';
import { AddFicheComponent } from './infofiche/addfiche/addfiche.component';
import { EventComponent } from './event/event.component';
import { AddEventComponent } from './event/addevent/addevent.component';
import { VideoComponent } from './video/video.component';
import { AddVideoComponent } from './video/addvideo/addvideo.component';
import { LinkComponent } from './link/link.component';
import { AddLinkComponent } from './link/addlink/addlink.component';
import { ContactComponent } from './contact/contact.component';
import { NewContactComponent } from './contact/newContact/newcontact.component';
import { HttpClientModule } from '@angular/common/http';
import { DocumentService } from './document.service';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    SidenavComponent,
    PubnavComponent,
    DocumentCardComponent,
    DocumentsComponent,
    HomeComponent,
    DemandeComponent,
    AdminDocumentComponent,


    NewsComponent,
    AddNewsComponent,
    InfoFicheComponent,
    AddFicheComponent,
    EventComponent,
    AddEventComponent,
    VideoComponent,
    AddVideoComponent,
    LinkComponent,
    AddLinkComponent,
    ContactComponent,
    NewContactComponent,
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {
        path:'documents',
        component:DocumentsComponent
      },
      {
        path:'',
        component:HomeComponent
      },
      {
        path:'demande',
        component:DemandeComponent
      },
      {
        path:'event',
        component:EventComponent
      },
      {
        path:'admin/documents',
        component:AdminDocumentComponent
      },
      {
        path: 'news',
        component: NewsComponent
      },
      {
        path: 'addnews',
        component: AddNewsComponent
      },
      {
        path: 'infofiche',
        component: InfoFicheComponent
      },
      {
        path: 'addfiche',
        component: AddFicheComponent
      },
      {
        path: 'events',
        component: EventComponent
      },
      {
        path: 'addevent',
        component: AddEventComponent
      },
      {
        path: 'videos',
        component: VideoComponent
      },
      {
        path: 'addvideo',
        component: AddVideoComponent
      },
      {
        path: 'links',
        component: LinkComponent
      },
      {
        path: 'addlink',
        component: AddLinkComponent
      },
      {
        path: 'contacts',
        component: ContactComponent
      },
      {
        path: 'newcontact',
        component: NewContactComponent
      },
    ])
  ],
  providers: [ DocumentService ],
  bootstrap: [AppComponent]
})
export class AppModule { }
