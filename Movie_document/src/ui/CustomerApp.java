package ui;

import java.util.Scanner;

import com.capgemini.service.CustomerServiceImpl;

public class CustomerApp {
	
	static CustomerServiceImpl csi = new CustomerServiceImpl();

	public static void main(String[] args) {
		
		String city;
		System.out.println("Select the city: ");
		System.out.println("1.Delhi \n 2.Mumbai \n 3.Kolkata \n 4.Chennai");
		Scanner sc= new Scanner(System.in);
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
	
		
	}

}
