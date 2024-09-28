package org.example.model;

import org.example.model.enums.PaintColor;

public class Carpet {
    private PaintColor color;
    private int height,width;


    public Carpet(int height, int width ,PaintColor color) {
        this.color = color;
        this.height = height;
        this.width = width;
    }

    public PaintColor getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }
    public int getWidth(){
        return width;
    }

    public void lying(){
        System.out.println("Carpet is lying on Bedroom floor.");
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "color=" + color +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
