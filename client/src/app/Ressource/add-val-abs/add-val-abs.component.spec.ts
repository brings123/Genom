import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddValAbsComponent } from './add-val-abs.component';

describe('AddValAbsComponent', () => {
  let component: AddValAbsComponent;
  let fixture: ComponentFixture<AddValAbsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddValAbsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddValAbsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
