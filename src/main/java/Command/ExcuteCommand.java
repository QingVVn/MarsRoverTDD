package Command;

import Model.PositionInfo;

public interface ExcuteCommand {
    void Command(PositionInfo positionInfo);
    boolean isSatisfy(String command);
}
