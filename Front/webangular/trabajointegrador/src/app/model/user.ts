

export class User {
 
    public Id : number;
	
	public Name : string;
	
	public Surname: string;
	
	public  DNI : string;
	
	public BirthDay : string;

	public Mail : string;
	
	public SocialWork : string;

	public MedicalCertificate : string;
	
	public NroPartner : string;
	
	public ContactName : string;
	
	public ContactSurname : string;
	
	public ContactDNI : string;
	
	public ContactMail : string;
	
	public ContactPhone : string;
	
	public Password : string;
	
    public Active : boolean;
    
    constructor(id : number, name: string, surname : string, dni : string ,
        birthDay : string , mail : string, socialWork : string, 
        medicalCertificate : string, nroPartner  : string, contactName : string , 
        contactSurname : string , contactDNI : string, contactMail: string,
        contactPhone : string , password : string , active  : boolean ){
        this.Id =id;
	    this.Name = name;
        this.Surname = surname;
        this.DNI = dni;
        this.BirthDay =birthDay;
        this.Mail = mail;
        this.SocialWork = socialWork;
        this.MedicalCertificate = medicalCertificate;
        this.NroPartner = nroPartner;
        this.ContactName = contactName;
        this.ContactSurname = contactSurname;
        this.ContactDNI = contactDNI;
        this.ContactMail = contactMail;
        this.ContactPhone = contactPhone;
        this.Password = password;
        this.Active = active;
    }

    public getId() : number{
        return this.Id;
    }

    public getName(){
        return this.Name;
    }

    public getSurname(){
        return this.Surname;
    }

    public getDNI(){
        return this.DNI;
    }

    public getBirthDay(){
        return this.BirthDay;
    }

    public getMail(){
        return this.Mail;
    }

    public getSocialWork(){
        return this.SocialWork;
    }

    public getMedicalCertificate (){
        return this.MedicalCertificate ;
    }

    public getNroPartner (){
        return this.NroPartner;
    }

    public getContactName (){
        return this.ContactName;
    }

    public getContactSurname (){
        return this.ContactSurname;
    }

    public getContactDNI(){
        return this.ContactDNI;
    }

    public getContactMail (){
        return this.ContactMail;
    }

    public getContactPhone (){
        return this.ContactPhone;
    }

    public getPassword (){
        return this.Password;
    }

    public getActive(){
        return this.Active;
    }



}