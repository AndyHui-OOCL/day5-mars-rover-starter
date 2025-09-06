package com.afs.tdd;

import java.util.Map;

public class Location {
    private int x;
    private int y;
    private Direction direction;

    private static final Map<Direction, Direction> LEFT_TURNS = Map.of(
            Direction.N, Direction.W,
            Direction.E, Direction.N,
            Direction.S, Direction.E,
            Direction.W, Direction.S
    );

    private static final Map<Direction, Direction> RIGHT_TURNS = Map.of(
            Direction.N, Direction.E,
            Direction.E, Direction.S,
            Direction.S, Direction.W,
            Direction.W, Direction.N
    );

    public Location(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void move() {
        this.x += direction.getDeltaX();
        this.y += direction.getDeltaY();
    }

    public void turnLeft() {
        this.direction = LEFT_TURNS.get(direction);
    }

    public void turnRight() {
        this.direction = RIGHT_TURNS.get(direction);
    }

    @Override
    public String toString() {
        return x + ":" + y + ":" + direction;
    }
}