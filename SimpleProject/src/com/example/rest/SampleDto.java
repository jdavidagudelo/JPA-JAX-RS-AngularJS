package com.example.rest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import model.Sample;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="SampleDto")
public class SampleDto {
	public SampleDto(){
		
		
	}
	public SampleDto(Sample s){
		id = s.getId();
		text = s.getText();
	}
	@XmlElement(name="id")
	private int id;
	@XmlElement(name = "text")
	private String text;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
}
