import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CheckTaxesComponent } from './check-taxes.component';

describe('CheckTaxesComponent', () => {
  let component: CheckTaxesComponent;
  let fixture: ComponentFixture<CheckTaxesComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CheckTaxesComponent]
    });
    fixture = TestBed.createComponent(CheckTaxesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
