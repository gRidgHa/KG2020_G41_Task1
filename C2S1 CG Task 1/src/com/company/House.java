package com.company;

import java.awt.*;

public class House {
    public void drawWall(Graphics2D g, int x, int y, int width, int heigth, Color color ){
        g.setColor(color);
        g.fillRect(x, y, width, heigth);
    }
    public void drawRoof(Graphics2D g, int[] x, int[] y, int numberofpoints, Color color ){
        g.setColor(color);
        g.fillPolygon(x, y, numberofpoints);
    }
    public void drawDoor(Graphics2D g, int x, int y, int width, int heigth, Color color ){
        g.setColor(color);
        g.fillRect(x, y, width, heigth);
    }
    public void drawDoorHandle(Graphics2D g, int x, int y, int r, Color color ) {
        g.setColor(color);
        g.fillOval(x, y, r, r);
    }
    public void drawWindow(Graphics2D g, int x, int y, int width, int heigth, Color color ){
        g.setColor(color);
        g.fillRect(x, y, width, heigth);
        g.setColor(Color.darkGray);
        g.fillRect( x + width / 2 - 2, y, 4, heigth);
        g.fillRect( x, y + heigth / 2 - 2, width, 4);
    }
}
