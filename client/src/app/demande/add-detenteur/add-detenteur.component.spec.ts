import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddDetenteurComponent } from './add-detenteur.component';

describe('AddDetenteurComponent', () => {
  let component: AddDetenteurComponent;
  let fixture: ComponentFixture<AddDetenteurComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddDetenteurComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddDetenteurComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
