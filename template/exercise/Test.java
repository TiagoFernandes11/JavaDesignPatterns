package template.exercise;

public class Test {
    public static void main(String[] args) {
        ComputerManufacturer computerManufacturer = new DesktopManufacturer();
        ComputerManufacturer computerManufacturer1 = new LaptopManufacturer();

        computerManufacturer1.buildComputer();
        computerManufacturer.buildComputer();
    }
}
