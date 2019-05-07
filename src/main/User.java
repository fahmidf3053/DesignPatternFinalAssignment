package main;

import javax.swing.JOptionPane;

public class User {
	String name;
	
	public User(String name) {
		this.name=name;
	}
	
	public void getEvents(Department department) {
		System.out.println("This is "+name+" watching event of "+department.name+" "+department.partner.broadcast());
	}
}
