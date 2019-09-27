import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddressourceComponent } from './addressource.component';

describe('AddressourceComponent', () => {
  let component: AddressourceComponent;
  let fixture: ComponentFixture<AddressourceComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddressourceComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddressourceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
