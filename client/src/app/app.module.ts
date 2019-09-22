import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule,ReactiveFormsModule } from '@angular/forms'
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

import { FormsModule, ReactiveFormsModule } from '@angular/forms';


import {HTTP_INTERCEPTORS, HttpClientModule} from "@angular/common/http";
import { LoginComponent } from './Components/login/login.component';
import { AlertComponent } from './Components/alert/alert.component';
import { RegisterComponent } from './Components/register/register.component';
import { AddUserComponent } from './Components/add-user/add-user.component';
import { EditUserComponent } from './Components/edit-user/edit-user.component';
import { ListUserComponent } from './Components/list-user/list-user.component';
import { ApiService } from './_services/api.service';
import { TokenInterceptor } from './_helper/interceptor';
import { RoleGuardService } from './_helper/role.guard';



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
import { RessourcesComponent } from './Ressource/ressources/ressources.component';
import { RessourceComponent } from './Ressource/ressource.component';
import { AddressourceComponent } from './Ressource/addressource/addressource.component';
import { AddressourcevalComponent } from './Ressource/addressourceval/addressourceval.component';
import { LoginComponent } from './login/login.component';
import { SingupComponent } from './singup/singup.component';


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
    LoginComponent,
    AlertComponent,
    RegisterComponent,
    AddUserComponent,
    EditUserComponent,
    ListUserComponent



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
    RessourcesComponent,
    RessourceComponent,
    AddressourceComponent,
    AddressourcevalComponent,
  
    SingupComponent

  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule,

    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,

    ReactiveFormsModule,

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
      
      { path: 'login', component: LoginComponent , },
      { path: 'add-user', component: AddUserComponent, },
      { path: 'list-user', component: ListUserComponent ,},
      { path: 'edit-user', component: EditUserComponent },
      {path : '', component : LoginComponent},
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
      {
        path: 'ressources',
        component: RessourcesComponent
      },
      {
        path: 'addressource',
        component: AddressourceComponent
      },
      {
        path: 'addressourceval/:id',
        component: AddressourcevalComponent
      },
    
    {
        path: 'login',
        component: LoginComponent
      },
      {
        path: 'singup',
        component: SingupComponent
      },
    ])
  ],
  providers: [ApiService, {provide: HTTP_INTERCEPTORS,
    useClass: TokenInterceptor,
    multi : true}],
  bootstrap: [AppComponent]

})
export class AppModule { }
