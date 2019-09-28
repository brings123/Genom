import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { InfoFicheComponent } from './infofiche.component';

describe('InfoFicheComponent', () => {
  let component: InfoFicheComponent;
  let fixture: ComponentFixture<InfoFicheComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ InfoFicheComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(InfoFicheComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
