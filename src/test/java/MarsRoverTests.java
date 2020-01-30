import Model.Command;
import Model.Direction;
import Model.Location;
import Model.PositionInfo;
import org.junit.Assert;
import org.junit.Test;

public class MarsRoverTests {
    @Test
    public void should_add_Y_on_N_direction_when_given_M_command() {
        Location location = new Location(0,0);
        PositionInfo positionInfo = new PositionInfo(location, Direction.N);
        MarsRover marsRover = new MarsRover(positionInfo);

        marsRover.processCommand(Command.M);

        Assert.assertEquals(Direction.N, positionInfo.getDirection());
        Assert.assertEquals(1 , positionInfo.getLocation().getY());
        Assert.assertEquals(0 , positionInfo.getLocation().getX());
    }
}
