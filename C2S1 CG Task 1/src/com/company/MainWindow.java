package com.company;

import javax.swing.*;
import java.awt.*;


public class MainWindow extends JFrame {
    public MainWindow(){
        DrawPanel panel = new DrawPanel();
        this.add(panel);
    }


}
