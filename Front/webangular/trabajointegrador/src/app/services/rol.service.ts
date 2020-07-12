import { Injectable } from '@angular/core';
import { Rol } from '../model/rol';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class RolService {
  public rol: Rol;

  constructor(private http: HttpClient) { }

  guardoRol(rol: Rol): any {
    return this.http.post('http://localhost:8080/insertCategory', rol);
  }
}
