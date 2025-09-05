package com.afs.tdd;

public class MarsRover {
    private final Location location;

    MarsRover(Location location) {
        this.location = location;
    }

    public void executeCommand(Command command) {
       return;
    }

    Location getLocation(){
        return this.location;
    }
}
