import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppraisalsComponent } from './appraisals.component';

const routes: Routes = [{ path: '', component: AppraisalsComponent }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class AppraisalsRoutingModule {}
