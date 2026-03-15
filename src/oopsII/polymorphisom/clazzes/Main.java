package oopsII.polymorphisom.clazzes;

import java.awt.*;

/*In this class we will learn about the polymorphism*/
public class Main {
    public static void main(String[] args) {
        Polygon[] polygons = {
                new Square(),
                new Circle(),
                new Rectangle()
        };
        for (Polygon p : polygons) {
//            System.out.println("Rendering " + p.getClass().getSimpleName());
            p.render();
        }
    }
}
