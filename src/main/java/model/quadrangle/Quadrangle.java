package model.quadrangle;

import model.Shape;
import model.ShapeType;

public class Quadrangle extends Shape {

    double firstSide;
    double secondSide;
    double thirdSide;
    double fourthSide;

    protected Quadrangle(ShapeType type, double firstSide, double secondSide,
                         double thirdSide, double fourthSide) {
        super(type);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        this.fourthSide = fourthSide;
    }

     public Quadrangle(double firstSide, double secondSide, double thirdSide, double fourthSide) {
        this(ShapeType.QUADRANGLE, firstSide, secondSide, thirdSide, fourthSide);
    }

    @Override
    protected double getPerimeter() {

        return firstSide + secondSide +thirdSide +fourthSide;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(this.getName());
        builder.append("\nПервая сторона: ").append(firstSide);
        builder.append("\nВторая сторона: ").append(secondSide);
        builder.append("\nТретья сторона: ").append(thirdSide);
        builder.append("\nЧетвёртая сторона: ").append(fourthSide);
        builder.append("\nПериметр: ").append(getPerimeter());
        return builder.toString();
    }

}
