import { Component, OnInit } from '@angular/core';
import { RolService } from '../services/rol.service';
import { Rol } from '../model/rol';

@Component({
  selector: 'app-edit-rol',
  templateUrl: './edit-rol.component.html',
  styleUrls: ['./edit-rol.component.css']
})
export class EditRolComponent implements OnInit {

  public id: number;
  public description: string;
  public active: boolean;
  public mensaje: string;

  constructor(private rolService: RolService) { }

  ngOnInit(): void {
  }

  guardar() {
    const rol = new Rol(this.id, this.description, this.active);
    this.rolService.guardoRol(rol).subscribe((data: { messange: string; }) => {
             this.mensaje = data.messange;
             }, (err: any) => {
              return (err);
            });
         }

}
