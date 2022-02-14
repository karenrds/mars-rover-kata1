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
                throw new IllegalArgumentException("Cannot enter negative values");
            }
        }
    }
}
