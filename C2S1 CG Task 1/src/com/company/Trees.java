package com.company;

import java.awt.*;

public class Trees {
    public void drawTree(Graphics2D g, int x, int y, int width, int heigth, Color color ){
        g.setColor(color);
        g.fillRect(x, y, width, heigth);
        g.setColor(new Color(3, 61, 40));
        g.fillOval(x - 14, y - 8, 36, 100);
    }
}
