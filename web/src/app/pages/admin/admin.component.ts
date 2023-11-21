import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { CoreAPIService } from 'src/app/services/core-api.service';

@Component({
  selector: 'app-admin',
  standalone: false,
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent {
  constructor(private router: Router,
    private readonly coreAPIService: CoreAPIService) { }

  isLoggedIn: boolean = false;

  // Estado checkbox terminos y condiciones
  terms: boolean = false;


  // Información Formulario
  form = new FormGroup({
    email: new FormControl(''),
    password: new FormControl('')
  })

  // Función que envia el json al servicio REST
  handleSubmit() {
    this.coreAPIService.post({
      path: "/admin/validate",
      body: this.form.value,
    }).subscribe(data => {
      const adminValidateResDTO: {
        id: string;
        email: string;
      } = data as any;

      if (adminValidateResDTO.id) {
        this.router.navigate(['/admin/create-owner']);
      }
    });
  }

  // Función que redirecciona a la pantalla de login
  goToLogin() {
    this.router.navigate(['/admin'])
  }

  // Función que modifica el estado del checkbox
  toggleTerms() {
    this.terms = !this.terms
  }
}
