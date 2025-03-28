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
    @Test
    void getMinus1_onSendingWToMoveUp_WithXYCoorinatesPositionIs00() {
        char direction = 'w';
        int actualValue = PlayerCharacter.moveUpDown(direction);
        assertEquals(-1,actualValue);
    }
    @Test
    void get_onSendingSToMoveDown_WithXYCoorinatesPositionIs00() {
        char direction = 's';
        int actualValue = PlayerCharacter.moveUpDown(direction);
        assertEquals(1,actualValue);
    }
    @Test
    void getMinus1_onSendingAToMoveLeft_WithXYCoorinatesPositionIs00() {
        char direction = 'a';
        int actualValue = PlayerCharacter.moveLeftRight(direction);
        assertEquals(-1,actualValue);
    }
    @Test
    void get1_onSendingDToMoveRight_WithXYCoorinatesPositionIs00() {
        char direction = 'd';
        int actualValue = PlayerCharacter.moveLeftRight(direction);
        assertEquals(1,actualValue);
    }
}