package ContactService;

import java.util.ArrayList;


public class ContactService {
	
	// list containing contacts
	private ArrayList<Contact> contacts;
	
	// call for the list
	public ContactService() {
		contacts = new ArrayList<>();
	}
	
	// function for adding a contact
	public boolean addContact(Contact contact) {
		
		
		// default contact not found yet
		boolean contactFound = false;
		
		// parse through contact list
		for (Contact contactList:contacts) {
			
			// if contact is already in list
			if (contactList.equals(contact)) {
				// contact was found is true
				contactFound = true;
			}
		}
		
		// if contact is not in list
		if (!contactFound) {
			// add new contact
			contacts.add(contact);
			// now contact found is true
			return true;
		}
		else {
			return false;
		}
	}
	
	// function for deleting contact with ID
	public boolean deleteContact(String contactId) {
		
		// parse through contact list
		for (Contact contactList:contacts) {
			
			// once match to contactId is found
			if (contactList.getContactId().equals(contactId)) {
				// delete contact
				contacts.remove(contactList);
				return true;
			}
		}
		return false;
	}
	
	// function for updating contact with full parameters
	public boolean updateContact(String contactId, String firstName, String lastName, String phone, String address) {
		
		// parse through contact list
		for (Contact contactList:contacts) {
			
			// if contact ID match found
			if (contactList.getContactId().equals(contactId)) {
				
				// if first name is not null and not greater than 10 in length
				if (!firstName.equals("") && !(firstName.length() > 10)) {
					// update contact first name
					contactList.setFirstName(firstName);
				}
				
				// if last name is not null and not greater than 10 in length
				if (!lastName.equals("") && !(lastName.length() > 10)) {
					// update contact last name
					contactList.setLastName(lastName);
				}
				
				// if phone number is not null and has correct amount of digits
				if (!phone.equals("") && (phone.length() == 10)) {
					// update phone number
					contactList.setPhone(phone);
				}
				
				// if address is not null and is not of 30 in length
				if (!address.equals("") && !(address.length() > 30)) {
					// update address
					contactList.setAddress(address);
				}
				return true;
			}
		}
		return false;
	}
}
