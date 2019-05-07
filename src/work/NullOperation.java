package work;
public class NullOperation implements IWork {
    @Override
    public void doWork(String work) {
        System.out.println("No such Team Found");
    }
}
