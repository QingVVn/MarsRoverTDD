import Model.Command;
import Model.Location;
import Model.PositionInfo;

public class MarsRover {
    private PositionInfo positionInfo;

    public MarsRover(PositionInfo positionInfo) {
        this.positionInfo = positionInfo;
    }

    public void processCommand(Command command) {
        Location location = positionInfo.getLocation();
        location.setY(location.getY()+1);
        positionInfo.setLocation(location);
    }
}