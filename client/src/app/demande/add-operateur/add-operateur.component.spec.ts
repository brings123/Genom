import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddOperateurComponent } from './add-operateur.component';

describe('AddOperateurComponent', () => {
  let component: AddOperateurComponent;
  let fixture: ComponentFixture<AddOperateurComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddOperateurComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddOperateurComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
