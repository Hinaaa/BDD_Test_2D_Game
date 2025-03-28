package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerCharacterTest {

    //check x and y 0
    @Test
    void getX_shouldReturnValue0() {
        int expectedX = 0;
        int actualx = PlayerCharacter.getX();
        assertEquals(expectedX,actualx);
    }
    @Test
    void getY_shouldReturnValue0() {
        int expectedY = 0;
        int actualy = PlayerCharacter.getY();
        assertEquals(expectedY,actualy);
    }
}