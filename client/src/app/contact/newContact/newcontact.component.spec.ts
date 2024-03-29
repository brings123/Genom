import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NewContactComponent } from './newcontact.component';

describe('NewContactComponent', () => {
  let component: NewContactComponent;
  let fixture: ComponentFixture<NewContactComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NewContactComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NewContactComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
