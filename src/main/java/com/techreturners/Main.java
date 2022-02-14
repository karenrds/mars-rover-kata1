package com.techreturners;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Plateau dimensions");
        String input = sc.nextLine();
        if (input.isEmpty() || input.equals("")) {
            throw new Exception("Invalid input");
        }
        String[] numbers = input.split(" ");
        int dimension1 = Integer.parseInt(numbers[0]);
        int dimension2 = Integer.parseInt(numbers[1]);

        MarsRoversController marsRoversController = new MarsRoversController();
        ArrayList<Integer> dimensions = new ArrayList<Integer>();
        dimensions.add(dimension1);
        dimensions.add(dimension2);

        marsRoversController.plateau = new Plateau(dimensions);

        System.out.println("Enter Rover1 position");
        String positionInput = sc.nextLine();
        String[] inputArray = positionInput.split(" ");
        int xCoordinateRover1 = Integer.parseInt(inputArray[0]);
        int yCoordinateRover1 = Integer.parseInt(inputArray[1]);
        String positionName1 = inputArray[2];

        System.out.println("Enter Rover1 commands");
        String commandRover1 = sc.nextLine();

        System.out.println("Enter Rover2 position");
        String positionInput2 = sc.nextLine();
        String[] inputArray2 = positionInput2.split(" ");
        int xCoordinateRover2 = Integer.parseInt(inputArray2[0]);
        int yCoordinateRover2 = Integer.parseInt(inputArray2[1]);
        String positionName2 = inputArray2[2];

        System.out.println("Enter Rover2 commands");
        String commandRover2 = sc.nextLine();

        marsRoversController.roverList = new ArrayList<Rover>();
        marsRoversController.roverList.add(new Rover("Rover1", xCoordinateRover1, yCoordinateRover1, positionName1));
        marsRoversController.roverList.add(new Rover("Rover2", xCoordinateRover2, yCoordinateRover2, positionName2));

        System.out.println(marsRoversController.setDirection(commandRover1, marsRoversController.roverList.get(0)));
        System.out.println(marsRoversController.setDirection(commandRover2, marsRoversController.roverList.get(1)));
    }
}
