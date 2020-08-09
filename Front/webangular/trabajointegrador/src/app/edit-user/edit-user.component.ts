import { Component, OnInit, Input } from '@angular/core';
import { User } from '../model/User';
import { Router } from '@angular/router';
import { UserServiceService } from '../services/user-service.service';
import { Level } from '../model/level';
import { Category } from '../model/category';
import { Cost } from '../model/cost';
import { LevelService } from '../services/level.service';
import { CategoryService } from '../services/category.service';
import { CostService } from '../services/cost.service';

@Component({
  selector: 'app-edit-user',
  templateUrl: './edit-user.component.html',
  styleUrls: ['./edit-user.component.css']
})
export class EditUserComponent implements OnInit {
public user: User;
public listLevel: Level[];
public listCategory: Category[];
public listCost: Cost[];


  constructor(
     private userService: UserServiceService,
     private levelService: LevelService,
     private categoryService: CategoryService,
     private costService: CostService) { }

  ngOnInit(): void {
    this.user = this.userService.user;
    this.levelService.obtenerLevel().subscribe( (data: { listobjectAnswer: any; }) => {
     this.listLevel = data.listobjectAnswer;
    }, err => {
      return (err);
    });

    this.costService.obtenerCost().subscribe( (data: { listobjectAnswer: any; }) => {
      this.listCost = data.listobjectAnswer;
    }, err => {
      return (err);
    });

    this.categoryService.obtenerCategory().subscribe( (data: { listobjectAnswer: any; }) => {
     this.listCategory = data.listobjectAnswer;
    }, err => {
      return (err);
    });
  }
}
