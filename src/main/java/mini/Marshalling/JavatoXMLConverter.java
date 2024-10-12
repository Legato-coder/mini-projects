package mini.Marshalling;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;


public class JavatoXMLConverter {
	
	public static void main(String[] args) throws Exception{
		
		Ticket ticket=new Ticket();
		ticket.setId(1);
		ticket.setFrom("Hyderabad");
		ticket.setPrice(3000);
		ticket.setStatus("Approved");
		
		JAXBContext jaxbContext= JAXBContext.newInstance(Ticket.class);
		Marshaller marshaller=jaxbContext.createMarshaller();
		marshaller.marshal(ticket, new File("ticket.XML"));
		System.out.println("XML File created successfully");
		
	}

}
