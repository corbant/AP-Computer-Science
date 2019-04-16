package ch4Labs;

public class Name {
	private String firstName;
	private String middleName;
	private String lastName;
	
	public Name(String first, String middle, String last) {
		firstName = first;
		middleName = middle;
		lastName = last;
	}
	
	public String getFirst() {
		return firstName;
	}
	
	public String getMiddle() {
		return middleName;
	}
	
	public String getlast() {
		return lastName;
	}
	
	public String firstMiddleLast() {
		return firstName + " " + middleName + " " + lastName;
	}
	
	public String lastFirstMiddle() {
		return lastName + ", " + firstName + " " + lastName;
	}
	
	public boolean equals(Name otherName) {
		if (this.firstMiddleLast().equalsIgnoreCase(otherName.firstMiddleLast())) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String initials() {
		return firstName.substring(0, 1).toUpperCase() + middleName.substring(0, 1).toUpperCase() + lastName.substring(0, 1).toUpperCase(); 
	}
	
	public int length() {
		return firstName.length() + middleName.length() + lastName.length();
	}

}
