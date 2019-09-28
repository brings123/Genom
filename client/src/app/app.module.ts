
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
import { DocumentService } from './document.service';
import { RessourcesComponent } from './Ressource/ressources/ressources.component';
import { RessourceComponent } from './Ressource/ressource.component';
import { AddressourceComponent } from './Ressource/addressource/addressource.component';
import { AddressourcevalComponent } from './Ressource/addressourceval/addressourceval.component';
import { SingupComponent } from './singup/singup.component';
import { CaracteristiquesComponent } from './Ressource/caracteristiques/caracteristiques.component';
import { CaracteristiqueComponent } from './Ressource/caracteristique/caracteristique.component';
import { AddValAbsComponent } from './Ressource/add-val-abs/add-val-abs.component';
import { AddCaracteristiqueComponent } from './Ressource/add-caracteristique/add-caracteristique.component';
import { ClassesComponent } from './classes/classes.component';
import { TypesComponent } from './types/types.component';
import { ClasseComponent } from './classe/classe.component';
import { TypeComponent } from './type/type.component';
import { CategoriesComponent } from './Ressource/categories/categories.component';
import { CategorieComponent } from './Ressource/categorie/categorie.component';

import { AddInstitutionComponent } from './institution/add-institution/add-institution.component';
import { ListInstitutionComponent } from './institution/list-institution/list-institution.component';
import { InstitutionService } from './institution/institution.service';
import { CategorieUpdateComponent } from './Ressource/categorie-update/categorie-update.component';
import { CaracteristiqueUpdateComponent } from './caracteristique-update/caracteristique-update.component';
import { ResnavComponent } from './resnav/resnav.component';
import { AdminDemandeComponent } from './demande/admin/admin-demande/admin-demande.component';
import { ConnectionComponent } from './demande/admin/connection/connection.component';
import { AddDetenteurComponent } from './demande/add-detenteur/add-detenteur.component';
import { AddOperateurComponent } from './demande/add-operateur/add-operateur.component';
import { AddScientifiqueComponent } from './demande/add-scientifique/add-scientifique.component';
import { AddResponsableComponent } from './demande/add-responsable/add-responsable.component';
import { BrowserModule } from '@angular/platform-browser';


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
    ListUserComponent,

    ListContactComponent,
    AddContactComponent,
    AddFicheInformationComponent,
    ListFicheInformationComponent,
    DetailFicheInformationComponent,
    EvenementComponent,
    AddEvenementComponent,
    
    




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
    LoginComponent,
    SingupComponent,
    CaracteristiquesComponent,
    CaracteristiqueComponent,
    AddValAbsComponent,
    AddCaracteristiqueComponent,
    ClassesComponent,
    TypesComponent,
    ClasseComponent,
    TypeComponent,
    CategoriesComponent,
    CategorieComponent,
    SingupComponent,
    AddInstitutionComponent,
    ListInstitutionComponent,

    CategorieUpdateComponent,
    CaracteristiqueUpdateComponent,
    ResnavComponent,
    AdminDemandeComponent,
    ConnectionComponent,
    AddDetenteurComponent,
    AddOperateurComponent,
    AddScientifiqueComponent,
    AddResponsableComponent


  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
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
      { path: 'add-fiche-information', component: AddFicheInformationComponent, },
      { path: 'list-fiche-information', component: ListFicheInformationComponent,},

      { path: 'add-contact', component: AddContactComponent, },
      { path: 'evenement', component: EvenementComponent, },
      { path: 'add-event', component: AddEvenementComponent },
      { path: 'list-user', component: ListUserComponent ,},
      { path: 'edit-user', component: EditUserComponent },
      { path: 'list-contact', component: ListContactComponent },
      {path : '', component : LoginComponent},
      {
        path: 'news',
        component: NewsComponent
      },
      {
        path: 'admin/demande/connection',
        component: ConnectionComponent
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
        path: 'ressource/:id',
        component: RessourceComponent
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
      {
        path:'caracteristiques',
        component:CaracteristiquesComponent
      },
      {
        path:'caracteristique/:id',
        component:CaracteristiqueComponent
      },
      {
        path:'addvaleurabs/:id',
        component:AddValAbsComponent
      },
      {
        path:'addcaracteristique',
        component:AddCaracteristiqueComponent
      },
      {
        path:'classes',
        component:ClassesComponent
      },{
        path:'types',
        component:TypesComponent
      },{
        path:'type',
        component:TypeComponent
      },{
        path:'classe',
        component:ClasseComponent
      },
      {
        path:'admin/demandes',
        component:AdminDemandeComponent
      },
      {
        path:'categories',
        component:CategoriesComponent
      },{
        path:'categorie',
        component:CategorieComponent
      },{

        path:'addinstitution',
        component:AddInstitutionComponent
      },{
        path:'institutions',
        component:ListInstitutionComponent}
      ,
        {path:'categorie/:id',
        component:CategorieUpdateComponent
      },{
        path:'caracteristiques/:id',
        component:CaracteristiqueUpdateComponent
      }

    ])
  ],    providers: [ApiService,DocumentService,InstitutionService,PresentationService, DatePipe,{provide: HTTP_INTERCEPTORS,
    useClass: TokenInterceptor,
    multi : true}],
  bootstrap: [AppComponent]

})
export class AppModule { }
