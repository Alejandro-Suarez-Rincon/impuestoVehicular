import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-update-vehicle-two',
  templateUrl: './update-vehicle-two.component.html',
  styleUrls: ['./update-vehicle-two.component.css']
})

export class UpdateVehicleTwoComponent {
  constructor(private router:Router){}

  // Información Formulario Vehiculo
  vehicleForm = new FormGroup({
    clase: new FormControl(''),
    modelo: new FormControl(''),
    importado: new FormControl(''),
    decomisado: new FormControl(''),
    marca: new FormControl(''),
    carroceria: new FormControl(''),
    blindado: new FormControl(''),
    chatarrizado: new FormControl(''),
    linea: new FormControl(''),
    cilindraje: new FormControl(''),
    caja_automatica: new FormControl(''),
    estado: new FormControl(''),
    val_antes_iva: new FormControl(''),
    tonelaje: new FormControl(''),
    carta_abiertas: new FormControl(''),
    ext_dominio: new FormControl(''),
    tipo_servicio: new FormControl(''),
    pasajeros: new FormControl(0),
    robado: new FormControl(''),
    antiguo: new FormControl(''),
    tipo_vehiculo: new FormControl(''),
  })

  // Función que envia el json al servicio REST
  handleSubmit(){
    console.log(this.vehicleForm.value)
  }

  // Función que redirecciona a la pantalla de login
  goToLogin(){
    this.router.navigate(['/admin'])
  }
}
