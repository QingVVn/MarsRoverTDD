import Model.Command;
import Command.MoveCommand;
import Command.LeftCommand;
import Command.RightCommand;
import Model.PositionInfo;

public class MarsRover {
    private PositionInfo positionInfo;

    public MarsRover(PositionInfo positionInfo) {
        this.positionInfo = positionInfo;
    }

    public void processCommand(Command command) {
        MoveCommand move = new MoveCommand();
        LeftCommand left = new LeftCommand();
        RightCommand right = new RightCommand();
        switch (command)
        {
            case M:
                move.Command(positionInfo);
                break;
            case L:
                left.Command(positionInfo);
                break;
            case R:
                right.Command(positionInfo);
                break;
        }
    }
}