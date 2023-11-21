import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-appraisals',
  templateUrl: './appraisals.component.html',
  styleUrls: ['./appraisals.component.css']
})
export class AppraisalsComponent {
  constructor(private router:Router){}

  // Información Formulario Avaluo
  appraisalsForm = new FormGroup({
    vehicle_plate: new FormControl(''),
    date_year: new FormControl(''),
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
    appraised_value: new FormControl(''),
  })

  // Función que envia el json al servicio REST
  handleSubmit(){
    console.log(this.appraisalsForm.value)
  }

  // Función que redirecciona a la pantalla de login
  goToLogin(){
    this.router.navigate(['/admin'])
  }

}





