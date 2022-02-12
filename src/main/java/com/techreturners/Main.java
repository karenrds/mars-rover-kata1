package com.techreturners;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
         Scanner sc = new Scanner(System.in);
        /*System.out.println("Enter Plateau surface");
        String name = sc.nextLine();
        Plateau plateau = new Plateau(name);
        System.out.println("Plateau Surface: "+name);
        System.out.println("Enter "+name+" values");
        int x = sc.nextInt();
        int y = sc.nextInt(); */
        //int[] vars = new int[1];
        //for(int i = 0; i < vars.length; i++)
        //    vars[i] = sc.nextInt();
        /*System.out.println("Plateau Surface: "+name+ " coordinates are ("+x+","+y+")");

        Rectangle rectangle = new Rectangle(x,y);

        int xCoordinate = sc.nextInt();
        int yCoordinate = sc.nextInt();
        String positionName = sc.nextLine();

        rectangle.addRover(new Rover("rover1", xCoordinate,yCoordinate,positionName));
        System.out.println("Plateau Surface: "+name+ "("+x+","+y+")");

        rectangle.addRover(new Rover("rover2", xCoordinate,yCoordinate,positionName));
        System.out.println("Plateau Surface: "+name+ "("+x+","+y+")");*/

       /* ArrayList<Rover> rovers = new ArrayList<>();

        while (sc.hasNext()){
            Rover rover = new Rover(1, 2, "N");
            rovers.add(rover);
        }*/

        MarsRoversController marsRoversController = new MarsRoversController();
        ArrayList<Integer> dimensions = new ArrayList<Integer>();
        dimensions.add(5);
        dimensions.add(5);

        marsRoversController.plateau = new Plateau(dimensions);
        marsRoversController.roverList = new ArrayList<Rover>();
        marsRoversController.roverList.add(new Rover("rover1", 1, 2, Position.North));
        System.out.println(marsRoversController.setDirection("LMLMLMLMM", marsRoversController.roverList.get(0)));

        marsRoversController.roverList.add(new Rover("rover2", 3, 3, Position.East));
        System.out.println(marsRoversController.setDirection("MMRMMRMRRM", marsRoversController.roverList.get(1)));
    }
}
