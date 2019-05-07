package work;


public class FoodTeam implements IWork{
	IWork work;
	
	public void doWork(String work) {
		if(work.equals("Food")) {
			System.out.println("Food Team Working");
		}
		
		else
			this.work.doWork(work);
		
	}
	
	public FoodTeam goNext(IWork work) {
		this.work=work;
		return this;
	}
}
