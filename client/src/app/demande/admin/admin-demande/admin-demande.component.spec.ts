import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminDemandeComponent } from './admin-demande.component';

describe('AdminDemandeComponent', () => {
  let component: AdminDemandeComponent;
  let fixture: ComponentFixture<AdminDemandeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AdminDemandeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminDemandeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
