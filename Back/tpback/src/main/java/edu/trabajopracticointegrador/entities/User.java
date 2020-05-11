package edu.trabajopracticointegrador.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User  {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int Id;
	@Column
	public  String Name;
	@Column
	public  String Surname;
	@Column
	public  String DNI;
	@Column
	public   Date BirthDay;
	@Column
	public  String Mail;
	@Column
	public String SocialWork;
	@Column
	public  String MedicalCertificate;
	@Column
	public  String NroPartner;
	@Column
	public  String ContactName;
	@Column
	public  String ContactSurname;
	@Column
	public String ContactDNI;
	@Column
	public  String ContactMail;
	@Column
	public  String ContactPhone;
	@Column
	public  String Password;
	@Column
	public  Boolean Active;

	
	public Date getBirthDay() {
		return BirthDay;
	}
	public void setBirthDay(Date birthDay) {
		BirthDay = birthDay;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getMail() {
		return Mail;
	}
	public void setMail(String mail) {
		Mail = mail;
	}
	public String getSocialWork() {
		return SocialWork;
	}
	public void setSocialWork(String socialWork) {
		SocialWork = socialWork;
	}
	public String getMedicalCertificate() {
		return MedicalCertificate;
	}
	public void setMedicalCertificate(String medicalCertificate) {
		MedicalCertificate = medicalCertificate;
	}
	public String getNroPartner() {
		return NroPartner;
	}
	public void setNroPartner(String nroPartner) {
		NroPartner = nroPartner;
	}
	public String getContactName() {
		return ContactName;
	}
	public void setContactName(String contactSurname) {
		ContactName = contactSurname;
	}
	public String getContactSurname() {
		return ContactSurname;
	}
	public void setContactSurname(String contactSurname) {
		ContactSurname = contactSurname;
	}
	public String getContactDNI() {
		return ContactDNI;
	}
	public void setContactdni(String contactDNI) {
		ContactDNI= contactDNI;
	}
	public String getContactMail() {
		return ContactMail;
	}
	public void setContactmail(String contactMail) {
		ContactMail = contactMail;
	}
	public String getContactPhone() {
		return ContactPhone;
	}
	public void setContactTelefono(String contactPhone) {
		ContactPhone= contactPhone;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Boolean getActive() {
		return Active;
	}
	public void setActive(Boolean active) {
		Active = active;
	}
	
}
