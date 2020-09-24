package com.company;

import java.awt.*;

public class Sky{
    public void drawSky(Graphics2D g, int x, int y, int width, int heigth, Color color){
        g.setColor(color);
        g.fillRect(x, y, width, heigth);
    }
}
