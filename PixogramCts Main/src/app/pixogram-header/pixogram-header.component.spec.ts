import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PixogramHeaderComponent } from './pixogram-header.component';

describe('PixogramHeaderComponent', () => {
  let component: PixogramHeaderComponent;
  let fixture: ComponentFixture<PixogramHeaderComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PixogramHeaderComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PixogramHeaderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
