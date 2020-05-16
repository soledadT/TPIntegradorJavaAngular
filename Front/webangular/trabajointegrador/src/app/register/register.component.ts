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
  public namecontacto: string;
  public surnamecontacto: string;
  public dnicontacto: string;
  public emailcontacto: string;
  public isChild = false ;


  constructor(private userService: UserServiceService, public datepipe: DatePipe) { }

  ngOnInit(): void {
  }

   guardar() {
    const today = new Date();
    const yearNow = today.getFullYear();
    const year = this.datepipe.transform(this.birthday, 'YYYY');

    // tslint:disable-next-line: radix
    if (yearNow - Number.parseInt(year)  < 18) {
      this.isChild = true;

    } else {

      const user = new User(this.id, this.name,
        this.surname, this.dni, this.datepipe.transform(this.birthday, 'yyyy-MM-dd'),
        this.email, this.socialwork,
        this.medicalcertificate, this.nropartner,
         this.namecontacto, this.surnamecontacto, this.dnicontacto, this.emailcontacto, '', '', true);
      this.userService.guardoUser(user).subscribe((data: { messange: string; }) => {
            this.mensaje = data.messange;
            }, err => {
             return (err);
           });
         }
        }
}
