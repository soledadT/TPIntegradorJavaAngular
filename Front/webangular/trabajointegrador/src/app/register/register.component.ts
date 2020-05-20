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
  public isChild: boolean;

   evaluar(): boolean {
  const anio = new Date();
  const anio2 = anio.getFullYear();
  const year = this.birthday.toString().split( '-' );
 // tslint:disable-next-line: radix
  this.isChild = ((anio2 - Number.parseInt(year[0])) < 18 ) ? true : false ;
  return this.isChild ;
}


  constructor(private userService: UserServiceService, public datepipe: DatePipe) { }

  ngOnInit(): void {
  }

   guardar() {
   const user = new User(this.id, this.name,
        this.surname, this.dni, this.datepipe.transform(this.birthday, 'yyyy-MM-dd'),
        this.email, this.socialwork,
        this.medicalcertificate, this.nropartner,
         this.namecontacto, this.surnamecontacto, this.dnicontacto, this.emailcontacto, '', '', true);
   this.userService.guardoUser(user).subscribe((data: { messange: string; }) => {
            this.mensaje = data.messange;
            }, (err: any) => {
             return (err);
           });
        }
}
