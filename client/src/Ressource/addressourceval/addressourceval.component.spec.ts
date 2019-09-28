import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddressourcevalComponent } from './addressourceval.component';

describe('AddressourcevalComponent', () => {
  let component: AddressourcevalComponent;
  let fixture: ComponentFixture<AddressourcevalComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddressourcevalComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddressourcevalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
