package org.example.model;

import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Bed bed = new Bed("double",2,2 ,1,1);
        Carpet carpet = new Carpet(3,3,PaintColor.WHITE);
        Ceiling ceiling = new Ceiling(3, PaintColor.GREEN);
        Lamp lamp = new Lamp(LampType.NEON,true,90);
        Wall northWall = new Wall("North");
        Wall eastWall = new Wall("East");
        Wall westWall = new Wall("West");
        Wall southWall = new Wall("South");
        Wall[] walls = new Wall[] {northWall,eastWall,westWall,southWall};
        Wardrobe wardrobe = new Wardrobe(2,2 , 150);

        Bedroom bedroom = new Bedroom("Bedroom" , northWall,eastWall,westWall,southWall,ceiling,bed,lamp,wardrobe,carpet);
        System.out.println(bedroom.toString());
    }
}