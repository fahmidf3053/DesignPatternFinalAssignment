package main;

import java.util.Scanner;

public abstract class Department {
	String programName;
	String  name;
	Controller controller;
	MediaPartner partner;
	
	Scanner input = new Scanner(System.in);
	
	public Department(Controller controller,MediaPartner partner) {
		this.controller=controller;
		this.partner=partner;
	}
	
	public String broadcast() {
		return partner.broadcast();
	}
	
	public void receiveMsg(String sms) {
		System.out.println("This is "+name+" receving "+sms);
		
	}
	
	public void sendMsg(String sms) {
		controller.receiveMsg(sms);
	}
	
	public void bookTsc() {
		System.out.println("Enter date(xx-monthname,20xx) when you want to reserve TSC :");
		String date=input.nextLine();
		if(!SingleTSC.getInstance().isBooked(date)) {
			System.out.println("Contratulations TSC is free to book and booking Confirmed");
			SingleTSC.getInstance().setAllocatedDep(this);
			SingleTSC.getInstance().isBooked.put(date, "booked");
			controller.sendMsg("TSC is booking for the date "+date+" by "+name);
			this.telecast();
			this.arrangeProgram();
		}
		else {
			System.out.println("Sorry TSC is booked for the day");
			return;
		}		
		
	}
	
	public void telecast() {
		Observer observer=new Observer();
		observer.sendEvents(this);
	}
	
	public abstract void arrangeProgram();
	
}
