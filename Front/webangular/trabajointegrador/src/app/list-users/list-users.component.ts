import { Component, OnInit } from '@angular/core';
import { UserServiceService } from '../services/user-service.service';
import { User } from '../model/User';

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
  this.selectedUser = user;
}

  constructor(private userService: UserServiceService) { }

  ngOnInit(): void {
    this.userService.obtenerUsuarios().subscribe( (data: { listobjectAnswer: any; }) => {
      this.listUser = data.listobjectAnswer;
    }, err => {
      return (err);
    });
  }
}
