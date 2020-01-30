package Command;

import Model.Command;
import Model.Direction;
import Model.Location;
import Model.PositionInfo;

import java.util.HashMap;
import java.util.Map;

public class MoveCommand implements ExcuteCommand{

    private Map<Direction, Location> mapReletion = new HashMap<>(){{
        put(Direction.N, new Location(0,1));
        put(Direction.S, new Location(0,-1));
        put(Direction.E, new Location(1,0));
        put(Direction.W, new Location(-1,0));
    }};

    public void Command(PositionInfo positionInfo)
    {
        Location newLocation = mapReletion.get(positionInfo.getDirection());
        Location currentLocation = positionInfo.getLocation();
        currentLocation.Change(newLocation);
    }

    public boolean isSatisfy(String command) {
        return command.equalsIgnoreCase(Command.M.toString());
    }
}
