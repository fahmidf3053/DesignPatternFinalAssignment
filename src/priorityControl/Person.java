package priorityControl;

public abstract class Person {
	String status;
	
	public Person(String status) {
		this.status=status;
	}
	
	abstract void teacher();
	abstract void notTeacher();
	
	
	public final void greetings() {
		if(status.equals("Teacher")){
			teacher();
		}
		else
			notTeacher();
	}
	
}
