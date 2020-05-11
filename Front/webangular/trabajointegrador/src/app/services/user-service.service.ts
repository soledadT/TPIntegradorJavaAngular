import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from '../model/User';

@Injectable({
  providedIn: 'root'
})
export class UserServiceService {

  constructor(private http: HttpClient) { }

  guardoUser(user: User) {
    this.http.post('http://localhost:8080/insertUser', user).subscribe(data => {
      console.log(data);
    }, err => {
      console.log(err);
    });

  }
}
