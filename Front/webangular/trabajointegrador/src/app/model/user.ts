

export class User {
 
    private Id : Number;
	
	private Name : String;
	
	private Surname: String;
	
	private DNI : String;
	
	private BirthDay : String;

	private Mail : String;
	
	private SocialWork : String;

	private MedicalCertificate : String;
	
	private NroPartner : String;
	
	private ContactName : String;
	
	private ContactSurname : String;
	
	private ContactDNI : String;
	
	private ContactMail : String;
	
	private ContactPhone : String;
	
	private Password : String;
	
    private Active : Boolean;
    
    constructor(id : Number, name: String, surname : String, dni : String ,
        birthDay : String , mail : String, socialWork : String, 
        medicalCertificate : String, nroPartner  : String, contactName : String , 
        contactSurname : String , contactDNI : String, contactMail: String,
        contactPhone : String , password : String , active  : Boolean ){
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

    public getId(){
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