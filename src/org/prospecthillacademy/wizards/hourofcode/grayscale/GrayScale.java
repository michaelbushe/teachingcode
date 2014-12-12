package org.prospecthillacademy.wizards.hourofcode.grayscale;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class GrayScale {
    BufferedImage image;
    int width;
    int height;

    public GrayScale() {
        try {
            String fileName = "balloons.jpg";
            String inputFilePath = "in/" + fileName;
            File input = new File(inputFilePath);
            image = ImageIO.read(input);
            width = image.getWidth();
            height = image.getHeight();

            double newRed = 0.1;
            double newGreen = 0.1;
            double newBlue = 0.8;

            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    Color c = new Color(image.getRGB(j, i));
                    int red = (int) (c.getRed() * newRed);
                    int green = (int) (c.getGreen() * newGreen);
                    int blue = (int) (c.getBlue() * newBlue);
                    Color newColor = new Color(red, green, blue);
                    image.setRGB(j, i, newColor.getRGB());
                }
            }
            File output = new File("out/filtered" + fileName);
            ImageIO.write(image, "jpg", output);
            //ARRRGGG!!! Never do this.  You will never find out when an error occurs.  Errors are just as important!
            //} catch (Exception e) {
            //}
        } catch (IOException e) {
            //Will help debug the problem...
            System.err.print("Error:" + e);
            e.printStackTrace();
        }
    }

    static public void main(String args[]) throws Exception {
        GrayScale obj = new GrayScale();
    }
}
