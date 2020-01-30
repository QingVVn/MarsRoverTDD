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

        marsRover.GetInput("M");

        Assert.assertEquals(Direction.N, positionInfo.getDirection());
        Assert.assertEquals(1 , positionInfo.getLocation().getY());
        Assert.assertEquals(0 , positionInfo.getLocation().getX());
    }

    @Test
    public void should_add_X_on_W_direction_when_given_M_command() {
        Location location = new Location(0,0);
        PositionInfo positionInfo = new PositionInfo(location, Direction.W);
        MarsRover marsRover = new MarsRover(positionInfo);

        marsRover.GetInput("M");

        Assert.assertEquals(Direction.W, positionInfo.getDirection());
        Assert.assertEquals(0 , positionInfo.getLocation().getY());
        Assert.assertEquals(-1 , positionInfo.getLocation().getX());
    }

    @Test
    public void should_add_Y_on_S_direction_when_given_M_command() {
        Location location = new Location(0,0);
        PositionInfo positionInfo = new PositionInfo(location, Direction.S);
        MarsRover marsRover = new MarsRover(positionInfo);

        marsRover.GetInput("M");

        Assert.assertEquals(Direction.S, positionInfo.getDirection());
        Assert.assertEquals(-1 , positionInfo.getLocation().getY());
        Assert.assertEquals(0 , positionInfo.getLocation().getX());
    }

    @Test
    public void should_add_X_on_E_direction_when_given_M_command() {
        Location location = new Location(0,0);
        PositionInfo positionInfo = new PositionInfo(location, Direction.E);
        MarsRover marsRover = new MarsRover(positionInfo);

        marsRover.GetInput("M");

        Assert.assertEquals(Direction.E, positionInfo.getDirection());
        Assert.assertEquals(0 , positionInfo.getLocation().getY());
        Assert.assertEquals(1 , positionInfo.getLocation().getX());
    }

    @Test
    public void should_change_on_E_direction_when_given_L_command() {
        Location location = new Location(0,0);
        PositionInfo positionInfo = new PositionInfo(location, Direction.E);
        MarsRover marsRover = new MarsRover(positionInfo);

        marsRover.GetInput("L");

        Assert.assertEquals(Direction.N, positionInfo.getDirection());
    }

    @Test
    public void should_change_on_W_direction_when_given_L_command() {
        Location location = new Location(0,0);
        PositionInfo positionInfo = new PositionInfo(location, Direction.W);
        MarsRover marsRover = new MarsRover(positionInfo);

        marsRover.GetInput("L");

        Assert.assertEquals(Direction.S, positionInfo.getDirection());
    }

    @Test
    public void should_change_on_N_direction_when_given_L_command() {
        Location location = new Location(0,0);
        PositionInfo positionInfo = new PositionInfo(location, Direction.N);
        MarsRover marsRover = new MarsRover(positionInfo);

        marsRover.GetInput("L");

        Assert.assertEquals(Direction.W, positionInfo.getDirection());
    }

    @Test
    public void should_change_on_S_direction_when_given_L_command() {
        Location location = new Location(0,0);
        PositionInfo positionInfo = new PositionInfo(location, Direction.S);
        MarsRover marsRover = new MarsRover(positionInfo);

        marsRover.GetInput("L");

        Assert.assertEquals(Direction.E, positionInfo.getDirection());
    }

    @Test
    public void should_change_on_E_direction_when_given_R_command() {
        Location location = new Location(0,0);
        PositionInfo positionInfo = new PositionInfo(location, Direction.E);
        MarsRover marsRover = new MarsRover(positionInfo);

        marsRover.GetInput("R");

        Assert.assertEquals(Direction.S, positionInfo.getDirection());
    }

    @Test
    public void should_change_on_W_direction_when_given_R_command() {
        Location location = new Location(0,0);
        PositionInfo positionInfo = new PositionInfo(location, Direction.W);
        MarsRover marsRover = new MarsRover(positionInfo);

        marsRover.GetInput("R");

        Assert.assertEquals(Direction.N, positionInfo.getDirection());
    }

    @Test
    public void should_change_on_N_direction_when_given_R_command() {
        Location location = new Location(0,0);
        PositionInfo positionInfo = new PositionInfo(location, Direction.N);
        MarsRover marsRover = new MarsRover(positionInfo);

        marsRover.GetInput("R");

        Assert.assertEquals(Direction.E, positionInfo.getDirection());
    }

    @Test
    public void should_change_on_S_direction_when_given_R_command() {
        Location location = new Location(0,0);
        PositionInfo positionInfo = new PositionInfo(location, Direction.S);
        MarsRover marsRover = new MarsRover(positionInfo);

        marsRover.GetInput("R");

        Assert.assertEquals(Direction.W, positionInfo.getDirection());
    }

    @Test
    public void should_Get_Correct_Position_when_given_commands() {
        Location location = new Location(0,0);
        PositionInfo positionInfo = new PositionInfo(location, Direction.N);
        MarsRover marsRover = new MarsRover(positionInfo);

        marsRover.GetInput("AFmml");

        Assert.assertEquals(Direction.W, positionInfo.getDirection());
        Assert.assertEquals(2 , positionInfo.getLocation().getY());
        Assert.assertEquals(0 , positionInfo.getLocation().getX());
    }
}
