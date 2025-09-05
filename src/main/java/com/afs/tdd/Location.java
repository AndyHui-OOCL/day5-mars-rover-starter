package com.afs.tdd;

import java.util.Map;

public class Location {
    private static final Map<Direction, Direction> DIR_TO_LEFT_DIR = Map.of(
            Direction.N, Direction.W,
            Direction.E, Direction.N,
            Direction.S, Direction.E
    );

    private int xCoordinate;
    private int yCoordinate;
    private Direction direction;

    Location(int xCoordinate, int yCoordinate, Direction direction) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.direction = direction;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setXCoordinate(int xCoordinate){
        this.xCoordinate = xCoordinate;
    }

    public void setYCoordinate(int yCoordinate){
        this.yCoordinate = yCoordinate;
    }

    public void turnLeft() {
        this.direction = DIR_TO_LEFT_DIR.get(this.direction);
    }

    public String buildFormattedLocation() {
        return xCoordinate + ":" + yCoordinate + ":"+ direction;
    }
}
