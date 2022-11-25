import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LgnsuccessComponent } from './lgnsuccess.component';

describe('LgnsuccessComponent', () => {
  let component: LgnsuccessComponent;
  let fixture: ComponentFixture<LgnsuccessComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LgnsuccessComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(LgnsuccessComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
