package arrangement;

public class ArrangeMath implements IFunction{
	public Decoration createDecoration() {
		Decoration d=new DecorationMath();
		return d;
	}

	@Override
	public Food makeFood() {
		Food f= new FoodMath();
		return f;
	}
}
