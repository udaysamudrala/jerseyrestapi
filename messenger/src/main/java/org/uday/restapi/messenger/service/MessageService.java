package org.uday.restapi.messenger.service;

import java.util.ArrayList;
import java.util.List;

import org.uday.restapi.messenger.model.Message;

public class MessageService {
	
	public List<Message> getAllMessages(){
		
		Message msg1 = new Message(1,"horror novel","sammuel");
		Message msg2 = new  Message(1, "Comedy","chaplin");
		Message msg3 = new Message(3, "Crime Stories","Raymond");
		
		List<Message> list = new ArrayList<>();
		list.add(msg1);
		list.add(msg2);
		list.add(msg3);
		return list;
	}

}
