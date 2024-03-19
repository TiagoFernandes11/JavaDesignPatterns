package template.exercise;

public class DesktopManufacturer extends ComputerManufacturer{
    @Override
    public String addHardDisk() {
        return "Desktop HardDisk";
    }

    @Override
    public String addRam() {
        return "Desktop Ram";
    }

    @Override
    public String addKeyboard() {
        return "Desktop Keyboard";
    }
}
