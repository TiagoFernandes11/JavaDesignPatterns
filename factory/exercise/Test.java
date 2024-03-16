package factory.exercise;

public class Test {

    public static void main(String[] args) {
        Person p1 = PersonFactory.createPerson("male");
        Person p2 = PersonFactory.createPerson("male");
        Person p3 = PersonFactory.createPerson("female");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p1 == p2);
    }
}
