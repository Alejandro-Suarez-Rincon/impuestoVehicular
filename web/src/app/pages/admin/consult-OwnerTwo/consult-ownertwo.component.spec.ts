import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConsultOwnerTwoComponent } from './consult-ownertwo.component';

describe('ConsultOwnerComponent', () => {
  let component: ConsultOwnerTwoComponent;
  let fixture: ComponentFixture<ConsultOwnerTwoComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ConsultOwnerTwoComponent],
    });
    fixture = TestBed.createComponent(ConsultOwnerTwoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
