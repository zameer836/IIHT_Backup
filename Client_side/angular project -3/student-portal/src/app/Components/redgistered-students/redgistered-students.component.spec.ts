import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RedgisteredStudentsComponent } from './redgistered-students.component';

describe('RedgisteredStudentsComponent', () => {
  let component: RedgisteredStudentsComponent;
  let fixture: ComponentFixture<RedgisteredStudentsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RedgisteredStudentsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RedgisteredStudentsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
