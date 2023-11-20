import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CreateOwnerRoutingModule } from './create-owner-routing.module';
import { CreateOwnerComponent } from './create-owner.component';
import { ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    CreateOwnerComponent
  ],
  imports: [
    CommonModule,
    CreateOwnerRoutingModule,
    ReactiveFormsModule
  ]
})
export class CreateOwnerModule { }
