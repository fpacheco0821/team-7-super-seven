package com.levelup.forestsandmonsters;

import java.awt.Point;

public class GameMap {

    static final int MAP_LIMIT_X = 10;
    static final int MAP_LIMIT_Y = 10;

    Point[][] pos = new Point[MAP_LIMIT_X][MAP_LIMIT_Y];

    GameMap(){
        
    }

    public void init() {
        for (int x = 0; x < MAP_LIMIT_X; x++ ){
            for (int y = 0; y < MAP_LIMIT_Y; y++ ){
                pos[x][y] = new Point(x+1,y+1);
            }
        }
    }

    public Point[][] getMapPositions(){
        return pos;
    }

}