package Tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import ContactService.Contact;
import ContactService.ContactService;

public class ContactServiceTest {

	//test examples for add, delete, and update
	/* 
	 * Contact("1234567", "Pop", "Savage", "1234569870", "Can of W. A. Lane");
	   Contact("7654321", "Pickle", "Pete", "0987654321", "Vinegar Avenue");
	   Contact("3217654", "Rollin", "Rick", "7656545236", "Never Gonna Give Road");
	*/

	// test for addContact in ContactService
	@Test
	public void testAdd() {
		
		ContactService cs = new ContactService();
		
		Contact test1 = new Contact("1234567", "Pop", "Savage", "1234569870", "Can of W. A. Lane");
		
		assertEquals(true, cs.addContact(test1));
	}

	// test for deleteContact in ContactService
	@Test
	public void testDelete() {
		
		ContactService cs = new ContactService();
		
		Contact test1 = new Contact("1234567", "Pop", "Savage", "1234569870", "Can of W. A. Lane");
		Contact test2 = new Contact("7654321", "Pickle", "Pete", "0987654321", "Vinegar Avenue");
		Contact test3 = new Contact("3217654", "Rollin", "Rick", "7656545236", "Never Gonna Give Road");
		
		cs.addContact(test1);
		cs.addContact(test2);
		cs.addContact(test3);
		
		assertEquals(true, cs.deleteContact("1234567"));
		assertEquals(false, cs.deleteContact("1234569"));
		assertEquals(false, cs.deleteContact("1234567"));
	}

	// test for updateContact in ContactService
	@Test
	public void testUpdate() {
		
		ContactService cs = new ContactService();
		
		Contact test1 = new Contact("1234567", "Pop", "Savage", "1234569870", "Can of W. A. Lane");
		Contact test2 = new Contact("7654321", "Pickle", "Pete", "0987654321", "Vinegar Avenue");
		Contact test3 = new Contact("3217654", "Rollin", "Rick", "7656545236", "Never Gonna Give Road");
		
		cs.addContact(test1);
		cs.addContact(test2);
		cs.addContact(test3);
		
		assertEquals(true, cs.updateContact("7654321", "Pickle", "Pete", "0987654321", "Vinegar Avenue"));
		assertEquals(false, cs.updateContact("7654320", "Pickle", "Pete", "0987654321", "Vinegar Avenue"));
	}
}
