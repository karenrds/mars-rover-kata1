package com.techreturners;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class PlateauTest {
    @Test
    public void validateIfDimensionIsGreaterThanZero() throws Exception {
        try {
            MarsRoversController marsRoversController = new MarsRoversController();
            ArrayList<Integer> dimensions = new ArrayList<>();
            dimensions.add(5);
            dimensions.add(-5);

            marsRoversController.plateau = new Plateau(dimensions);
            fail();
        } catch (IllegalArgumentException ex) {
            assertEquals("Cannot enter negative values", ex.getMessage());
        }
    }
}
