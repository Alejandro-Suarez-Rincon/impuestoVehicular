import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ConsultOwnerComponent } from './consult-owner.component';

const routes: Routes = [{ path: '', component: ConsultOwnerComponent }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class ConsultOwnerRoutingModule {}
