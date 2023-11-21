import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
@Component({
  selector: 'app-consult-owner',
  templateUrl: './consult-owner.component.html',
  styleUrls: ['./consult-owner.component.css'],
})
export class ConsultOwnerComponent {
  constructor(private router: Router) {}

  // Estado checkbox terminos y condiciones
  terms: boolean = false;

  // Información Formulario
  form = new FormGroup({
    typeIdentification: new FormControl(''),
    vehiclePlate: new FormControl(''),
  });

  // Función que envia el json al servicio REST
  handleSubmit() {
    console.log(this.form.value);
  }

  // Función que redirecciona a la pantalla de login
  goToLogin() {
    this.router.navigate(['/admin']);
  }

  goToUpdate() {
    this.router.navigate(['/updateowner']);
  }

  // Función que modifica el estado del checkbox
  toggleTerms() {
    this.terms = !this.terms;
  }
}
