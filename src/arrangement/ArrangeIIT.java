package arrangement;

public class ArrangeIIT implements IFunction{

	@Override
	public Decoration createDecoration() {
		Decoration d=new DecorationIIT();
		return d;
	}

	@Override
	public Food makeFood() {
		Food f= new FoodIIT();
		return f;
	}

}
