import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PubnavComponent } from './pubnav.component';

describe('PubnavComponent', () => {
  let component: PubnavComponent;
  let fixture: ComponentFixture<PubnavComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PubnavComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PubnavComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
