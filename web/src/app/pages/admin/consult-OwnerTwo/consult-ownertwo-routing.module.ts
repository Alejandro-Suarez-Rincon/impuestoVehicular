import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ConsultOwnerTwoComponent } from './consult-ownertwo.component';

const routes: Routes = [{ path: '', component: ConsultOwnerTwoComponent }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class ConsultOwnerTwoRoutingModule {}
