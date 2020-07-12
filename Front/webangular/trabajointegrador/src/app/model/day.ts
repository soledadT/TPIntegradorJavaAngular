export class Day {
    public Id: number;
    public NameDay: string;
    public Active: boolean;
    constructor(id: number, nameDay: string, active: boolean ){
            this.Id = id;
            this.NameDay = nameDay;
            this.Active =  active;
              }
   public getId(): number {
            return this.Id;
        }
    public getNameDay() {
            return this.NameDay;
        }
    public getActive() {
            return this.Active;
        }
    }
