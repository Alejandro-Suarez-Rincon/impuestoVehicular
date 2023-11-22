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

  // Información Formulario Propietario
  ownerForm = new FormGroup({
    first_name: new FormControl('', [Validators.required]),
    second_name: new FormControl('', [Validators.required]),
    last_name: new FormControl('', [Validators.required]),
    second_last_name: new FormControl('', [Validators.required]),
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
    passengers: new FormControl(1, [Validators.min(1), Validators.max(5)]),
    stolen: new FormControl('', [Validators.required]),
    ancient: new FormControl('', [Validators.required]),
    vehicleType: new FormControl('', [Validators.required]),
  });

  // Función que envia el json al servicio REST
  handleSubmit() {
    console.log(this.ownerForm.value);
    console.log(this.vehicleForm.value);
  }

  // Función que redirecciona a la pantalla de login
  goToLogin() {
    this.router.navigate(['/admin']);
  }

  goToUpdate() {
    this.router.navigate(['admin/update-owner']);
  }
}
