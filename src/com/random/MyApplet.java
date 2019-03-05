package com.random;

import java.applet.*;
import java.awt.*;

public class MyApplet extends Applet{
    private String msg = " ";

    public void init() {
        setBackground(Color.BLUE);
        msg += "init ";
    }
    public void start() {
        msg += "start ";
    }
    public void stop() {
        msg += "stop ";
    }
    public void destroy() {
        msg += "destroy ";
    }
    public void paint(Graphics g) {
        msg += "paint ";
        g.drawString(msg, 50, 50);
    }
}

//<applet code="MyApp" height=300 width=400></applet>
