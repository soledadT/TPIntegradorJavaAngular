import { Injectable } from '@angular/core';
import { Cost } from '../model/cost';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CostService {
  public cost: Cost;

  constructor(private http: HttpClient) { }

  guardoCost(cost: Cost): any {
    return this.http.post('http://localhost:8080/insertCost', cost);
  }

  obtenerCost(): any {
    return this.http.get('http://localhost:8080/allCost');
   }
}
