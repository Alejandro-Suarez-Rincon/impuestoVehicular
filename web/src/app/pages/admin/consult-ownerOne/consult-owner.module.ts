import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ReactiveFormsModule } from '@angular/forms';
import { ConsultOwnerRoutingModule } from './consult-owner-routing.module';
import { ConsultOwnerComponent } from './consult-owner.component';

@NgModule({
  declarations: [ConsultOwnerComponent],
  imports: [CommonModule, ConsultOwnerRoutingModule, ReactiveFormsModule],
})
export class ConsultOwnerModule {}
