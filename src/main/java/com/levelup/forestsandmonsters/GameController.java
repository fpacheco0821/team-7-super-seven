package com.levelup.forestsandmonsters;

import java.awt.Point;


public class GameController {
    // TODO: If your stakeholder wants to call this CHARACTER, change var name for
    // low representational gap
    static final String DEFAULT_CHARACTER_NAME = "Super7";
    static final Point STARTING_POSITION = new Point(5,5);

    GameCharacter gameCharacter = null;
    GameMap gameMap = null;
    public class GameStatus {
        // TODO: Add other status data
        public String characterName = DEFAULT_CHARACTER_NAME;
        public Point currentPosition = null;
    }

    GameStatus status;

    public GameController() {
        status = new GameStatus();
        this.gameCharacter = new GameCharacter();

    }

    // TODO: Ensure this AND CLI commands match domain model
    public static enum DIRECTION {
        NORTH, SOUTH, EAST, WEST
    }

    // Pre-implemented to demonstrate ATDD
    // TODO: Update this if it does not match your design
    public void createCharacter(String name) {
        if (name != null && !name.equals("")) {
            status.characterName = name;
        } else {
            status.characterName = DEFAULT_CHARACTER_NAME;
        }
    }

    public void startGame() {
        this.gameMap = new GameMap();
        this.gameMap.init();    
        this.gameCharacter.enterMap(STARTING_POSITION); 
        this.status.currentPosition = STARTING_POSITION;   

    }

    public GameStatus getStatus() {
        return this.status;
    }

    public void move(DIRECTION directionToMove) {
        // TODO: Implement move - should call something on another class
        // TODO: Should probably also update the game results

        gameCharacter.move(directionToMove);
        Point endPoistion = gameCharacter.getPosition();
        this.status.currentPosition = endPoistion;      
    }

    public void setCharacterPosition(Point point) {
        this.gameCharacter.setPosition(point);
    }

    public GameCharacter getGameCharacter() {
        return this.gameCharacter;
    }

    public void setGameCharacter(GameCharacter gameCharacter ) {
        this.gameCharacter = gameCharacter;
    }

    public GameMap getMap() {
        return this.gameMap;
    }

}
