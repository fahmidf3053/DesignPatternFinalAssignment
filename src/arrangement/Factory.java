package arrangement;

public class Factory {
	String name;
	IFunction function;
	
	public Factory(String  name) {
		this.name=name;
	}
	
	public IFunction createFunction() {
		
		if(name.equals("IIT")) {
			function=new ArrangeIIT();
			
			return function;
		}
		
		else if(name.equals("CSE")) {
			function=new ArrangeCSE();
			
			return function;
		}
		
		else {
			function=new ArrangeMath();
			
			return function;
		}
	}
	
}
