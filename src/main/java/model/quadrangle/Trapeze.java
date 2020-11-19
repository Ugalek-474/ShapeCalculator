package model.quadrangle;

import model.ISquare;
import model.ShapeType;

public class Trapeze extends Quadrangle implements ISquare {

    double height;

    public Trapeze(double firstSide, double secondSide, double thirdSide, double fourthSide) {
        super(ShapeType.TRAPEZE, firstSide, secondSide, thirdSide, fourthSide);
        double diffSide = fourthSide - secondSide;
        height = Math.sqrt(Math.pow(firstSide, 2) - Math.pow((Math.pow(diffSide, 2) +
                Math.pow(firstSide, 2) - Math.pow(thirdSide, 2)) / (2 * diffSide), 2));
    }

    @Override
    public double getSquare() {
        return (secondSide + fourthSide) * height / 2;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(getName());
        builder.append("\nЛевая сторона: ").append(firstSide);
        builder.append("\nПравая сторона: ").append(thirdSide);
        builder.append("\nВерхнее основание: ").append(secondSide);
        builder.append("\nНижнее основание: ").append(fourthSide);
        builder.append("\nВысота: ").append(height);
        builder.append("\nПлощадь: ").append(getSquare());
        return builder.toString();
    }

}
