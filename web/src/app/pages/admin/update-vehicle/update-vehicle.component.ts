import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-update-vehicle',
  templateUrl: './update-vehicle.component.html',
  styleUrls: ['./update-vehicle.component.css'],
})
export class UpdateVehicleComponent {
  constructor(private router: Router) {}

  // Estado checkbox terminos y condiciones
  terms: boolean = false;

  // Información Formulario
  form = new FormGroup({
    plate: new FormControl(''),
  });

  // Función que envia el json al servicio REST
  handleSubmit() {
    console.log(this.form.value);
  }

  // Función que redirecciona a la pantalla de login
  goToLogin() {
    this.router.navigate(['/admin']);
  }

  toggleTerms() {
    this.terms = !this.terms;
  }

  goToUpdate() {
    this.router.navigate(['/updateowner']);
  }
}
