import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ReactiveFormsModule } from '@angular/forms';
import { UpdateVehicleTwoRoutingModule } from './update-vehicle-two-routing.module';
import { UpdateVehicleTwoComponent } from './update-vehicle-two.component';


@NgModule({
  declarations: [
    UpdateVehicleTwoComponent
  ],
  imports: [
    CommonModule,
    UpdateVehicleTwoRoutingModule,
    ReactiveFormsModule
  ]
})
export class UpdateVehicleTwoModule { }