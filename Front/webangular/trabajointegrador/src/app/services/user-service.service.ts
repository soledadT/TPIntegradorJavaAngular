import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from '../model/User';

@Injectable({
  providedIn: 'root'
})
export class UserServiceService {
public user: User;

  constructor(private http: HttpClient) { }

  guardoUser(user: User): any {
    return this.http.post('http://localhost:8080/insertUser', user);
  }

   obtenerUsuarios(): any {
    return this.http.get('http://localhost:8080/allUsers');
   }
}
