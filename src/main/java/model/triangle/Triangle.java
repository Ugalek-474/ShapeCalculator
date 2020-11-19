package model.triangle;

import model.ISquare;
import model.Shape;

import java.util.Objects;

public class Triangle extends Shape implements ISquare {

    double firstSide;
    double secondSide;
    double thirdSide;

    protected Triangle(String name, double firstSide, double secondSide, double thirdSide){
        super(name);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public Triangle(double firstSide, double secondSide, double thirdSide){
        this("Треугольник", firstSide, secondSide, thirdSide);

    }

    @Override
    public double getPerimeter() {

        return firstSide + secondSide + thirdSide;
    }

    @Override
    public double getSquare() {
        double halfPerimetr = getPerimeter() / 2;
        return Math.sqrt(halfPerimetr * (halfPerimetr - firstSide) *
                (halfPerimetr - secondSide) * (halfPerimetr - thirdSide));
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(this.getName());
        builder.append("\nПервая сторона: ").append(firstSide);
        builder.append("\nВторая сторона: ").append(secondSide);
        builder.append("\nТретья сторона: ").append(thirdSide);
        builder.append("\nПериметр: ").append(getPerimeter());
        builder.append("\nПлощадь: ").append(getSquare());
        return builder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        if (Double.compare(triangle.firstSide, firstSide) != 0) return false;
        if (Double.compare(triangle.secondSide, secondSide) != 0) return false;
        return Double.compare(triangle.thirdSide, thirdSide) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstSide, secondSide, thirdSide);
    }

}
