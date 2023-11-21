mport { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { UpdateVehicleRoutingModule } from './update-vehicle-two-routing.module';
import { UpdateVehicleTwoComponent } from './update-vehicle-two.component';
import { ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    UpdateVehicleTwoComponent
  ],
  imports: [
    CommonModule,
    UpdateVehicleRoutingModule,
    ReactiveFormsModule
  ]
})
export class UpdateVehicleModule { }