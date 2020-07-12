import { Component, OnInit } from '@angular/core';
import { Category } from '../model/category';
import { CategoryService } from '../services/category.service';

@Component({
  selector: 'app-edit-category',
  templateUrl: './edit-category.component.html',
  styleUrls: ['./edit-category.component.css']
})
export class EditCategoryComponent implements OnInit {
  public id: number;
  public description: string;
  public active: boolean;
  public mensaje: string;

  constructor(private categoryService: CategoryService) { }

  ngOnInit(): void {
  }

  guardar() {
    const category = new Category(this.id, this.description, this.active);
    this.categoryService.guardoCategory(category).subscribe((data: { messange: string; }) => {
             this.mensaje = data.messange;
             }, (err: any) => {
              return (err);
            });
         }

}
