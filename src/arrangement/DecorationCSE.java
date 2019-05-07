package arrangement;

import decorations.IThings;
import decorations.Stage;

public class DecorationCSE extends Decoration{

	@Override
	public void decorate() {
		System.out.println("This is CSEFest Decoration");
		Stage stage = new Stage();
		stage.create();
	}
	

}
