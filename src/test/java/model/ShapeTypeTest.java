package model;

import model.quadrangle.Parallelogram;
import model.quadrangle.Quadrangle;
import model.quadrangle.Rectangle;
import model.triangle.EquilateralTriangle;
import model.triangle.IsoscelesTriangle;
import model.triangle.RectangularTriangle;
import model.triangle.Triangle;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeTypeTest {

    @Test
    public void getName() {
        Assert.assertEquals("Треугольник", new Triangle(4,5,6).getName());
        Assert.assertEquals("Равнобедренный треугольник", new IsoscelesTriangle(4, 5).getName());
        Assert.assertEquals("Равносторонний треугольник", new EquilateralTriangle(4).getName());
        Assert.assertEquals("Прямоугольный треугольник", new RectangularTriangle(3, 4).getName());
        Assert.assertEquals("Четырёхугольник", new Quadrangle(1, 2, 3, 4).getName());
        Assert.assertEquals("Параллелограмм", new Parallelogram(5, 6, 4).getName());
        Assert.assertEquals("Прямоугольник", new Rectangle(4, 6).getName());
    }
}