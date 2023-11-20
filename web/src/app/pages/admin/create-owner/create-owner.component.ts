import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-create-owner',
  templateUrl: './create-owner.component.html',
  styleUrls: ['./create-owner.component.css']
})
export class CreateOwnerComponent {
  constructor(private router:Router){}

  // Información Formulario Propietario
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
  })

  // Información Formulario Vehiculo
  vehicleForm = new FormGroup({
    class: new FormControl(''),
    model: new FormControl(''),
    imported: new FormControl(''),
    confiscated: new FormControl(''),
    trademark: new FormControl(''),
    bodywork: new FormControl(''),
    armored: new FormControl(''),
    scrapped: new FormControl(''),
    line: new FormControl(''),
    cylinderCapacity: new FormControl(''),
    automaticBox: new FormControl(''),
    state: new FormControl(''),
    valueIVA: new FormControl(''),
    tonnage: new FormControl(''),
    openLetters: new FormControl(''),
    domainExtension: new FormControl(''),
    serviceType: new FormControl(''),
    passengers: new FormControl(0),
    stolen: new FormControl(''),
    ancient: new FormControl(''),
    vehicleType: new FormControl(''),
  })

  // Función que envia el json al servicio REST
  handleSubmit(){
    console.log(this.ownerForm.value)
    console.log(this.vehicleForm.value)
  }

  // Función que redirecciona a la pantalla de login
  goToLogin(){
    this.router.navigate(['/admin'])
  }
}
