/*
 * IP4S/src/java/ImageViewer/View.java
 * 
 * Copyright (C) 2017 K.Takeuchi
 *
 *
 */
package ip4s.ImageViewer;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class View extends JFrame{

    private final BufferedImage image;

    //setting jframe
    public View(BufferedImage img, int img_width, int img_height){

        //set BufferedImage
        this.image = img;

        //setting window
        setTitle("IP4S ImageViewer");
        setSize(img_width+10, img_height+10);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    //draw BufferedImage
    public void paint(Graphics g){

        Graphics2D g2 = (Graphics2D)g;
        BufferedImage image = this.image;

        g2.drawImage(image,0,0,this);

    }

    //show image viewer
    public void show(){
        setVisible(true);
    }

}