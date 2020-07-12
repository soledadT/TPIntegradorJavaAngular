import { Injectable } from '@angular/core';
import { Day } from '../model/day';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class DayService {
  public day: Day;

  constructor(private http: HttpClient) { }

  guardoDay(day: Day): any {
    return this.http.post('http://localhost:8080/insertDay', day);
  }
}
