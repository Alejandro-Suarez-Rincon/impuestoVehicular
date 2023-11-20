import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ReactiveFormsModule } from '@angular/forms';
import { UpdateOwnerRoutingModule } from './update-owner-routing.module';
import { UpdateOwnerComponent } from './update-owner.component';


@NgModule({
  declarations: [
    UpdateOwnerComponent
  ],
  imports: [
    CommonModule,
    UpdateOwnerRoutingModule,
    ReactiveFormsModule 
  ]
})
export class UpdateOwnerModule { }
