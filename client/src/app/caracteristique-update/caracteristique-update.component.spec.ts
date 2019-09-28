import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CaracteristiqueUpdateComponent } from './caracteristique-update.component';

describe('CaracteristiqueUpdateComponent', () => {
  let component: CaracteristiqueUpdateComponent;
  let fixture: ComponentFixture<CaracteristiqueUpdateComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CaracteristiqueUpdateComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CaracteristiqueUpdateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
