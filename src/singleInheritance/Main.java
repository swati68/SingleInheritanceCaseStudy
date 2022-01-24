package singleInheritance;

import java.util.Scanner;

class Person{
	//declaring the variables
	private String name;
	private String dateOfBirth;
	private String gender;
	private String mobileNumber;
	private String bloodGroup;
	
	//setters for Person Class
	void setName(String name) {
		this.name=name;	
	}
	void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth=dateOfBirth;	
	}
	void setGender(String gender) {
		this.gender=gender;	
	}
	void setMobileNumber(String mobileNumber) {
		this.mobileNumber=mobileNumber;	
	}
	void setBloodGroup(String bloodGroup) {
		this.bloodGroup=bloodGroup;	
	}
	
	//getters for Person Class
	String getName() {
		return name;
	}
	
	String getDateOfBirth() {
		return dateOfBirth;
	}
	String getGender() {
		return gender;
	}
	String getMobileNumber() {
		return mobileNumber;
	}
	String getBloodGroup() {
		return bloodGroup;
	}
}

class Donor extends Person {
	//declaring variables
	private String bloodBankName;
	private String donorType;
	private String donationDate;
	
	//setters for Donor Class
	void setBloodBankName(String bloodBankName) {
		this.bloodBankName = bloodBankName;
	}
	void setDonorType(String donorType) {
		this.donorType = donorType;
	}
	void setDonationDate(String donationDate) {
		this.donationDate = donationDate;
	}
	
	//getters for Donor Class
	String getBloodBankName() {
		return bloodBankName;
	}
	String getDonorType() {
		return donorType;
	}
	String getDonationDate() {
		return donationDate;
	}
	
	//Display function of Donor Class
	public void displayDonationDetails() {
		System.out.println("Donation Details:");
		System.out.println("Name : "+getName());
		System.out.println("Date of Birth : "+getDateOfBirth());
		System.out.println("Gender : "+getGender());
		System.out.println("Mobile Number : "+getMobileNumber());
		System.out.println("Blood Group : "+getBloodGroup());
		System.out.println("Blood Bank Name : "+getBloodBankName());
		System.out.println("Donor Type : "+getDonorType());
		System.out.println("Donation Date : "+getDonationDate());
	}
}
public class Main {

	public static void main(String[] args) {
		//creating object for Donor Class
		Donor d = new Donor();
		//Getting User Input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name:");
		String n = sc.nextLine();
		d.setName(n);
		System.out.println("Enter Date of Birth:");
		String dob = sc.nextLine();
		d.setDateOfBirth(dob);
		System.out.println("Enter Gender:");
		String g = sc.nextLine();
		d.setGender(g);
		System.out.println("Enter Mobile Number:");
		String mb = sc.nextLine();
		d.setMobileNumber(mb);
		System.out.println("Enter Blood Group:");
		String bg = sc.nextLine();
		d.setBloodGroup(bg);
		System.out.println("Enter Blood Bank Name:");
		String bbn = sc.nextLine();
		d.setBloodBankName(bbn);
		System.out.println("Enter Donor Type:");
		String dt = sc.nextLine();
		d.setDonorType(dt);
		System.out.println("Enter Donation Date:");
		String dd = sc.nextLine();
		d.setDonationDate(dd);
		
		//calling the display function
		d.displayDonationDetails();
		sc.close();
	}

}
