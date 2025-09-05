package com.afs.tdd;

public class MarsRover {
    private static final char MOVEMENT_COMMAND = 'M';


    private final Location location;

    MarsRover(Location location) {
        this.location = location;
    }

    public String executeSingleCommand(char command) {
        if(command == MOVEMENT_COMMAND) {
           move();
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
