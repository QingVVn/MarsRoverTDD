package Model;

public class PositionInfo {
    private Location location;
    private Direction direction;

    public PositionInfo(Location location, Direction direction)
    {
        this.location = location;
        this.direction = direction;
    }
    public Location getLocation() {
        return location;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
