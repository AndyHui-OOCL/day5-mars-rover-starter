package com.afs.tdd;

public enum Direction {
    N(0,1),
    E(1,0),
    S(0,-1),
    W(-1,0);

    private final int deltaX;
    private final int deltaY;

    Direction(int deltaX, int deltaY) {
        this.deltaX = deltaX;
        this.deltaY = deltaY;
    }

    public int getDeltaX() {
        return deltaX;
    }

    public int getDeltaY(){
        return deltaY;
    }
}
