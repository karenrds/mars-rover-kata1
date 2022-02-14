package com.techreturners;

public class Rover implements IRoverCommands {
    protected String name;
    public int x;
    public int y;
    public String position;

    public Rover(String name, int x, int y, String position) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.position = position;
    }

    @Override
    public void turnLeft() {
        if (position.equals("N")) {
            position = "W";
        } else if (position.equals("S")) {
            position = "E";
        } else if (position.equals("E")) {
            position = "N";
        } else if (position.equals("W")) {
            position = "S";
        }
    }

    @Override
    public void turnRight() {
        if (position.equals("N")) {
            position = "E";
        } else if (position.equals("S")) {
            position = "W";
        } else if (position.equals("E")) {
            position = "S";
        } else if (position.equals("W")) {
            position = "N";
        }
    }

    @Override
    public void move() {
        if (position.equals("N")) {
            y++;
        } else if (position.equals("S")) {
            y--;
        } else if (position.equals("E")) {
            x++;
        } else if (position.equals("W")) {
            x--;
        }
    }
}
