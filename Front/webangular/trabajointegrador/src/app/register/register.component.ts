import { Component, OnInit } from '@angular/core';
import { User } from '../model/User';
import { UserServiceService } from '../services/user-service.service';
import { DatePipe } from '@angular/common';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  public id: number;
  public name: string;
  public surname: string;
  public dni: string;
  public birthday: Date;
  public email: string;
  public socialwork: string;
  public medicalcertificate: string;
  public nropartner: string;
  public mensaje: string;
  


  constructor(private userService: UserServiceService, public datepipe: DatePipe) { }

  ngOnInit(): void {
  }

   guardar() {
     const user = new User(this.id, this.name,
      this.surname, this.dni, this.datepipe.transform(this.birthday, 'yyyy-MM-dd'),
      this.email, this.socialwork,
      this.medicalcertificate, this.nropartner,
       '', '', '', '', '', '', true);

     this.userService.guardoUser(user).subscribe(data => {
      this.mensaje = data.messange;
    }, err => {
      return (err);
    });
   }
}
