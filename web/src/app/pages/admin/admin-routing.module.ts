import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminComponent } from './admin.component';

const routes: Routes = [{ path: '', component: AdminComponent }, { path: 'create-owner', loadChildren: () => import('./create-owner/create-owner.module').then(m => m.CreateOwnerModule) }, { path: 'update-owner', loadChildren: () => import('./update-owner/update-owner.module').then(m => m.UpdateOwnerModule) }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AdminRoutingModule { }
