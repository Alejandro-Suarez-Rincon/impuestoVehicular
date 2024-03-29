import { ComponentFixture, TestBed } from '@angular/core/testing';

import { paymentComponent } from './payment-component';

describe('UpdateOwnerComponent', () => {
  let component: paymentComponent;
  let fixture: ComponentFixture<paymentComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [paymentComponent]
    });
    fixture = TestBed.createComponent(paymentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
