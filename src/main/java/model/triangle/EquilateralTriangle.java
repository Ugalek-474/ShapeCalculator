package model.triangle;

import model.ShapeType;

public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(double side) {
        super(ShapeType.EQUILATERAL_TRIANGLE,side, side, side);
    }

    @Override
    public double getPerimeter() {
        return firstSide * 3 ;
    }

    @Override
    public double getSquare() {
        return  Math.sqrt(3) * Math.pow(firstSide, 2) / 4;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(this.getName());
        builder.append("\nСторона: ").append(firstSide);
        builder.append("\nПериметр: ").append(getPerimeter());
        builder.append("\nПлощадь: ").append(getSquare());
        return builder.toString();
    }

}
