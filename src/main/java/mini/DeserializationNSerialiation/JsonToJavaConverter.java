package mini.DeserializationNSerialiation;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJavaConverter {

	public static void main(String[] args) throws Exception {

		ObjectMapper objmp = new ObjectMapper();
		InvoiceEx invoice2 = objmp.readValue(new File("invoice.JSON"), InvoiceEx.class);
		System.out.println(invoice2);

	}

}
