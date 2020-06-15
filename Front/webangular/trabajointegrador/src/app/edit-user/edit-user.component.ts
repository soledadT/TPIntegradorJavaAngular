import { Component, OnInit, Input } from '@angular/core';
import { User } from '../model/User';
import { Router } from '@angular/router';
import { UserServiceService } from '../services/user-service.service';

@Component({
  selector: 'app-edit-user',
  templateUrl: './edit-user.component.html',
  styleUrls: ['./edit-user.component.css']
})
export class EditUserComponent implements OnInit {
public user: User;

  constructor(private userService: UserServiceService) { }

  ngOnInit(): void {
    this.user = this.userService.user;
  }

}
