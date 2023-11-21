import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AdminRoutingModule } from './admin-routing.module';
import { AdminComponent } from './admin.component';
import { ReactiveFormsModule } from '@angular/forms';
import { AppraisalsComponent } from './appraisals/appraisals.component';
import { UpdateVehicleComponent } from './update-vehicle/update-vehicle.component';
import { UpdateVehicleTwoComponent } from './update-vehicle-two/update-vehicle-two.component';

@NgModule({
  declarations: [
    AdminComponent,
    AppraisalsComponent,
    UpdateVehicleComponent,
    UpdateVehicleTwoComponent
  ],
  imports: [
    CommonModule,
    AdminRoutingModule,
    ReactiveFormsModule
  ]
})
export class AdminModule { }
