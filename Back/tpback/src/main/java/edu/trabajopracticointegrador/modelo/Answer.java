package edu.trabajopracticointegrador.modelo;

import org.springframework.stereotype.Component;

@Component
public class Answer<T> {
	
	private int code;
	private String messange;
	private T objectAnswer;
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

}
