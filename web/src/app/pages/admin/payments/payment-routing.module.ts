import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { paymentComponent } from './payment-component';

const routes: Routes = [{ path: '', component: paymentComponent }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class paymentRoutingModule { }
