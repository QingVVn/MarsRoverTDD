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
}