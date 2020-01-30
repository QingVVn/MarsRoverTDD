package Command;

import Model.Direction;
import Model.Location;
import Model.PositionInfo;

import java.util.HashMap;
import java.util.Map;

public class LeftCommand implements ExcuteCommand{
    private Map<Direction, Direction> mapReletion = new HashMap<>(){{
        put(Direction.N, Direction.W);
        put(Direction.S, Direction.E);
        put(Direction.E, Direction.N);
        put(Direction.W, Direction.S);
    }};

    public void Command(PositionInfo positionInfo)
    {
        Direction newLocation = mapReletion.get(positionInfo.getDirection());
        positionInfo.setDirection(newLocation);
    }
}
