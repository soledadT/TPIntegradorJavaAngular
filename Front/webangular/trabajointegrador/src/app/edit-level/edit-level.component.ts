import { Component, OnInit } from '@angular/core';
import { LevelService } from '../services/level.service';
import { Level } from '../model/level';

@Component({
  selector: 'app-edit-level',
  templateUrl: './edit-level.component.html',
  styleUrls: ['./edit-level.component.css']
})
export class EditLevelComponent implements OnInit {
  public id: number;
  public description: string;
  public active: boolean;
  public mensaje: string;

  constructor(private levelService: LevelService) { }

  ngOnInit(): void {
  }

  guardar() {
    const level = new Level(this.id, this.description, this.active);
    this.levelService.guardoLevel(level).subscribe((data: { messange: string; }) => {
             this.mensaje = data.messange;
             }, (err: any) => {
              return (err);
            });
         }

}
