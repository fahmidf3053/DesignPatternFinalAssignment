package main;
import java.util.ArrayList;

public class Observer {
	ArrayList<User> peopleList;
	
	public Observer() {
		peopleList=new ArrayList();
		User user= new User("Fahmid");
		User user1= new User("Fuad");
		User user2= new User("Rakib");
		User user3= new User("Asif");
		User user4= new User("Mehedi");
		User user5= new User("Ahmed");
		peopleList.add(user);
		peopleList.add(user1);
		peopleList.add(user2);
		peopleList.add(user3);
		peopleList.add(user4);
		peopleList.add(user5);
		
		
		
	}
	
	public void sendEvents(Department department) {
		for(User p: peopleList) {
			p.getEvents(department);
		}
	}
	
	public void addPeople(User p) {
		peopleList.add(p);
	}
	
	public void removePeople(User p) {
		peopleList.remove(p);
	}
	
}