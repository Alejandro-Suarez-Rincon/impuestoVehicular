import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AppraisalsRoutingModule } from './appraisals-routing.module';
import { AppraisalsComponent } from './appraisals.component';
import { ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [AppraisalsComponent],
  imports: [CommonModule, AppraisalsRoutingModule, ReactiveFormsModule],
})
export class AppraisalsModule {}
