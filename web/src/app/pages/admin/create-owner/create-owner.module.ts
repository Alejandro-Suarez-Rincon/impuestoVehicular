import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CreateOwnerRoutingModule } from './create-owner-routing.module';
import { CreateOwnerComponent } from './create-owner.component';


@NgModule({
  declarations: [
    CreateOwnerComponent
  ],
  imports: [
    CommonModule,
    CreateOwnerRoutingModule
  ]
})
export class CreateOwnerModule { }
