package headfirst.patterndesign.command;

import headfirst.patterndesign.command.interfaces.Command;

public class SimpleRemoteControl {
    Command command;

    public SimpleRemoteControl() {

    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPressed() {
        command.execute();
    }
}
