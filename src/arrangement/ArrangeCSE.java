package arrangement;

public class ArrangeCSE implements IFunction{
	public Decoration createDecoration() {
		Decoration d=new DecorationCSE();
		return d;
	}

	@Override
	public Food makeFood() {
		Food f= new FoodCSE();
		return f;
	}
}
