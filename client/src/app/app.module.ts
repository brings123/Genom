import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NavbarComponent } from './navbar/navbar.component';
import { SidenavComponent } from './sidenav/sidenav.component';
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
import { ListContactComponent } from './Components/list-contact/list-contact.component';
import { AddContactComponent } from './Components/add-contact/add-contact.component';
import { PresentationService } from './_services/presentation.service';
import { AddFicheInformationComponent } from './Components/add-fiche-information/add-fiche-information.component';
import { ListFicheInformationComponent } from './Components/list-fiche-information/list-fiche-information.component';
import { DetailFicheInformationComponent } from './Components/detail-fiche-information/detail-fiche-information.component';
//import {QuillModule} from 'ngx-quill';
//import { FroalaEditorModule, FroalaViewModule } from 'angular-froala-wysiwyg';
import { AngularEditorModule } from '@kolkov/angular-editor';
import { DatePipe } from '@angular/common';
import { FullCalendarModule } from '@fullcalendar/angular';
import { EvenementComponent } from './Components/evenement/evenement.component';
import { AddEvenementComponent } from './Components/add-evenement/add-evenement.component'; 





@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    SidenavComponent,
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
    ListUserComponent,
    ListContactComponent,
    AddContactComponent,
    AddFicheInformationComponent,
    ListFicheInformationComponent,
    DetailFicheInformationComponent,
    EvenementComponent,
    AddEvenementComponent
    
    
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    FullCalendarModule,
    AngularEditorModule,
    //FroalaEditorModule.forRoot(), FroalaViewModule.forRoot(),
   // QuillModule.forRoot({
     // modules: {
       // syntax: false,
     //   toolbar: [
       //   ['bold', 'italic', 'underline', 'strike'] ,
         // [ 'code-block'],       
       //   [{ 'header': 1 }, { 'header': 2 }],   
         // [{ 'list': 'ordered'}, { 'list': 'bullet' }],
         // [{ 'script': 'sub'}, { 'script': 'super' }],
         // [{ 'indent': '-1'}, { 'indent': '+1' }],          // outdent/indent
        //  [{ 'direction': 'rtl' }],
                                             // remove formatting button
      
         // ['link', 'image', 'video']  
     //  ]
   //   }
 //   }),
 
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
        path:'admin/documents',
        component:AdminDocumentComponent
      },
      
      { path: 'login', component: LoginComponent , },
      { path: 'add-user', component: AddUserComponent, },
      { path: 'add-fiche-information', component: AddFicheInformationComponent, },
      { path: 'list-fiche-information', component: ListFicheInformationComponent,},

      { path: 'add-contact', component: AddContactComponent, },
      { path: 'evenement', component: EvenementComponent, },
      { path: 'add-event', component: AddEvenementComponent },
      { path: 'list-user', component: ListUserComponent ,},
      { path: 'edit-user', component: EditUserComponent },
      { path: 'list-contact', component: ListContactComponent },
      {path : '', component : LoginComponent}
    ])
  ],
  providers: [ApiService,PresentationService ,DatePipe,{provide: HTTP_INTERCEPTORS,
    useClass: TokenInterceptor,
    multi : true}],
  bootstrap: [AppComponent]
})
export class AppModule { }
