import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreateOwnerComponent } from './create-owner.component';

const routes: Routes = [{ path: '', component: CreateOwnerComponent }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CreateOwnerRoutingModule { }
