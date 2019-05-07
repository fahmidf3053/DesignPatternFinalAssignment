package decorations;

import java.util.ArrayList;

public class Stage implements IThings{
	ArrayList<IThings> things;
	public Stage() {
		things = new ArrayList<IThings>();
		things.add(new Table());
		things.add(new Chair());
		things.add(new Chair());
		things.add(new Chair());
		things.add(new Chair());
		things.add(new Design());
		
	}
	
	@Override
	public void create() {
		
		for(IThings i: things) {
			i.create();
		}
	}

}
