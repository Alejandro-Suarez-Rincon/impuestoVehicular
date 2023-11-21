import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConsultOwnerComponent } from './consult-owner.component';

describe('ConsultOwnerComponent', () => {
  let component: ConsultOwnerComponent;
  let fixture: ComponentFixture<ConsultOwnerComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ConsultOwnerComponent],
    });
    fixture = TestBed.createComponent(ConsultOwnerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
