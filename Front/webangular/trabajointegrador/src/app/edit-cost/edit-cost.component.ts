import { Component, OnInit } from '@angular/core';
import { CostService } from '../services/cost.service';
import { Cost } from '../model/cost';

@Component({
  selector: 'app-edit-cost',
  templateUrl: './edit-cost.component.html',
  styleUrls: ['./edit-cost.component.css']
})
export class EditCostComponent implements OnInit {

  public id: number;
  public description: string;
  public active: boolean;
  public mensaje: string;

  constructor(private costService: CostService) { }

  ngOnInit(): void {
  }

  guardar() {
    const cost = new Cost(this.id, this.description, this.active);
    this.costService.guardoCost(cost).subscribe((data: { messange: string; }) => {
             this.mensaje = data.messange;
             }, (err: any) => {
              return (err);
            });
         }

}
