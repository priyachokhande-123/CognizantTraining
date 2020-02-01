import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PixogramHeadderComponent } from './pixogram-headder.component';

describe('PixogramHeadderComponent', () => {
  let component: PixogramHeadderComponent;
  let fixture: ComponentFixture<PixogramHeadderComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PixogramHeadderComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PixogramHeadderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
