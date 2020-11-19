package model.quadrangle;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    Rectangle rectangle;

    @Before
    public void setUp() throws Exception {
        rectangle = new Rectangle(4, 6);
    }

    @Test
    public void getPerimeter() {
        Assert.assertEquals(20, rectangle.getPerimeter(),0);
    }

    @Test
    public void getName() {
        Assert.assertEquals("Прямоугольник", rectangle.getName());
    }

    @Test
    public void getSquare() {
        Assert.assertEquals(24, rectangle.getSquare(),0);
    }

    @Test
    public void testToString() {
        String expected = """
                Прямоугольник
                Первая сторона: 4.0
                Вторая сторона: 6.0
                Периметр: 20.0
                Площадь: 24.0""";
        Assert.assertEquals(expected, rectangle.toString());
    }
}