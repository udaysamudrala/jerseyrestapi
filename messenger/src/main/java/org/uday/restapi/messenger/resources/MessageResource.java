package org.uday.restapi.messenger.resources;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.uday.restapi.messenger.model.Message;
import org.uday.restapi.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {
	
	MessageService msg = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages() {
		return msg.getAllMessages(); 
}

}
