package com.company;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    private final Sun sun = new Sun();
    private final Ground ground = new Ground();
    private final Sky sky = new Sky();
    private final House house = new House();
    private final Trees tree = new Trees();
    private final int[] x = {30, 130, 230};
    private final int[] y ={170, 120, 170};


    @Override
    public void paint(Graphics g) {
        int i;
        Graphics2D gr = (Graphics2D) g;
        sky.drawSky(gr, 0, 0, 500, 300, Color.BLUE);
        sun.drawSun(gr,400, 100, 50, 120, 50, Color.ORANGE);
        ground.drawGround(gr, 0, 300, 500,200, Color.GREEN);
        house.drawWall(gr,30, 170, 200, 150, Color.DARK_GRAY);
        house.drawRoof(gr, x, y, 3, Color.LIGHT_GRAY);
        house.drawDoor(gr, 50, 230, 50, 90, Color.BLACK);
        house.drawDoorHandle(gr, 55, 277, 5, Color.WHITE);
        house.drawWindow(gr, 130, 215, 60, 60, Color.white);
        for (i = 0; i < 10; i++) {
            final int TREEx = (int) (Math.random() * 490);
            final int TREEy = 320 + (int) (Math.random() * 80);
            tree.drawTree(gr, TREEx, TREEy, 8, 100, new Color(49, 18, 1, 255));
        }
    }

    }



