import { Component, OnInit } from '@angular/core';
import { UserServiceService } from '../services/user-service.service';
import { User } from '../model/User';
import { Router } from '@angular/router';

@Component({
  selector: 'app-list-users',
  templateUrl: './list-users.component.html',
  styleUrls: ['./list-users.component.css']
})
export class ListUsersComponent implements OnInit {

  public listUser: User[];
  public mensaje: string;
  selectedUser: User;

  onSelect(user: User): void {
  this.userService.user = user;
  this.router.navigateByUrl('/editUser');
}

  constructor(private userService: UserServiceService, private router: Router) { }

  ngOnInit(): void {
    this.userService.obtenerUsuarios().subscribe( (data: { listobjectAnswer: any; }) => {
      this.listUser = data.listobjectAnswer;
    }, err => {
      return (err);
    });
  }
}
