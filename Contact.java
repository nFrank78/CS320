package ContactService;

public class Contact {
	// Contact variables declared
	String contactId;
	String firstName;
	String lastName;
	String phone;
	String address;
	
	// Contact constructor with parameters
	public Contact(String contactId, String firstName, String lastName, String phone, String address) {
		
		// if contactId null throw exception
		if (contactId.equals("") ) {
			throw new IllegalArgumentException("Invalid ID.");	
		}
		else if (contactId.length() > 10) {
			throw new IllegalArgumentException("Invalid. ID too long.");
		}
		else {
			this.contactId = contactId;
		}
		
		// if first name is null or greater than 10 in length throw exception
		if (firstName.equals("")) {
			throw new IllegalArgumentException("Invalid. First name cannot be blank.");
		}
		else if (firstName.length() > 10) {
				throw new IllegalArgumentException("Invalid. First name is too long.");
		}
		else {
			this.firstName = firstName;
		}
		
		// if last name is null or greater than 10 in length throw exception
		if (lastName.equals("")) {
			throw new IllegalArgumentException("Invalid. Last name cannot be blank.");
		}
		else if (lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid. Last name is too long.");
		}
		else {
			this.lastName = lastName;
		}
		
		// if phone number is null or not 10 in length throw exception
		if (phone.equals("")) {
			throw new IllegalArgumentException("Invalid. Phone number cannot be blank.");
		}
		else if (phone.length() != 10) {
			throw new IllegalArgumentException("Invalid. Phone number must be 10 digits.");
		}
		else {
			this.phone = phone;
		}
		
		// if address is null or greater than 30 in length throw exception
		if (address.equals("")) {
			throw new IllegalArgumentException("Invalid. Address cannot be blank.");
		}
		else if (address.length() > 30) {
			throw new IllegalArgumentException("Invalid. Address is too long.");
		}
		else {
			this.address = address;
		}
	}
	
	// getters for Contact
	public String getContactId() {
		return contactId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	
	// setters for Contact (ID cannot be altered so missing setter)
	public void setFirstName(String firstName) {
		// if first name is null or greater than 10 in length throw exception
		if (firstName.equals("")) {
			throw new IllegalArgumentException("Invalid. First name cannot be blank.");
		}
		else if (firstName.length() > 10) {
				throw new IllegalArgumentException("Invalid. First name is too long.");
		}
		else {
			this.firstName = firstName;
		}
	}
	
	public void setLastName(String lastName) {
		// if last name is null or greater than 10 in length throw exception
		if (lastName.equals("")) {
			throw new IllegalArgumentException("Invalid. Last name cannot be blank.");
		}
		else if (lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid. Last name is too long.");
		}
		else {
			this.lastName = lastName;
		}
	}
	public void setPhone(String phone) {
		// if phone number is null or not 10 in length throw exception
		if (phone.equals("")) {
			throw new IllegalArgumentException("Invalid. Phone number cannot be blank.");
		}
		else if (phone.length() != 10) {
			throw new IllegalArgumentException("Invalid. Phone number must be 10 digits.");
		}
		else {
			this.phone = phone;
		}
	}
	
	public void setAddress(String address) {
		// if address is null or greater than 30 in length throw exception
		if (address.equals("")) {
			throw new IllegalArgumentException("Invalid. Address cannot be blank.");
		}
		else if (address.length() > 30) {
			throw new IllegalArgumentException("Invalid. Address is too long.");
		}
		else {
			this.address = address;
		}
	}
}
