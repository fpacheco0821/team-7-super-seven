package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

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

    @Test
    public void testMoveEAST() {
        GameController testObj = new GameController();
               
        //Set Character Position
        Point startPosition = new Point(5,5);
        GameCharacter gc = new GameCharacter();
        //gc.setPosition(givenPosition);
        testObj.setGameCharacter(gc);
        testObj.setCharacterPosition(startPosition);

        // End Position
        Point endPosition = new Point(6,5);
        testObj.move(DIRECTION.EAST);

        assertEquals(endPosition.x,testObj.getGameCharacter().getPosition().x);
        assertEquals(endPosition.y,testObj.getGameCharacter().getPosition().y);

        assertEquals(endPosition.x,testObj.getStatus().currentPosition.x);
        assertEquals(endPosition.y,testObj.getStatus().currentPosition.y);
        assertEquals("Super7",testObj.getStatus().characterName);
  

    }

    @Test
    public void testMoveWEST() {
        GameController testObj = new GameController();
               
        //Set Character Position
        Point startPosition = new Point(5,5);
        GameCharacter gc = new GameCharacter();
        //gc.setPosition(givenPosition);
        testObj.setGameCharacter(gc);
        testObj.setCharacterPosition(startPosition);

        // End Position
        Point endPosition = new Point(4,5);
        testObj.move(DIRECTION.WEST);

        assertEquals(endPosition.x,testObj.getGameCharacter().getPosition().x);
        assertEquals(endPosition.y,testObj.getGameCharacter().getPosition().y);
    }

    @Test
    public void testMoveSOUTH() {
        GameController testObj = new GameController();
               
        //Set Character Position
        Point startPosition = new Point(5,5);
        GameCharacter gc = new GameCharacter();
        //gc.setPosition(givenPosition);
        testObj.setGameCharacter(gc);
        testObj.setCharacterPosition(startPosition);

        // End Position
        Point endPosition = new Point(5,6);
        testObj.move(DIRECTION.SOUTH);

        assertEquals(endPosition.x,testObj.getGameCharacter().getPosition().x);
        assertEquals(endPosition.y,testObj.getGameCharacter().getPosition().y);
    }

    @Test
    public void testMoveNORTH() {
        GameController testObj = new GameController();
               
        //Set Character Position
        Point startPosition = new Point(5,5);
        GameCharacter gc = new GameCharacter();
        //gc.setPosition(givenPosition);
        testObj.setGameCharacter(gc);
        testObj.setCharacterPosition(startPosition);

        // End Position
        Point endPosition = new Point(5,4);
        testObj.move(DIRECTION.NORTH);

        assertEquals(endPosition.x,testObj.getGameCharacter().getPosition().x);
        assertEquals(endPosition.y,testObj.getGameCharacter().getPosition().y);
    }

    @Test
    public void testMove1_1NorthEdgeCase() {
        GameController testObj = new GameController();
               
        //Set Character Position
        Point startPosition = new Point(1,1);
        GameCharacter gc = new GameCharacter();
        //gc.setPosition(givenPosition);
        testObj.setGameCharacter(gc);
        testObj.setCharacterPosition(startPosition);

        // End Position
        Point endPosition = new Point(1,1);
        testObj.move(DIRECTION.NORTH);

        assertEquals(endPosition.x,testObj.getGameCharacter().getPosition().x);
        assertEquals(endPosition.y,testObj.getGameCharacter().getPosition().y);

        assertEquals(endPosition.x,testObj.getStatus().currentPosition.x);
        assertEquals(endPosition.y,testObj.getStatus().currentPosition.y);
        assertEquals("Super7",testObj.getStatus().characterName);
  

    } 

    @Test
    public void testIniializeMap() {
        GameController testObj = new GameController();
        testObj.startGame();

        GameMap gm = testObj.getMap();

        assertNotNull(gm);
        assertNotNull(gm.getMapPositions());
        assertEquals(gm.getMapPositions().length, 10);

    }

    @Test
    public void testEnterMap(){
        GameController testObj = new GameController();
        testObj.startGame();

        Point expectedPosition = new Point(5,5);

        Point currentPosition = testObj.getGameCharacter().getPosition();

        assertEquals(expectedPosition.x,currentPosition.x);
        assertEquals(expectedPosition.y,currentPosition.y);    

        assertEquals(expectedPosition.x,testObj.getStatus().currentPosition.x);
        assertEquals(expectedPosition.y,testObj.getStatus().currentPosition.y);        
        
        
    }
    

}