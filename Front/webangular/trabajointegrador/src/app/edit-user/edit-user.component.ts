import { Component, OnInit, Input } from '@angular/core';
import { User } from '../model/User';

@Component({
  selector: 'app-edit-user',
  templateUrl: './edit-user.component.html',
  styleUrls: ['./edit-user.component.css']
})
export class EditUserComponent implements OnInit {
  @Input() user: User;

  constructor() { }

  ngOnInit(): void {
 
  }

}
