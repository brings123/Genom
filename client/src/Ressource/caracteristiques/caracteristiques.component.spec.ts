import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CaracteristiquesComponent } from './caracteristiques.component';

describe('CaracteristiquesComponent', () => {
  let component: CaracteristiquesComponent;
  let fixture: ComponentFixture<CaracteristiquesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CaracteristiquesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CaracteristiquesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
