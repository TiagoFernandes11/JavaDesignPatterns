package factory.exercise;

public class Female implements Person{

    @Override
    public void wish(String message) {
        System.out.println(message);
    }
}
