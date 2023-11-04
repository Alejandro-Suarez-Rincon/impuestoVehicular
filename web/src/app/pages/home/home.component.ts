import { Component, OnInit } from '@angular/core';
import { CoreAPIService } from 'src/app/services/core-api.service';

// NOTE: Esta clase ha sido creada con estado inicial y luego Angular cambia el
// estado cuando complete la llamada a la función ngOnInit (linea 25).

// TODO: Agregar un destino nuevo para las clases con estado inicial.

class VersionDTO {
  version: string;
  constructor() {
    this.version = "";
  }
};

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  constructor(private readonly coreAPIService: CoreAPIService) { }
  public version: string = "";

  ngOnInit(): void {
    this.coreAPIService.get({ path: '/version' }).subscribe((state) => {
      const versionDTO: VersionDTO = new VersionDTO();
      Object.assign(versionDTO, state);
      this.version = versionDTO.version;
    });
  }
}
