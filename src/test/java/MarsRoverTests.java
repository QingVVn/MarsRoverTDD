import Model.Command;
import Model.Direction;
import Model.Location;
import Model.PositionInfo;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class MarsRoverTests {

    private List<Command> receiveCommands = new LinkedList<Command>()
    {{
        add(Command.B);
        add(Command.L);
        add(Command.M);
        add(Command.R);
    }};

    @Test
    public void should_add_Y_on_N_direction_when_given_M_command() {
        Location location = new Location(0,0);
        PositionInfo positionInfo = new PositionInfo(location, Direction.N);
        MarsRover marsRover = new MarsRover(positionInfo, receiveCommands);

        marsRover.GetInput("M");

        Assert.assertEquals(Direction.N, positionInfo.getDirection());
        Assert.assertEquals(1 , positionInfo.getLocation().getY());
        Assert.assertEquals(0 , positionInfo.getLocation().getX());
    }

    @Test
    public void should_add_X_on_W_direction_when_given_M_command() {
        Location location = new Location(0,0);
        PositionInfo positionInfo = new PositionInfo(location, Direction.W);
        MarsRover marsRover = new MarsRover(positionInfo, receiveCommands);

        marsRover.GetInput("M");

        Assert.assertEquals(Direction.W, positionInfo.getDirection());
        Assert.assertEquals(0 , positionInfo.getLocation().getY());
        Assert.assertEquals(-1 , positionInfo.getLocation().getX());
    }

    @Test
    public void should_add_Y_on_S_direction_when_given_M_command() {
        Location location = new Location(0,0);
        PositionInfo positionInfo = new PositionInfo(location, Direction.S);
        MarsRover marsRover = new MarsRover(positionInfo, receiveCommands);

        marsRover.GetInput("M");

        Assert.assertEquals(Direction.S, positionInfo.getDirection());
        Assert.assertEquals(-1 , positionInfo.getLocation().getY());
        Assert.assertEquals(0 , positionInfo.getLocation().getX());
    }

    @Test
    public void should_add_X_on_E_direction_when_given_M_command() {
        Location location = new Location(0,0);
        PositionInfo positionInfo = new PositionInfo(location, Direction.E);
        MarsRover marsRover = new MarsRover(positionInfo, receiveCommands);

        marsRover.GetInput("M");

        Assert.assertEquals(Direction.E, positionInfo.getDirection());
        Assert.assertEquals(0 , positionInfo.getLocation().getY());
        Assert.assertEquals(1 , positionInfo.getLocation().getX());
    }

    @Test
    public void should_change_on_E_direction_when_given_L_command() {
        Location location = new Location(0,0);
        PositionInfo positionInfo = new PositionInfo(location, Direction.E);
        MarsRover marsRover = new MarsRover(positionInfo, receiveCommands);

        marsRover.GetInput("L");

        Assert.assertEquals(Direction.N, positionInfo.getDirection());
    }

    @Test
    public void should_change_on_W_direction_when_given_L_command() {
        Location location = new Location(0,0);
        PositionInfo positionInfo = new PositionInfo(location, Direction.W);
        MarsRover marsRover = new MarsRover(positionInfo, receiveCommands);

        marsRover.GetInput("L");

        Assert.assertEquals(Direction.S, positionInfo.getDirection());
    }

    @Test
    public void should_change_on_N_direction_when_given_L_command() {
        Location location = new Location(0,0);
        PositionInfo positionInfo = new PositionInfo(location, Direction.N);
        MarsRover marsRover = new MarsRover(positionInfo, receiveCommands);

        marsRover.GetInput("L");

        Assert.assertEquals(Direction.W, positionInfo.getDirection());
    }

    @Test
    public void should_change_on_S_direction_when_given_L_command() {
        Location location = new Location(0,0);
        PositionInfo positionInfo = new PositionInfo(location, Direction.S);
        MarsRover marsRover = new MarsRover(positionInfo, receiveCommands);

        marsRover.GetInput("L");

        Assert.assertEquals(Direction.E, positionInfo.getDirection());
    }

    @Test
    public void should_change_on_E_direction_when_given_R_command() {
        Location location = new Location(0,0);
        PositionInfo positionInfo = new PositionInfo(location, Direction.E);
        MarsRover marsRover = new MarsRover(positionInfo, receiveCommands);

        marsRover.GetInput("R");

        Assert.assertEquals(Direction.S, positionInfo.getDirection());
    }

    @Test
    public void should_change_on_W_direction_when_given_R_command() {
        Location location = new Location(0,0);
        PositionInfo positionInfo = new PositionInfo(location, Direction.W);
        MarsRover marsRover = new MarsRover(positionInfo, receiveCommands);

        marsRover.GetInput("R");

        Assert.assertEquals(Direction.N, positionInfo.getDirection());
    }

    @Test
    public void should_change_on_N_direction_when_given_R_command() {
        Location location = new Location(0,0);
        PositionInfo positionInfo = new PositionInfo(location, Direction.N);
        MarsRover marsRover = new MarsRover(positionInfo, receiveCommands);

        marsRover.GetInput("R");

        Assert.assertEquals(Direction.E, positionInfo.getDirection());
    }

    @Test
    public void should_change_on_S_direction_when_given_R_command() {
        Location location = new Location(0,0);
        PositionInfo positionInfo = new PositionInfo(location, Direction.S);
        MarsRover marsRover = new MarsRover(positionInfo, receiveCommands);

        marsRover.GetInput("R");

        Assert.assertEquals(Direction.W, positionInfo.getDirection());
    }

    @Test
    public void should_Get_Correct_Position_when_given_commands() {
        Location location = new Location(0,0);
        PositionInfo positionInfo = new PositionInfo(location, Direction.N);
        MarsRover marsRover = new MarsRover(positionInfo, receiveCommands);

        marsRover.GetInput("AFmml");

        Assert.assertEquals(Direction.W, positionInfo.getDirection());
        Assert.assertEquals(2 , positionInfo.getLocation().getY());
        Assert.assertEquals(0 , positionInfo.getLocation().getX());
    }

    @Test
    public void should_add_Y_on_S_direction_when_given_B_command() {
        Location location = new Location(0,0);
        PositionInfo positionInfo = new PositionInfo(location, Direction.S);
        MarsRover marsRover = new MarsRover(positionInfo, receiveCommands);

        marsRover.GetInput("B");

        Assert.assertEquals(Direction.S, positionInfo.getDirection());
        Assert.assertEquals(1 , positionInfo.getLocation().getY());
        Assert.assertEquals(0 , positionInfo.getLocation().getX());
    }

    @Test
    public void should_skip_B_when_given_B_command() {
        Location location = new Location(0,0);
        PositionInfo positionInfo = new PositionInfo(location, Direction.S);
        List<Command> commands = new LinkedList<Command>()
        {{
            add(Command.L);
            add(Command.M);
            add(Command.R);
        }};
        MarsRover marsRover = new MarsRover(positionInfo, commands);

        marsRover.GetInput("B");

        Assert.assertEquals(Direction.S, positionInfo.getDirection());
        Assert.assertEquals(0 , positionInfo.getLocation().getY());
        Assert.assertEquals(0 , positionInfo.getLocation().getX());
    }
}
