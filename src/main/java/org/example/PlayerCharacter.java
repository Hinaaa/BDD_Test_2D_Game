package org.example;

public class PlayerCharacter {
    public static int x;
    public static int y;
    public PlayerCharacter() {//constructor
        this.x = 0;
        this.y = 0;
    }
    public static int getX() {
        return x;
    }
    public static int getY() {
        return y;
    }
    public static int moveUpDown(char direction) {
        int positionX =0;
        if(direction=='W' || direction=='w') {
            positionX=positionX-1;
        }
        if(direction=='S' || direction=='s') {
            positionX=positionX+1;
        }
        return positionX;
    }
    public static int moveLeftRight(char direction) {
        int positionY =0;
        if(direction=='A' || direction=='a') {
            positionY=positionY-1;
        }
        if(direction=='D' || direction=='d') {
            positionY=positionY+1;
        }
        return positionY;
    }


}
