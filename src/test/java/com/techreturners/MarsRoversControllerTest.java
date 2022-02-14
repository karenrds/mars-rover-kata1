package com.techreturners;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class MarsRoversControllerTest {
    public MarsRoversController marsRoversController;
    public ArrayList<Integer> dimensions;

    @BeforeEach
    public void setUp() {
        marsRoversController = new MarsRoversController();
        dimensions = new ArrayList<>();
    }

    @Test
    public void testRoverPositionWithValidCommands() throws Exception {

        dimensions.add(5);
        dimensions.add(5);
        marsRoversController.plateau = new Plateau(dimensions);

        marsRoversController.roverList = new ArrayList<>();


        marsRoversController.roverList.add(new Rover("Rover1", 1, 2, "N"));
        String actualRover1Position = marsRoversController.setDirection("LMLMLMLMM", marsRoversController.roverList.get(0));
        assertEquals("Rover1: 1 3 N", actualRover1Position);

        marsRoversController.roverList.add(new Rover("Rover2", 3, 3, "E"));
        String actualRover2Position = marsRoversController.setDirection("MMRMMRMRRM", marsRoversController.roverList.get(1));
        assertEquals("Rover2: 5 1 E", actualRover2Position);

    }

    @Test
    public void testRoverPositionWithInValidCommands() throws Exception {
        try {
            dimensions.add(5);
            dimensions.add(5);
            marsRoversController.plateau = new Plateau(dimensions);
            marsRoversController.roverList = new ArrayList<>();

            marsRoversController.roverList.add(new Rover("Rover1", 1, 2, "N"));
            String actualRover1Position = marsRoversController.setDirection("LMLMLMLMMX", marsRoversController.roverList.get(0));
            assertEquals("Rover1: 1 3 N", actualRover1Position);
        } catch (IllegalArgumentException ex) {
            assertEquals("Please set proper directions", ex.getMessage());
        }
    }

    @Test
    public void testRoverPositionOutOfBounds() throws Exception {
        try {
            dimensions.add(5);
            dimensions.add(5);
            marsRoversController.plateau = new Plateau(dimensions);
            marsRoversController.roverList = new ArrayList<>();

            marsRoversController.roverList.add(new Rover("Rover1", 0, 0, "W"));
            String actualRover1Position = marsRoversController.setDirection("LMLMLMLMM", marsRoversController.roverList.get(0));
            assertEquals("Rover1: 1 3 N", actualRover1Position);
        } catch (IllegalArgumentException ex) {
            assertEquals("Out of bounds", ex.getMessage());
        }
    }
}

