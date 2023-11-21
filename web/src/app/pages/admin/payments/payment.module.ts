import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ReactiveFormsModule } from '@angular/forms';
import { paymentRoutingModule } from './payment-routing.module';
import { paymentComponent } from './payment-component';


@NgModule({
  declarations: [
    paymentComponent
  ],
  imports: [
    CommonModule,
    paymentRoutingModule,
    ReactiveFormsModule 
  ]
})
export class paymentModule { }
