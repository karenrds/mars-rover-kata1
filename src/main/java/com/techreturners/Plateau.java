package com.techreturners;

import java.util.ArrayList;

public class Plateau {
    public ArrayList<Integer> dimensions;

    public Plateau(ArrayList<Integer> dimensions) throws Exception {
        this.dimensions = dimensions;
        validateDimensions();
    }

    public void validateDimensions() throws Exception {
        for (Integer dimension : dimensions) {
            if (dimension < 0) {
                throw new Exception("Cannot enter negative values");
            }
        }
    }
    /*
    private String name;
    private ArrayList<Rover> roverList;


    public Plateau(String name) {
        this.name = name;
        this.roverList = new ArrayList<Rover>();
    }

    public boolean addRover(Rover rover){
        if (rover==null || roverList.contains(rover)) {
            return false;
        }
        roverList.add(rover);
        return true;
    } */
/*
    public void addRovers(Rover[] rovers){
        for(int i = 0; i < rovers.length; i++){
            roverList.add(rovers[i]);
        }
    }*/


}
