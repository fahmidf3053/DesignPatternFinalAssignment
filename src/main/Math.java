package main;

import arrangement.Decoration;
import arrangement.Factory;
import arrangement.Food;
import arrangement.IFunction;
import priceGiving.Command;
import priceGiving.GivePrice;
import priceGiving.Price;
import priorityControl.Person;
import priorityControl.Student;
import priorityControl.Stuffs;
import work.CulturalTeam;
import work.FoodTeam;
import work.IWork;
import work.NullOperation;

public class Math extends Department{
	public Math(Controller controller,MediaPartner partner) {
		super(controller,partner);
		
		this.name="Math";
		this.programName="MathOlympiad";
	}

	@Override
	public void arrangeProgram() {
		Factory factory=new Factory("Math");
		IFunction function=factory.createFunction();
		Decoration decoration=function.createDecoration();
		decoration.decorate();
		Food food=function.makeFood();
		food.make();
		
		IWork work = new FoodTeam().goNext(new CulturalTeam().goNext(new NullOperation()));
		work.doWork("Nothing");
		
		Command command=new Command();
		Price price=new Price("Fahmid");
		System.out.println(price.givePrice());
		command.addCommand(new GivePrice(price));
		Price price1=new Price("Fuad");
		System.out.println(price1.givePrice());
		command.addCommand(new GivePrice(price1));
		Price price2=new Price("Saif");
		System.out.println(price2.givePrice());
		command.addCommand(new GivePrice(price2));
		System.out.println(command.undo());
		System.out.println(command.undo());
		System.out.println(command.undo());
		System.out.println(command.undo());
		
		Person person = new Student("Teacher");
		Person person1 = new Stuffs("Student");
		person.greetings();
		person1.greetings();
	}
}
