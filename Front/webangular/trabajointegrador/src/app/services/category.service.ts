import { Injectable } from '@angular/core';
import { Category } from '../model/category';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CategoryService {
  public user: Category;

  constructor(private http: HttpClient) { }

  guardoCategory(category: Category): any {
    return this.http.post('http://localhost:8080/insertCategory', category);
  }
}
