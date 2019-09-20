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
    ListUserComponent
    
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    FormsModule,
    ReactiveFormsModule,
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
        path:'admin/documents',
        component:AdminDocumentComponent
      },
      
      { path: 'login', component: LoginComponent , },
      { path: 'add-user', component: AddUserComponent, },
      { path: 'list-user', component: ListUserComponent ,},
      { path: 'edit-user', component: EditUserComponent },
      {path : '', component : LoginComponent}
    ])
  ],
  providers: [ApiService, {provide: HTTP_INTERCEPTORS,
    useClass: TokenInterceptor,
    multi : true}],
  bootstrap: [AppComponent]
})
export class AppModule { }
