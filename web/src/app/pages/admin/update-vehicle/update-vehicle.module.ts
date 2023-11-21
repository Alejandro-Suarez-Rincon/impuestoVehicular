import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ReactiveFormsModule } from '@angular/forms';
import { UpdateVehicleRoutingModule } from './update-vehicle-routing.module';
import { UpdateVehicleComponent } from './update-vehicle.component';


@NgModule({
  declarations: [
    UpdateVehicleComponent
  ],
  imports: [
    CommonModule,
    UpdateVehicleRoutingModule,
    ReactiveFormsModule 
  ]
})
export class UpdateOwnerModule { }