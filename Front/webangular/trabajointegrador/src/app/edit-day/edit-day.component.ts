import { Component, OnInit } from '@angular/core';
import { Day } from '../model/day';
import { DayService } from '../services/day.service';

@Component({
  selector: 'app-edit-day',
  templateUrl: './edit-day.component.html',
  styleUrls: ['./edit-day.component.css']
})
export class EditDayComponent implements OnInit {

  public id: number;
  public dayName: string;
  public active: boolean;
  public mensaje: string;

  constructor(private dayService: DayService) { }

  ngOnInit(): void {
  }

  guardar() {
    const day = new Day(this.id, this.dayName, this.active);
    this.dayService.guardoDay(day).subscribe((data: { messange: string; }) => {
             this.mensaje = data.messange;
             }, (err: any) => {
              return (err);
            });
         }

}
