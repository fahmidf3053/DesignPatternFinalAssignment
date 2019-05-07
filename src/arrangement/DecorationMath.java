package arrangement;

import decorations.Stage;

public class DecorationMath extends Decoration{

	@Override
	public void decorate() {
		System.out.println("This is MathOlympiad Decoration");
		Stage stage = new Stage();
		stage.create();
	}

}
