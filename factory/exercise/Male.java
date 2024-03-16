package factory.exercise;

public class Male implements Person{
    @Override
    public void wish(String message) {
        System.out.println(message);
    }
}
