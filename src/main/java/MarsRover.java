import Command.*;
import Model.Command;
import Model.PositionInfo;

import java.util.LinkedList;
import java.util.List;

public class MarsRover {
    private PositionInfo positionInfo;
    public List<Command> receiveCommands;

    public MarsRover(PositionInfo positionInfo, List<Command> receiveCommands) {
        this.positionInfo = positionInfo;
        this.receiveCommands = receiveCommands;
    }

    public void GetInput(String input) {
        List<ExcuteCommand> commands = new LinkedList<ExcuteCommand>()
        {{
            add(new MoveCommand());
            add(new LeftCommand());
            add(new RightCommand());
            add(new BackCommand());
        }};

        var inputArray = input.toCharArray();
        for (int i=0; i<inputArray.length; i++)
        {
            var command = String.valueOf(inputArray[i]).toUpperCase();
            commands.forEach(c->
            {
                if(c.isSatisfy(command) && receiveCommands.contains(Command.valueOf(command)))
                {
                    c.Command(positionInfo);
                }
            });
        }
    }
}