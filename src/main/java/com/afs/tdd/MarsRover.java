package com.afs.tdd;

public class MarsRover {
    private final Location location;

    MarsRover(Location location) {
        this.location = location;
    }

    public String executeCommand(Command command) {
        if(command.equals(Command.M)) {
            if(location.getDirection().equals(Direction.N)) {
                location.setYCoordinate(location.getYCoordinate() + 1);
            } else if (location.getDirection().equals(Direction.E)) {
                location.setXCoordinate(location.getXCoordinate() + 1);
            } else if (location.getDirection().equals(Direction.S)) {
                location.setYCoordinate(location.getYCoordinate() - 1);
            } else {
                location.setXCoordinate(location.getXCoordinate() - 1);
            }
        }
        return location.buildFormattedLocation();
    }



    Location getLocation(){
        return this.location;
    }
}
