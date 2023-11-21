import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { CoreAPIService } from 'src/app/services/core-api.service';

@Component({
  selector: 'app-admin',
  standalone: false,
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css'],
})
export class AdminComponent {
  constructor(
    private router: Router,
    private readonly coreAPIService: CoreAPIService
  ) {}

  isLoggedIn: boolean = false;
  terms: boolean = false;

  // Mensajes de error para los campos
  emailError: string = '';
  passwordError: string = '';

  // Expresión regular para validar el correo electrónico
  emailRegex: RegExp = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

  // Información del formulario
  form = new FormGroup({
    email: new FormControl('', [
      Validators.required,
      Validators.pattern(this.emailRegex),
    ]),
    password: new FormControl('', [Validators.required]),
  });

  // Función que envía el json al servicio REST
  handleSubmit() {
    this.validateEmail();
    this.validatePassword();

    if (this.emailError || this.passwordError) {
      return; // Si hay errores, detener la ejecución
    }

    // Continuar con la lógica de envío si no hay errores
    this.coreAPIService
      .post({
        path: '/admin/validate',
        body: this.form.value,
      })
      .subscribe((data) => {
        const adminValidateResDTO: { id: string; email: string } = data as any;
        if (adminValidateResDTO.id) {
          this.router.navigate(['/admin/create-owner']);
        }
      });
  }

  // Función que valida el correo electrónico
  validateEmail() {
    const emailControl = this.form.get('email');

    if (emailControl!.errors) {
      if (emailControl!.errors['required']) {
        this.emailError = 'El correo electrónico es obligatorio.';
      } else if (emailControl!.errors['pattern']) {
        this.emailError = 'El formato del correo electrónico no es válido.';
      }
    }
  }

  // Función que valida la contraseña
  validatePassword() {
    const passwordControl = this.form.get('password');
    if (passwordControl!.errors?.['required']) {
      this.passwordError = 'La contraseña es obligatoria.';
    }
  }

  // Función que redirecciona a la pantalla de login
  goToLogin() {
    this.router.navigate(['/admin']);
  }

  // Función que modifica el estado del checkbox
  toggleTerms() {
    this.terms = !this.terms;
  }
}
