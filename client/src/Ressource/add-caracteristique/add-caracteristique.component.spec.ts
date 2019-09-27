import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddCaracteristiqueComponent } from './add-caracteristique.component';

describe('AddCaracteristiqueComponent', () => {
  let component: AddCaracteristiqueComponent;
  let fixture: ComponentFixture<AddCaracteristiqueComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddCaracteristiqueComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddCaracteristiqueComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
