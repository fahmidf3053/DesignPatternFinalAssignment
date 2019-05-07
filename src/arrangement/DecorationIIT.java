package arrangement;

import decorations.Stage;

public class DecorationIIT extends Decoration{

	@Override
	public void decorate() {
		System.out.println("This is IITFest Decoration");
		Stage stage = new Stage();
		stage.create();
	}

}
