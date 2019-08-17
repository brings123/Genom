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

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    SidenavComponent,
    DocumentCardComponent,
    DocumentsComponent,
    HomeComponent,
    DemandeComponent,
    AdminDocumentComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
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
      }
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
