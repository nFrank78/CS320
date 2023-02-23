package Tests;

import org.junit.jupiter.api.Test;

import ContactService.Contact;
import TaskService.Task;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;



class ContactTest {
	
	// test class as an object for all functions
	Contact contact = new Contact("12", "pickle", "pete", "0987654321", "Vinegar Avenue");
	String contactId = "12";
	String contactIdLong = "1234567890123456789";
	String firstName = "pickle";
	String firstNameLong = "pickletoolongbud";
	String lastName = "pete";
	String lastNameLong = "petetoolongaswellbud";
	String phone = "0987654321";
	String phoneLong = "123456789012345678";
	String address = "Vinegar Avenue";
	String addressLong = "this is too long of an address string so it should throw exception bud.";
	
	// test getContactId
	@Test
	void getContactId() {
        assertEquals("12", contact.getContactId());
    }

	// test getFirstName
    @Test
    void getFirstName() {
        assertEquals("pickle", contact.getFirstName());
    }

    // test getLastName
    @Test
    void getLastName() {
        assertEquals("pete", contact.getLastName());
    }

    // test getPhone
    @Test
    void getPhone() {
        assertEquals("0987654321", contact.getPhone());
    }

    // test getAddress
    @Test
    void getAddress() {
        assertEquals("Vinegar Avenue", contact.getAddress());
    }
    
    // test setFirstName
    @Test
    void setFirstNameTest() {
    	contact.setFirstName(firstName);
        assertEquals(firstName, contact.getFirstName());
    }
    
    // test setFirstName too long
    @Test
    void setFirstNameLongTest() {
        assertThrows(IllegalArgumentException.class, () -> contact.setFirstName(firstNameLong));
    }
    
    // test setFirstName empty
    @Test
    void setFirstNameEmptyTest() {
        assertThrows(IllegalArgumentException.class, () -> contact.setFirstName(""));
    }
    
    // test setLastName
    @Test
    void setLastNameTest() {
    	contact.setLastName(lastName);
        assertEquals(lastName, contact.getLastName());
    }
    
    // test setLastName too long
    @Test
    void setLastNameLongTest() {
        assertThrows(IllegalArgumentException.class, () -> contact.setLastName(lastNameLong));
    }
    
    // test setLastName empty
    @Test
    void setLastNameEmptyTest() {
        assertThrows(IllegalArgumentException.class, () -> contact.setLastName(""));
    }
    
    // test setPhone
    @Test
    void setPhoneTest() {
    	contact.setPhone(phone);
        assertEquals(phone, contact.getPhone());
    }
    
    // test setPhone too long
    @Test
    void setPhoneLongTest() {
        assertThrows(IllegalArgumentException.class, () -> contact.setPhone(phoneLong));
    }
    
    // test setPhone empty
    @Test
    void setPhoneEmptyTest() {
        assertThrows(IllegalArgumentException.class, () -> contact.setPhone(""));
    }
    
    // test setAddress
    @Test
    void setAddressTest() {
    	contact.setAddress(address);
        assertEquals(address, contact.getAddress());
    }
    
    // test setAddress too long
    @Test
    void setAddressLongTest() {
        assertThrows(IllegalArgumentException.class, () -> contact.setAddress(addressLong));
    }
    
    // test setAddress empty
    @Test
    void setAddressEmptyTest() {
        assertThrows(IllegalArgumentException.class, () -> contact.setAddress(""));
    }
    
    // test contact ID too long
    @Test
    void idTooLongTest() {
    	assertThrows(IllegalArgumentException.class, () -> new Contact(contactIdLong, firstName, lastName, phone, address));
    }
    
    // test contact ID empty
    @Test
    void idEmptyTest() {
    	assertThrows(IllegalArgumentException.class, () -> new Contact("", firstName, lastName, phone, address));
    }
    
    // test contact first name empty
    @Test
    void firstNameEmptyTest() {
    	assertThrows(IllegalArgumentException.class, () -> new Contact(contactId, "", lastName, phone, address));
    }
    
    // test contact first name too long
    @Test
    void firstNameTooLongTest() {
    	assertThrows(IllegalArgumentException.class, () -> new Contact(contactId, firstNameLong, lastName, phone, address));
    }
    
    // test contact last name empty
    @Test
    void lastNameEmptyTest() {
    	assertThrows(IllegalArgumentException.class, () -> new Contact(contactId, firstName, "", phone, address));
    }
    
    // test contact last name too long
    @Test
    void lastNameTooLongTest() {
    	assertThrows(IllegalArgumentException.class, () -> new Contact(contactId, firstName, lastNameLong, phone, address));
    }
    
    // test contact phone empty
    @Test
    void phoneEmptyTest() {
    	assertThrows(IllegalArgumentException.class, () -> new Contact(contactId, firstName, lastName, "", address));
    }
    
    // test contact phone too long
    @Test
    void phoneTooLongTest() {
    	assertThrows(IllegalArgumentException.class, () -> new Contact(contactId, firstName, lastName, phoneLong, address));
    }
    
    // test contact address empty
    @Test
    void addressEmptyTest() {
    	assertThrows(IllegalArgumentException.class, () -> new Contact(contactId, firstName, lastName, phone, ""));
    }
    
    // test contact address too long
    @Test
    void addressTooLongTest() {
    	assertThrows(IllegalArgumentException.class, () -> new Contact(contactId, firstName, lastName, phone, addressLong));
    }
}