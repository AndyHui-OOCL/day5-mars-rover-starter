package com.afs.tdd;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Map;
import java.util.HashMap;
import java.util.function.Consumer;

public class MarsRover {
    private static final char MOVE = 'M';
    private static final char MOVE_BACKWARD = 'B';
    private static final char TURN_LEFT = 'L';
    private static final char TURN_RIGHT = 'R';

    private static final int FORWARD_MOVING = 1;
    private static final int BACKWARD_MOVING = -1;

    private final Map<Character, Consumer<Location>> commands = new HashMap<>();
    private final Location location;

    public MarsRover(Location location) {
        this.location = location;
        initializeCommands();
    }

    private void initializeCommands() {
        commands.put(MOVE, location -> location.move(FORWARD_MOVING));
        commands.put(MOVE_BACKWARD, location -> location.move(BACKWARD_MOVING));
        commands.put(TURN_LEFT, Location::turnLeft);
        commands.put(TURN_RIGHT, Location::turnRight);
    }

    public String executeSingleCommand(char command) {
        Consumer<Location> roverAction = commands.get(command);
        if(roverAction == null) {
            throw new NullPointerException("Received invalid or empty command in executeSingleCommand");
        }
        roverAction.accept(location);
        return location.toString();
    }

    public String executeBatchCommands(String commands) {
        commands.chars().forEach(command -> executeSingleCommand((char) command));
        return location.toString();
    }
}
