import { Injectable } from '@angular/core';
import { Level } from '../model/level';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class LevelService {
public level: Level;

  constructor(private http: HttpClient) { }

  guardoLevel(level: Level): any {
    return this.http.post('http://localhost:8080/insertLevel', level);
  }

  obtenerLevel(): any {
    return this.http.get('http://localhost:8080/allLevel');
   }
}
