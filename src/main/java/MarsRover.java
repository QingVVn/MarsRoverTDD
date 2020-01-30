import Command.MoveCommand;
import Command.LeftCommand;
import Command.RightCommand;
import Command.ExcuteCommand;
import Model.PositionInfo;

import java.util.LinkedList;
import java.util.List;

public class MarsRover {
    private PositionInfo positionInfo;

    public MarsRover(PositionInfo positionInfo) {
        this.positionInfo = positionInfo;
    }

    public void GetInput(String input) {
        List<ExcuteCommand> commands = new LinkedList<ExcuteCommand>()
        {{
            add(new MoveCommand());
            add(new LeftCommand());
            add(new RightCommand());
        }};

        var inputArray = input.toCharArray();
        for (int i=0; i<inputArray.length; i++)
        {
            var command = String.valueOf(inputArray[i]);
            commands.forEach(c->
            {
                if(c.isSatisfy(command))
                {
                    c.Command(positionInfo);
                }
            });
        }
    }
}