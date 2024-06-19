package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private String alternateEmail;
	private int mailboxCapacity = 500;
	private String companySuffix = "lowcompany.com";
	private int defaultPasswordLength = 10;
	
	
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		this.department = setDepartment();
	
		
		this.password = randomPassword(defaultPasswordLength);
		
		
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." +  companySuffix;
		
	}
	
	private String setDepartment() {
		System.out.println("Enter the Department: \n1. Sales\n2. Accounting\n3. Development\0. None\nEnter Department Code: ");
		Scanner in = new Scanner(System.in); // Input
		int departChoice = in.nextInt();
		if(departChoice == 1) {
			return "sales";
		}
		else if(departChoice == 2) {
			return "accounting";
		}
		else if(departChoice == 3) {
			return "development";
		}
		else {
			return "";
		}
		
	}
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*().,";
		char[] password = new char[length];
		for(int i=0; i<length; i++) {
			int rand = 	(int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
			/*
			System.out.println("Random  " + Math.random() ); //Gives a random 0.random values
			System.out.println("Length:  "+ passwordSet.length());//Length of the passwordSet = 38
			System.out.println("Random * passwordSet.length()  " + Math.random() * passwordSet.length()); //both multiplies to give a set of decimal values 
			System.out.println("int  " + rand ); // decimal values is converted to integer
			*/
		}
		return new String(password);
	}
	//Encapsulation 
	//Setters
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	public void changePassword(String password) {
		this.password = password;
	}
	//Getters
	public int getMailboxCapacity() {return mailboxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return password;}
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName
				+ "\nCOMPANY EMAIL: " + email + 
				"\nPASSWORD: " + password + 
				"\nMAIL BOX CAPACITY: " +mailboxCapacity + "mb";
	}
}

