package priceGiving;

public class GivePrice implements ICommand{
	IPrice price;

	public GivePrice(IPrice price) {
		this.price = price;
	}

	@Override
	public String execute() {
		// TODO Auto-generated method stub
		return price.givePrice();
	}

	@Override
	public String undo() {
		// TODO Auto-generated method stub
		return price.retrivePrice();
	}
	
	
	
	
	
	
}
