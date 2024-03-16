package factory.exercise;

public class PersonFactory {

    public static Person createPerson(String gender){
        Person p = null;
        if(gender.equalsIgnoreCase("male")){
            p = new Male();
        }
        if(gender.equalsIgnoreCase("female")){
            p = new Female();
        }
        if(p != null){
            p.wish("Hello");
        }
        return p;
    }
}
