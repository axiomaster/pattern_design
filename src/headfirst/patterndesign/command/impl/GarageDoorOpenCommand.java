package headfirst.patterndesign.command.impl;

import headfirst.patterndesign.command.devices.GarageDoor;
import headfirst.patterndesign.command.interfaces.Command;

public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void undo() {

    }

    @Override
    public void execute() {
        garageDoor.open();
    }
}
