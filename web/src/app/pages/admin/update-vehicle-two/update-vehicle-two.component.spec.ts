import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateVehicleTwoComponent } from './update-vehicle-two.component';

describe('UpdateVehicleTwoComponent', () => {
  let component: UpdateVehicleTwoComponent;
  let fixture: ComponentFixture<UpdateVehicleTwoComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [UpdateVehicleTwoComponent]
    });
    fixture = TestBed.createComponent(UpdateVehicleTwoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
