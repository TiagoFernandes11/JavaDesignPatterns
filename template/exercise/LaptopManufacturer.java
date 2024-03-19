package template.exercise;

public class LaptopManufacturer extends ComputerManufacturer{
    @Override
    public String addHardDisk() {
        return "Laptop HardDisk";
    }

    @Override
    public String addRam() {
        return "Laptop Ram";
    }

    @Override
    public String addKeyboard() {
        return "Laptop Keyboard";
    }
}
