package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_move_upward_when_executeCommand_given_Command_M_And_Direction_N() {
        //Given
        Location location = new Location(0,0, Direction.N);
        MarsRover marsRover = new MarsRover(location);

        // When
        String result = marsRover.executeCommand(Command.M);

        // Then
        Location expectedLocation = new Location(0,1, Direction.N);
        assertEquals(result, expectedLocation.buildFormattedLocation());
    }

    @Test
    void should_move_upward_when_executeCommand_given_Command_M_And_Direction_E() {
        //Given
        Location location = new Location(0,0, Direction.E);
        MarsRover marsRover = new MarsRover(location);

        // When
        String result = marsRover.executeCommand(Command.M);

        // Then
        Location expectedLocation = new Location(1,0, Direction.E);
        assertEquals(expectedLocation.buildFormattedLocation(), result);
    }

    @Test
    void should_move_upward_when_executeCommand_given_Command_M_And_Direction_S() {
        //Given
        Location location = new Location(0,0, Direction.S);
        MarsRover marsRover = new MarsRover(location);

        // When
        String result = marsRover.executeCommand(Command.M);

        // Then
        Location expectedLocation = new Location(0,-1, Direction.S);
        assertEquals(result, expectedLocation.buildFormattedLocation());
    }

    @Test
    void should_move_upward_when_executeCommand_given_Command_M_And_Direction_W() {
        //Given
        Location location = new Location(0,0, Direction.W);
        MarsRover marsRover = new MarsRover(location);

        // When
        String result = marsRover.executeCommand(Command.M);

        // Then
        Location expectedLocation = new Location(-1,0, Direction.W);
        assertEquals(result, expectedLocation.buildFormattedLocation());
    }
}
