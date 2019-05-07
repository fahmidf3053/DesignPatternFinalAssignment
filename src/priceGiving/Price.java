package priceGiving;

public class Price implements IPrice{
	String name;

	public Price(String name) {
		this.name = name;
	}

	@Override
	public String givePrice() {
		String s = "Giving Price to "+name;
		return s;
	}

	@Override
	public String retrivePrice() {
		String s = "Collecting price from "+name;
		return s;
	};
	
	
}
