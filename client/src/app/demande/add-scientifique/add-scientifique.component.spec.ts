import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddScientifiqueComponent } from './add-scientifique.component';

describe('AddScientifiqueComponent', () => {
  let component: AddScientifiqueComponent;
  let fixture: ComponentFixture<AddScientifiqueComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddScientifiqueComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddScientifiqueComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
