package edu.jamashie;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by tonte on 4/16/17.
 */

public class DogTest {

    @Test
    public void testDogCreation() {
        int expectedSize = 50;
        String expectedBreed = "Pit Bull";
        String expectedName = "Sparky";
        String expectedBark = "Ruff! Ruff";
        int actualSize;
        String actualBreed;
        String actualName;

        Dog d = new Dog();
        actualSize = d.size = 50;
        actualBreed = d.breed = "Pit Bull";
        actualName = d.name = "Sparky";

        assertNotNull("should not be null", d);
        assertEquals("should be equal to one another", expectedBreed, actualBreed);
        assertEquals("should be equal to one another", expectedName, actualName);
        assertEquals("should be equal to one another", expectedSize, actualSize);
        assertEquals("should be equal to one another", expectedBreed, actualBreed);
        assertEquals("should be equal to one another", expectedBreed, actualBreed);
    }


}
