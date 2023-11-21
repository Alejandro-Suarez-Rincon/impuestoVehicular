import { Component } from '@angular/core';

@Component({
  selector: 'app-update-vehicle-two',
  templateUrl: './update-vehicle-two.component.html',
  styleUrls: ['./update-vehicle-two.component.css']
})
export class UpdateVehicleTwoComponent {

}
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
    primer_nombre: new FormControl(''),
    segundo_nombre: new FormControl(''),
    primer_apellido: new FormControl(''),
    segundo_apellido: new FormControl(''),
    tipo_documento: new FormControl(''),
    numero_documento: new FormControl(''),
    correo_electronico: new FormControl(''),
    numero_telefonico: new FormControl(''),
    fecha_nacimiento: new FormControl(''),
  })

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
    console.log(this.ownerForm.value)
    console.log(this.vehicleForm.value)
  }

  // Función que redirecciona a la pantalla de login
  goToLogin(){
    this.router.navigate(['/admin'])
  }
}
