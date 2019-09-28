import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListFicheInformationComponent } from './list-fiche-information.component';

describe('ListFicheInformationComponent', () => {
  let component: ListFicheInformationComponent;
  let fixture: ComponentFixture<ListFicheInformationComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListFicheInformationComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListFicheInformationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
