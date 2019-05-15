package org.uday.restapi.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {
	
	private int id;
	private String message;
	private Date created;
	private String author;
	
	
	// creating a no- arg constructor 
	
	public Message() {
		
	}
	public Message(int id,String message, String author ) {
		this.id = id ;
		this.message = message;
		this.author = author;
		this.created = new Date();
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String msg)
	{
		this.message = msg;
	}
	public Date getDate() {
		return created;
	}
	public void setDate(Date created) {
		this.created = created;
	}
	public  String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
}
