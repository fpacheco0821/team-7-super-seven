package com.levelup.forestsandmonsters;

import java.awt.Point;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class GameCharacter {

    Point position = null;

    public GameCharacter(){
        this.position = new Point(5,5);
    }
    public Point getPosition() {
        return this.position;
    }

    public void enterMap(Point pos){
        this.position = pos;
    }

    public void setPosition(Point position){
        this.position = position;
    }

    public void move(DIRECTION directionToMove) {
        
       Point newPositon = new Point();
       newPositon.x = this.position.x;
       newPositon.y = this.position.y;

        switch (directionToMove){

            case EAST:
            newPositon.x =   this.position.x+1;
            break;

            case WEST:
            newPositon.x  =   this.position.x-1;
            break;

            case NORTH:
            newPositon.y =   this.position.y-1;
            break;

            case SOUTH:
            newPositon.y =   this.position.y+1;
            break;
        }

        if (isValidPosition(newPositon)){
            this.position = newPositon;
        }
    }
    private boolean isValidPosition(Point newPositon) {
        return newPositon.x >= 1 && newPositon.x <= 10 &&
               newPositon.y >= 1 && newPositon.y <= 10  ;
    }



}
