package template.exercise;

public abstract class ComputerManufacturer {

    private String computer = "";

    public void buildComputer(){
        computer +=" " + addHardDisk();
        computer +=" " + addRam();
        computer +=" " + addKeyboard();
        System.out.println("Building computer: " + computer);
    }

    public abstract String addHardDisk();

    public abstract String addRam();

    public abstract String addKeyboard();

}
