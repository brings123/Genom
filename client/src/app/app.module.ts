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
import { CategorieUpdateComponent } from './Ressource/categorie-update/categorie-update.component';
import { CaracteristiqueUpdateComponent } from './caracteristique-update/caracteristique-update.component';
import { ResnavComponent } from './resnav/resnav.component';


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
    CategorieUpdateComponent,
    CaracteristiqueUpdateComponent,
    ResnavComponent

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
        path:'categories',
        component:CategoriesComponent
      },{
        path:'categorie',
        component:CategorieComponent
      },{
        path:'categorie/:id',
        component:CategorieUpdateComponent
      },{
        path:'caracteristiques/:id',
        component:CaracteristiqueUpdateComponent
      }
    ])
  ],
  providers: [ApiService,DocumentService, {provide: HTTP_INTERCEPTORS,
    useClass: TokenInterceptor,
    multi : true}],
  bootstrap: [AppComponent]

})
export class AppModule { }
