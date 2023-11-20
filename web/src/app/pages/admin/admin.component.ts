import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-admin',
  standalone: false,
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent {

  terms: boolean = false;

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
    window.location.href="/admin"
  }

  // Función que modifica el estado del checkbox
  toggleTerms(){
    this.terms= !this.terms
  }
}
