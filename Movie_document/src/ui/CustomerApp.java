package ui;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import com.capgemini.dto.Customer;
import com.capgemini.dto.Ticket;
import com.capgemini.service.CustomerServiceImpl;
import com.capgemini.service.UserServiceImpl;

public class CustomerApp {
	
	static CustomerServiceImpl csi = new CustomerServiceImpl();
	

	public static void main(String[] args) {
		
		UserServiceImpl signin = new UserServiceImpl();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter \n 1.Sign In \n 2.New User");
		
		int choice =sc.nextInt();
		switch(choice) {
		case 1: 
			//compare username and password entered by user 
			System.out.println("enter your userid");
			Integer user= sc.nextInt();
			System.out.println("enter your password");
			String pass = sc.next();
			
			boolean result = signin.signIn(user, pass);
			if(result==false) {
				System.out.println("surry");
				break;
			}
				
			else {
			}
				
			String city;
			System.out.println("Select the city: ");
			System.out.println("1.Delhi \n 2.Mumbai \n 3.Kolkata \n 4.Chennai");
			
			int n =sc.nextInt();
			switch (n) {
			case 1: city="delhi";
					csi.chooseCity(city);
				break;
				
			case 2: city="mumbai";
					csi.chooseCity(city);	
				
				break;
			
			case 3: city="Kolkata";
					csi.chooseCity(city);	
			
				break;
				
			case 4: city="chennai";
					csi.chooseCity(city);
			
				break;
			default:
				System.out.println("wrong choice");
				break;
			}
			
			
			break;
			
		case 2: 
			UserServiceImpl usi = new UserServiceImpl();
			Integer userId= 100000;
			userId++;
			System.out.println("Enter your Name");
			String name= sc.next();
		
			System.out.println("Enter the password");
			String password = sc.next();
			while(password.length()<8) {
				System.out.println("enter 8 digit password");
				password = sc.next();
			}
		
			System.out.println("Enter date of birth in YYYY-MM-DD");
			String date = sc.next();
			LocalDate dob = LocalDate.parse(date);
		
			System.out.println("Enter the Contact Number");
			String contact= sc.next();
			while (contact.length() !=10) {
				System.out.println("Contact Number should be 10 digit");
				contact= sc.next();
			}
		
			ArrayList<Ticket> myTicket = new ArrayList<Ticket>();
		
			Customer details = new Customer(userId, name, password, contact, dob, myTicket);
		
			Customer customer =usi.registerNewUser(details);
			
			if(customer!=null) {
				System.out.println("Customer details added");
				System.out.println("Your UserId is "+ userId);
			}
			else
				System.out.println("Customer details not added");
			
			break;
		
		}
		
		
	
		
	}

}
