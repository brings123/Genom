import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CaracteristiqueComponent } from './caracteristique.component';

describe('CaracteristiqueComponent', () => {
  let component: CaracteristiqueComponent;
  let fixture: ComponentFixture<CaracteristiqueComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CaracteristiqueComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CaracteristiqueComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
