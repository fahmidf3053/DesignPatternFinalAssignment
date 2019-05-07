package priorityControl;

public class Teacher extends Person{
	
	public Teacher(String status) {
		super(status);
	}

	@Override
	void teacher() {
		System.out.println("Good Morning from Student");
		
	}

	@Override
	void notTeacher() {
		System.out.println("How are you?? from Student");
		
	}
	
}
