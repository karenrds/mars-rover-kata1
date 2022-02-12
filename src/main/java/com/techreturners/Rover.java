package com.techreturners;

public class Rover implements IRoverCommands {
    protected String name;
    public int x;
    public int y;
    public Position position;

    public Rover(String name, int x, int y, Position position) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.position = position;
    }

    @Override
    public void turnLeft() {
        if (position.equals(Position.North)) {
            position = Position.West;
        } else if (position.equals(Position.South)) {
            position = Position.East;
        } else if (position.equals(Position.East)) {
            position = Position.North;
        } else if (position.equals(Position.West)) {
            position = Position.South;
        }
    }

    @Override
    public void turnRight() {
        if (position.equals(Position.North)) {
            position = Position.East;
        } else if (position.equals(Position.South)) {
            position = Position.West;
        } else if (position.equals(Position.East)) {
            position = Position.South;
        } else if (position.equals(Position.West)) {
            position = Position.North;
        }
    }

    @Override
    public void move() {
        if (position.equals(Position.North)) {
            y++;
        } else if (position.equals(Position.South)) {
            y--;
        } else if (position.equals(Position.East)) {
            x++;
        } else if (position.equals(Position.West)) {
            x--;
        }
    }
}
