package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import java.awt.Point;


public class GameControllerTest {
    @Test
    public void InitializationCreatesResults() {
        GameController testObj = new GameController();
        assertNotNull(testObj.status);
    }

    @Test
    public void testSetCharacterPosition() {
        Point givenPosition = new Point(5,5);
        GameController testObj = new GameController();
        GameCharacter gc = new GameCharacter();
        //gc.setPosition(givenPosition);
        testObj.setGameCharacter(gc);
        testObj.setCharacterPosition(givenPosition);
        System.out.println(testObj.getGameCharacter().getPosition().x);
        assertEquals(givenPosition.x,testObj.getGameCharacter().getPosition().x);
        assertEquals(givenPosition.y,testObj.getGameCharacter().getPosition().y);
        
    }

}
