package ui;

import com.capgemini.service.AdminServiceImpl;
import com.capgemini.service.CustomerServiceImpl;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String city="delhi";
		AdminServiceImpl adi= new AdminServiceImpl();
		adi.addTheater();
		CustomerServiceImpl csi = new CustomerServiceImpl();
		csi.chooseCity(city);
		
	}

}
