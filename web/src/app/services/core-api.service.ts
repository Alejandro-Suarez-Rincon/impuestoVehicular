import { HttpClient, HttpContext, HttpHeaders, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';


// TODO: Cambiar ubicación de tipos de datos
export type CoreAPIServiceGetParams = {
  path: string;
};

export type CoreAPIServicePostParams = {
  path: string;
  body: any;
};


@Injectable({
  providedIn: 'root'
})

export class CoreAPIService {
  private baseURL: string = 'http://localhost:8080/impuestovehicular-web/rest';
  constructor(private readonly httpClient: HttpClient) { }

  get(coreAPIServiceGetParams: CoreAPIServiceGetParams): Observable<Object> {
    return this.httpClient.get(`${this.baseURL}${coreAPIServiceGetParams.path}`, {
      responseType: "json",
    });
  }

  post(coreAPIServicePostParams: CoreAPIServicePostParams) {
    return this.httpClient.post(`${this.baseURL}${coreAPIServicePostParams.path}`, coreAPIServicePostParams.body);
  }
}
