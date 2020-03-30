package javafiles;

public class Admin {
	private Integer userId;
	private String adminName, password, adminContact;
	
	public Admin() {
	}
	
	public Admin(Integer userId, String adminName, String password, String adminContact) {
		this.userId=userId;
		this.adminName=adminName;
		this.password=password;
		this.adminContact=adminContact;
	}
	
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setAdminName(String adminName) {
		this.adminName=adminName;
	}
	public String getAdminName() {
		return adminName; 
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	public void setAdminContact(String adminContact) {
		this.adminContact=adminContact;
	}
	public String getAdminContact() {
		return adminContact;
	}
	
	@Override
	public String toString() {
		return "Admin [userId=" + userId + ", adminName=" + adminName + ", password=" + password + ", adminContact="
				+ adminContact + "]";
	}
	
	public Theater addTheater(Theater theater) {
		return theater;
	}
	
	public boolean deleteTheater(Integer i) {
		return false;
	}
	
	public Movie addMovie(Movie movie) {
		return movie;
	}
	
	public boolean deleteMovie(Integer i) {
		return false;
	}
	
	public Screen addScreen(Screen screen) {
		return screen;
	}
	
	public boolean deleteScreen(Integer i) {
		return false;
	}
	
	public Show addShow(Show show) {
		return show;
	}
	
	public boolean deleteShow(Integer i) {
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
