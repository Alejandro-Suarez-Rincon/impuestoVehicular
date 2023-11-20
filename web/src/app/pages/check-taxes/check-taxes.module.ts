import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CheckTaxesRoutingModule } from './check-taxes-routing.module';
import { CheckTaxesComponent } from './check-taxes.component';
import { ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    CheckTaxesComponent
  ],
  imports: [
    CommonModule,
    CheckTaxesRoutingModule,
    ReactiveFormsModule 
  ]
})
export class CheckTaxesModule { }
