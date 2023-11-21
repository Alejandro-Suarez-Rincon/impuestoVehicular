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
    path: 'payment',
    loadChildren: () =>
      import('./pages/admin/payments/payment.module').then(
        (m) => m.paymentModule
      ),
  },

  {
    path: 'consultownerlogin',
    loadChildren: () =>
      import('./pages/admin/consult-ownerOne/consult-owner.module').then(
        (m) => m.ConsultOwnerModule
      ),
  },
  {
    path: 'avaluos',
    loadChildren: () =>
      import('./pages/admin/appraisals/appraisals.module').then(
        (m) => m.AppraisalsModule
      ),
  },
  {
    path: 'consultowner',
    loadChildren: () =>
      import('./pages/admin/consult-OwnerTwo/consult-ownertwo.module').then(
        (m) => m.ConsultOwnerTwoModule
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
