package com.afs.tdd;

public class MarsRover {
    private static final char MOVEMENT_COMMAND = 'M';
    private static final char TURN_LEFT_COMMAND = 'L';
    private static final char TURN_RIGHT_COMMAND = 'R';

    private final Location location;

    MarsRover(Location location) {
        this.location = location;
    }

    public String executeSingleCommand(char command) {
        if(command == MOVEMENT_COMMAND) {
           move();
        } else if (command == TURN_LEFT_COMMAND) {
            location.turnLeft();
        } else if (command == TURN_RIGHT_COMMAND) {
            location.turnRight();
        }
        return location.buildFormattedLocation();
    }

    private void move(){
        switch (location.getDirection()) {
            case N:
                location.setYCoordinate(location.getYCoordinate() + 1);
                break;
            case E:
                location.setXCoordinate(location.getXCoordinate() + 1);
                break;
            case S:
                location.setYCoordinate(location.getYCoordinate() - 1);
                break;
            case W:
                location.setXCoordinate(location.getXCoordinate() - 1);
                break;
        }
    }

    Location getLocation(){
        return this.location;
    }
}
