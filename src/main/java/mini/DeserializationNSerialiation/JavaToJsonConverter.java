package mini.DeserializationNSerialiation;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
//JSON to Java
public class JavaToJsonConverter {
    
    public static void main(String[] args) throws Exception {
        InvoiceEx invoice = new InvoiceEx();
        invoice.setCustomerEmail("santhosh@gmail.com");
        invoice.setCustomerName("Santhosh Naidu");
        invoice.setCustomerNo("91333");
        invoice.setInvoiceID("123");
        invoice.setPaidAmt("333");
        
        ObjectMapper objmap = new ObjectMapper();
        
        // Serialize the invoice object to JSON and write to file
        objmap.writeValue(new File("invoice.json"), invoice);
        System.out.println("Invoice JSON created successfully!");
        
        // Optionally, print the invoice object
        System.out.println("Invoice Details: " + invoice);
    }
}
