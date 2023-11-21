import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-create-owner',
  templateUrl: './create-owner.component.html',
  styleUrls: ['./create-owner.component.css'],
})
export class CreateOwnerComponent {
  constructor(private router: Router) {}

  passwordError: string = '';

  // Información Formulario Propietario
  ownerForm = new FormGroup({
    first_name: new FormControl('', [Validators.required]),
    second_name: new FormControl(''),
    last_name: new FormControl('', [Validators.required]),
    second_last_name: new FormControl(''),
    typeIdentification: new FormControl('', [Validators.required]),
    Identification: new FormControl('', [Validators.required]),
    email: new FormControl('', [Validators.required]),
    phone: new FormControl('', [Validators.required]),
    born_date: new FormControl('', [Validators.required]),
  });

  // Información Formulario Vehiculo
  vehicleForm = new FormGroup({
    class: new FormControl('', [Validators.required]),
    model: new FormControl('', [Validators.required]),
    imported: new FormControl('', [Validators.required]),
    confiscated: new FormControl('', [Validators.required]),
    trademark: new FormControl('', [Validators.required]),
    bodywork: new FormControl('', [Validators.required]),
    armored: new FormControl('', [Validators.required]),
    scrapped: new FormControl('', [Validators.required]),
    line: new FormControl('', [Validators.required]),
    cylinderCapacity: new FormControl('', [Validators.required]),
    automaticBox: new FormControl('', [Validators.required]),
    state: new FormControl('', [Validators.required]),
    valueIVA: new FormControl('', [Validators.required]),
    tonnage: new FormControl('', [Validators.required]),
    openLetters: new FormControl('', [Validators.required]),
    domainExtension: new FormControl('', [Validators.required]),
    serviceType: new FormControl('', [Validators.required]),
    passengers: new FormControl(0, [Validators.required]),
    stolen: new FormControl('', [Validators.required]),
    ancient: new FormControl('', [Validators.required]),
    vehicleType: new FormControl('', [Validators.required]),
  });

  // Función que envia el json al servicio REST
  handleSubmit() {
    this.validateInput();

    if (this.passwordError) {
      return; // Si hay errores, detener la ejecución
    }
    console.log(this.ownerForm.value);
    console.log(this.vehicleForm.value);
  }

  // Función que redirecciona a la pantalla de login
  goToLogin() {
    this.router.navigate(['/admin']);
  }

  validateInput() {
    const passwordControl = this.ownerForm.get(
      'first_name' &&
        'last_name' &&
        'typeIdentification' &&
        'Identification' &&
        'email' &&
        'phone'
    );
    if (passwordControl!.errors?.['required']) {
      this.passwordError = 'El campo es obligatorio.';
    }
  }

  goToUpdate() {
    this.router.navigate(['admin/update-owner']);
  }
}
