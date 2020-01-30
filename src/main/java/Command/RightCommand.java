package Command;

import Model.Command;
import Model.Direction;
import Model.Location;
import Model.PositionInfo;

import java.util.HashMap;
import java.util.Map;

public class RightCommand implements ExcuteCommand{
    private Map<Direction, Direction> mapReletion = new HashMap<>(){{
        put(Direction.N, Direction.E);
        put(Direction.S, Direction.W);
        put(Direction.E, Direction.S);
        put(Direction.W, Direction.N);
    }};

    public void Command(PositionInfo positionInfo)
    {
        Direction newLocation = mapReletion.get(positionInfo.getDirection());
        positionInfo.setDirection(newLocation);
    }

    public boolean isSatisfy(String command) {
        return command.equals(Command.R.toString());
    }
}
