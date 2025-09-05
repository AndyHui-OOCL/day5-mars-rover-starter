package com.afs.tdd;

public class MarsRover {
    private final Location location;

    MarsRover(Location location) {
        this.location = location;
    }

    public void executeCommand(Command command) {
        if(command.equals(Command.M)) {
            if(location.getDirection().equals(Direction.N)) {
                location.setYCoordinate(location.getYCoordinate() + 1);
            }
        }
    }

    Location getLocation(){
        return this.location;
    }
}
