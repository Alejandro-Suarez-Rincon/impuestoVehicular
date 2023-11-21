import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
@Component({
  selector: 'app-update-owner',
  templateUrl: './update-owner.component2.html',
  styleUrls: ['./update-owner.component.css'],
})
export class UpdateOwnerComponent {
  constructor(private router: Router) {}

  // Estado checkbox terminos y condiciones
  terms: boolean = false;

  // Información Formulario
  ownerForm = new FormGroup({
    first_name: new FormControl(''),
    second_name: new FormControl(''),
    last_name: new FormControl(''),
    second_last_name: new FormControl(''),
    typeIdentification: new FormControl(''),
    Identification: new FormControl(''),
    email: new FormControl(''),
    phone: new FormControl(''),
    born_date: new FormControl(''),
  });

  // Función que envia el json al servicio REST
  handleSubmit() {
    console.log(this.ownerForm.value);
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
