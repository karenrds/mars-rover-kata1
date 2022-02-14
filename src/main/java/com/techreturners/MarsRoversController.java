package com.techreturners;

import java.util.ArrayList;

public class MarsRoversController implements IMarsRoversController {
    public Plateau plateau;
    public ArrayList<Rover> roverList;

    public String setDirection(String direction, Rover rover) throws Exception {
        String errorMessage = "";
        if (!direction.isEmpty()) {
            for (int i = 0; i < direction.length(); i++) {
                if (direction.charAt(i) == 'L') {
                    rover.turnLeft();
                } else if (direction.charAt(i) == 'R') {
                    rover.turnRight();
                } else if (direction.charAt(i) == 'M') {
                    if (validatePosition(rover)) {
                        errorMessage += "Out of bounds";
                        break;
                    }
                    rover.move();
                } else {
                    errorMessage += "Please set proper directions";
                    break;
                }
            }
        }
        if (!errorMessage.isEmpty()) {
            throw new IllegalArgumentException(errorMessage);
        } else {
            return rover.name + ": " + rover.x + " " + rover.y + " " + rover.position;
        }
    }

    public boolean validatePosition(Rover rover) {
        if ((rover.y == this.plateau.dimensions.get(1) && rover.position.equals("N")) ||
                (rover.y == 0 && rover.position.equals("S")) ||
                (rover.x == this.plateau.dimensions.get(0) && rover.position.equals("E")) ||
                (rover.x == 0 && rover.position.equals("W"))) {
            return true;
        }
        return false;
    }
}
