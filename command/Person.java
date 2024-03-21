package command;

public class Person {
    public static void main(String[] args) {
        Television television = new Television();
        RemoteControl remoteControl = new RemoteControl();
        OnCommand onCommand = new OnCommand(television);
        OffCommand offCommand = new OffCommand(television);
        remoteControl.setCommand(onCommand);
        remoteControl.pressButton();
        remoteControl.setCommand(offCommand);
        remoteControl.pressButton();
    }
}
