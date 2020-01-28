import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ConvertUpperComponent } from './convert-upper.component';

describe('ConvertUpperComponent', () => {
  let component: ConvertUpperComponent;
  let fixture: ComponentFixture<ConvertUpperComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ConvertUpperComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ConvertUpperComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
