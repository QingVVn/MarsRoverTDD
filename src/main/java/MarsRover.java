import Model.Command;
import Model.Direction;
import Model.Location;
import Model.PositionInfo;

public class MarsRover {
    private PositionInfo positionInfo;

    public MarsRover(PositionInfo positionInfo) {
        this.positionInfo = positionInfo;
    }

    public void processCommand(Command command) {
        switch (command)
        {
            case M:
                processMoveCommand();
                break;
            case L:
                processLeftCommand();
                break;
        }
    }

    public void processMoveCommand() {
        Location location = positionInfo.getLocation();
        Direction direction = positionInfo.getDirection();
        switch (direction)
        {
            case N:
                location.setY(location.getY()+1);
                break;
            case S:
                location.setY(location.getY()-1);
                break;
            case E:
                location.setX(location.getX()+1);
                break;
            case W:
                location.setX(location.getX()-1);
                break;
        }

        positionInfo.setLocation(location);
    }

    public void processLeftCommand() {
        Direction direction = positionInfo.getDirection();
        switch (direction)
        {
            case N:
                positionInfo.setDirection(Direction.W);
                break;
            case S:
                positionInfo.setDirection(Direction.E);
                break;
            case E:
                positionInfo.setDirection(Direction.N);
                break;
            case W:
                positionInfo.setDirection(Direction.S);
                break;
        }
    }
}