package headfirst.patterndesign.command;

import headfirst.patterndesign.command.devices.Light;
import headfirst.patterndesign.command.impl.LightOnCommand;

public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();

        LightOnCommand lightOnCommand = new LightOnCommand(light);

        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();
    }
}
