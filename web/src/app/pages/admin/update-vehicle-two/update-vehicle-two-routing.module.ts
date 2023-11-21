import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UpdateVehicleTwoComponent } from './update-vehicle-two.component';

const routes: Routes = [{ path: '', component: UpdateVehicleTwoComponent }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class UpdateVehicleRoutingModule { }