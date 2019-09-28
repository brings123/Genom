import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DetailFicheInformationComponent } from './detail-fiche-information.component';

describe('DetailFicheInformationComponent', () => {
  let component: DetailFicheInformationComponent;
  let fixture: ComponentFixture<DetailFicheInformationComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DetailFicheInformationComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DetailFicheInformationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
