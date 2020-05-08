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
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	@Column
	private String Name;
	@Column
	private String Surname;
	@Column
	private String DNI;
	@Column
	private  Date BirthDay;
	@Column
	private String Mail;
	@Column
	private String SocialWork;
	@Column
	private String MedicalCertificate;
	@Column
	private String Picture;
	@Column
	private String ContactName;
	@Column
	private String ContactSurname;
	@Column
	private String ContactDNI;
	@Column
	private String ContactMail;
	@Column
	private String ContactPhone;

	
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
	public String getPicture() {
		return Picture;
	}
	public void setPicture(String picture) {
		Picture = picture;
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
	
}
