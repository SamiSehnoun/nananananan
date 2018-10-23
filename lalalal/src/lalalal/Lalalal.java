/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lalalal;


import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author 74155232
 */
public class Lalalal {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
         Customer customer = new Customer();
	  customer.setId(100);
	  customer.setNome("sami");
	  customer.setEta(18);

	  try {

		File file = new File("C:\\Users\\74155232.CASTELLI\\Desktop\\XML\\file.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

		// output pretty printed
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		jaxbMarshaller.marshal(customer, file);
		jaxbMarshaller.marshal(customer, System.out);

	      } catch (JAXBException e) {
		e.printStackTrace();
	      }

	}
}
    
