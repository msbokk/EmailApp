package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailBoxCapacity=500;
	private String alternateEmail;
	private int defaultPasswordLength=8;
	private String email;
	private String companySuffix="google";
	
	public Email(String firstName, String lastName) {
		this.firstName= firstName;
		this.lastName = lastName;
		
		this.department=department();
		System.out.println("Department selected "+this.department);
		this.password=randomPassword(defaultPasswordLength);
		System.out.println("Password is :"+this.password);
		email=firstName.toLowerCase() + "." + lastName.toLowerCase()+"@"+companySuffix+"."+"com";
		
	}
	
	private String department() {
		System.out.print("CODES FOR DEPARTMENT\n1 for Development\n2 for Sales\n3 for Accounting\n0 for None\nEnter your choice: ");
		Scanner in= new Scanner(System.in);
		int deptChoice=in.nextInt();
		if(deptChoice==1) {return("Dev");}
		else if(deptChoice==2) {return("Sales");}
		else if(deptChoice==3) {return("Accounts");}
		else {return("");}
		
		
	}
	
	private String randomPassword(int length) {
		String passwordSet= "abcdefghijklmnopqrstuvwxyz1234567890!@#$%";
		char[] password = new char [length];
		for(int i=0;i<length;i++) {
			int rand=(int) (Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return(new String(password));
	}
	
	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity= capacity;
	}
	
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail=altEmail;
	}
	
	public void setPassword(String password) {
		this.password=password;
	}
	
	public int getMailBoxCapacity() {return mailBoxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return password;}
	
	public String showInfo() {
		return "Display Name: "+firstName+" "+lastName+
				"\nCompany Email: "+email+" "+
				"\nMail Box Capacity: "+mailBoxCapacity+"mb";
	}

}
