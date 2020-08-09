export class Category {
public Id: number;
public Description: string;
public Active: boolean;
constructor(active: boolean, description: string, id: number) {
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
