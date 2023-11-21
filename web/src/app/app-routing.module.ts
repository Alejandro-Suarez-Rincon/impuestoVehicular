import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
    path: 'home',
    loadChildren: () =>
      import('./pages/home/home.module').then((m) => m.HomeModule),
  },
  {
    path: 'admin',
    loadChildren: () =>
      import('./pages/admin/admin.module').then((m) => m.AdminModule),
  },
  {
    path: 'check-taxes',
    loadChildren: () =>
      import('./pages/check-taxes/check-taxes.module').then(
        (m) => m.CheckTaxesModule
      ),
  },
  {
    path: 'updateownerlogin',
    loadChildren: () =>
      import('./pages/admin/update-owner/update-owner.module').then(
        (m) => m.UpdateOwnerModule
      ),
  },
  {
    path: 'updateowner',
    loadChildren: () =>
      import('./pages/admin/update-owner2/update-owner.module').then(
        (m) => m.UpdateOwnerModule
      ),
  },
  {
    path: '**',
    loadChildren: () =>
      import('./pages/home/home.module').then((m) => m.HomeModule),
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
