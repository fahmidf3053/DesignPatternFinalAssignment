package work;

public class CulturalTeam implements IWork{
	IWork work;
	
	public void doWork(String work) {
		if(work.equals("Cultur")) {
			System.out.println("Cultural Team Working");
		}
		
		else
			this.work.doWork(work);
		
	}
	
	public CulturalTeam goNext(IWork work) {
		this.work=work;
		return this;
	}
}
