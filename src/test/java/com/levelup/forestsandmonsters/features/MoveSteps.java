package com.levelup.forestsandmonsters.features;

import com.levelup.forestsandmonsters.GameController;



import java.awt.Point;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.*;


public class MoveSteps {
    GameController gc;
    int startX, startY,endX,endY;
    GameController.DIRECTION direction;
    Point currentPosition;

    @Given("the character starts at position with XCoordinates {int}")
public void givenTheCharaterStartsAtX(int startX) {
    this.startX=startX;
    //throw new io.cucumber.java.PendingException();
}

@Given("starts at YCoordinates {int}")
public void givenTheCharactersStartAtY(int startY) {
    this.startY = startY;
    //throw new io.cucumber.java.PendingException();
}

@Given("the player chooses to move in {word}")
public void givenPlayerChoosesDirection(String direction) {
    this.direction=GameController.DIRECTION.valueOf(direction);
    //throw new io.cucumber.java.PendingException();
}

@When("the character moves")
public void theCharacterMoves() {
    gc = new GameController();
    gc.setCharacterPosition (new Point(this.startX,this.startY));
    gc.move(this.direction);
    GameController.GameStatus status = gc.getStatus();
    this.currentPosition = status.getCurrentPosition();
    //throw new io.cucumber.java.PendingException();
}

@Then("the character is now at position with XCoordinates {int}")
public void checkXCoordinates(int endX) {
    assertNotNull("Expected position not null", this.currentPosition);
    assertEquals(endX, this.currentPosition.x);
    //throw new io.cucumber.java.PendingException();
}

@Then("YCoordinates {int}")
public void checkYCoordinates(int endY) {
    assertNotNull("Expected position not null", this.currentPosition);
    assertEquals(endY, this.currentPosition.y);
    //throw new io.cucumber.java.PendingException();
}




}
