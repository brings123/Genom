import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddFicheComponent } from './addfiche.component';

describe('AddFicheComponent', () => {
  let component: AddFicheComponent;
  let fixture: ComponentFixture<AddFicheComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddFicheComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddFicheComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
