package priorityControl;

public class Student extends Person{

	public Student(String status) {
		super(status);
		// TODO Auto-generated constructor stub
	}

	@Override
	void teacher() {
		System.out.println("Assalamualaikum Sir from Student");
		
	}

	@Override
	void notTeacher() {
		System.out.println("Good Morning from Student");
		
	}
	
	
}
