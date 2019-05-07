package main;

import java.util.ArrayList;

public class Controller {
	ArrayList<Department> departments;
	
	public Controller() {
		departments=new ArrayList();
	}
	
	public void sendMsg(String sms) {
		for(Department d: departments) {
			d.receiveMsg(sms);
		}
	}
	
	public void receiveMsg(String sms) {
		System.out.println("This is Controller Receiving : "+sms);
		sendMsg(sms);
	}
	
	public void addDepartment(Department department) {
		departments.add(department);
	}
	
	public void removeDepartment(Department department) {
		departments.remove(department);
	}
}
