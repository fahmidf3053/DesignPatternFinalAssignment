package main;

public class Main {

	public static void main(String[] args) {
		Controller controller=new Controller();
		MediaPartner partner = new TV();
		MediaPartner partner1 = new Radio();
		
		Department department=new IIT(controller,partner);
		Department department1=new CSE(controller,partner);
		Department department2=new Math(controller,partner1);
		
		controller.addDepartment(department);
		controller.addDepartment(department1);
		controller.addDepartment(department2);
		
		while(true) {
			department1.bookTsc();
		}
		

	}

}
