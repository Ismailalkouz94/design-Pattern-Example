package concreteClasses;

import interfaces.Shape;

public class Square implements Shape {

   @Override
   public void draw() {
      System.out.println("Square::draw()");
   }
}