package edu.trabajopracticointegrador.modelo;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import edu.trabajopracticointegrador.entities.User;

@Component
public class Answer<T> {
	
	
	
	private int code;
	private String messange;
	private T objectAnswer;
	private Iterable<T>  listobjectAnswer;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessange() {
		return messange;
	}
	public void setMessange(String messange) {
		this.messange = messange;
	}
	public T getObjectAnswer() {
		return objectAnswer;
	}
	public void setObjectAnswer(T objectAnswer) {
		this.objectAnswer = objectAnswer;
	}
	public void setListobjectAnswer(Iterable<T> responseEntity) {
		this.listobjectAnswer = responseEntity;
	}
	
	public Iterable<T> getListobjectAnswer() {
		return listobjectAnswer;
	}

}
