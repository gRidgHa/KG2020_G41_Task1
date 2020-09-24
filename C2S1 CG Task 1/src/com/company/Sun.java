package com.company;

import java.awt.*;

public class Sun {

    public void drawSun(Graphics2D g, int x, int y, int r, int R, int n, Color color ){
        g.setColor(color);
        g.fillOval(x - r, y - r, r + r, r + r);
        double da = 2 * Math.PI / n;
        for (int i = 0; i < n; i++){
            int dx1, dx2, dy1, dy2;
            dx1 =(int)(x + r * Math.cos(da * i));
            dy1 =(int)(y + r * Math.sin(da * i));
            if (i % 2 == 0){
                dx2 =(int)(x + (R / 1.5) * Math.cos(da * i));
                dy2 =(int)(y + (R / 1.5) * Math.sin(da * i));
            }else{
                dx2 =(int)(x + (R / 1.25) * Math.cos(da * i));
                dy2 =(int)(y + (R / 1.25) * Math.sin(da * i));
            }
            g.drawLine(dx1, dy1, dx2, dy2);
        }

    }

}
