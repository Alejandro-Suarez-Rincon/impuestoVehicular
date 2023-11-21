import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ReactiveFormsModule } from '@angular/forms';
import { ConsultOwnerTwoRoutingModule } from './consult-ownertwo-routing.module';
import { ConsultOwnerTwoComponent } from './consult-ownertwo.component';

@NgModule({
  declarations: [ConsultOwnerTwoComponent],
  imports: [CommonModule, ConsultOwnerTwoRoutingModule, ReactiveFormsModule],
})
export class ConsultOwnerTwoModule {}
