import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CheckTaxesComponent } from './check-taxes.component';

const routes: Routes = [{ path: '', component: CheckTaxesComponent }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CheckTaxesRoutingModule { }
