import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin',
  standalone: false,
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent {
  constructor(private router:Router){}

  // Estado checkbox terminos y condiciones
  terms: boolean = false;

  // Información Formulario
  form = new FormGroup({
    correo_electronico: new FormControl(''),
    contrasena: new FormControl('')
  })

  // Función que envia el json al servicio REST
  handleSubmit(){
    console.log(this.form.value)
  }

  // Función que redirecciona a la pantalla de login
  goToLogin(){
    this.router.navigate(['/admin'])
  }

  // Función que modifica el estado del checkbox
  toggleTerms(){
    this.terms= !this.terms
  }
}
