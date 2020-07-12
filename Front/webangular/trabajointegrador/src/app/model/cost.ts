export class Cost {
    public Id: number;
    public Description: string;
    public Active: boolean;
    constructor(id: number, description: string, active: boolean ){
            this.Id = id;
            this.Description = description;
            this.Active =  active;
              }
   public getId(): number {
            return this.Id;
        }
    public getDescription() {
            return this.Description;
        }
    public getActive() {
            return this.Active;
        }
    }
