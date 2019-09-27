import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ResnavComponent } from './resnav.component';

describe('ResnavComponent', () => {
  let component: ResnavComponent;
  let fixture: ComponentFixture<ResnavComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ResnavComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ResnavComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
