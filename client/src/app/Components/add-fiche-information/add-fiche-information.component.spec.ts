import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddFicheInformationComponent } from './add-fiche-information.component';

describe('AddFicheInformationComponent', () => {
  let component: AddFicheInformationComponent;
  let fixture: ComponentFixture<AddFicheInformationComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddFicheInformationComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddFicheInformationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
