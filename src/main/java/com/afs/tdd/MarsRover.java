package com.afs.tdd;

import java.util.Map;
import java.util.HashMap;
import java.util.function.Consumer;

public class MarsRover {
    private static final char MOVEMENT = 'M';
    private static final char TURN_LEFT = 'L';
    private static final char TURN_RIGHT = 'R';

    private final Map<Character, Consumer<Location>> commands = new HashMap<>();
    private Location location;

    public MarsRover(Location location) {
        this.location = location;
        initializeCommands();
    }

    private void initializeCommands() {
        commands.put(MOVEMENT, Location::move);
        commands.put(TURN_LEFT, Location::turnLeft);
        commands.put(TURN_RIGHT, Location::turnRight);
    }

    public String executeSingleCommand(char command) {
        Consumer<Location> action = commands.get(command);
        if(action == null) {
            throw new NullPointerException("Received invalid or empty command in executeSingleCommand");
        }
        action.accept(location);
        return location.toString();
    }
}
