package com.levelup.forestsandmonsters.features;

import com.levelup.forestsandmonsters.GameController;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.*;
import java.awt.Point;

public class StartGameSteps {

    GameController gc;
    int defaultX, defaultY,startX,startY;
    Point startPosition;
   
    @Given("the character agrees to start the game with default XCoordinates {int}")
    public void the_character_agrees_to_start_the_game_with_default_x_coordinates(int defaultX) {
       this.defaultX = defaultX;
       // throw new io.cucumber.java.PendingException();
    }
    
    @Given("with default YCoordinates {int}")
    public void with_default_y_coordinates(int defaultY) {
        this.defaultY = defaultY;
        //throw new io.cucumber.java.PendingException();
    }
    
    @When("the game starts")
    public void the_game_starts() {
       gc = new  GameController();
       gc.startGame();
       System.out.println("current pos:"+gc.getStatus().getCurrentPosition());
       startPosition =  new Point (gc.getStatus().getCurrentPosition().x , gc.getStatus().getCurrentPosition().y);
    System.out.println(startPosition.x);
       
       
       // throw new io.cucumber.java.PendingException();
    }
    
    @Then("the character is now at start position with XCoordinates {int}")
    public void the_character_is_now_at_position_with_x_coordinates_start_positionx(int startPositionX) {
        System.out.println(" Friday Then startPosition.x"+ startPosition.x);
        System.out.println("Friday Then startPositionX" +startPositionX);
        assertNotNull("Expected position not null", this.startPosition);
        assertEquals(startPositionX, this.startPosition.x);
       // throw new io.cucumber.java.PendingException();
    }
    
    @Then("with start YCoordinates {int}")
    public void with_y_coordinates(int startPositionY) {
        assertNotNull("Expected position not null", this.startPosition);
        assertEquals(startPositionY, this.startPosition.y);
        //throw new io.cucumber.java.PendingException();
    }



}
