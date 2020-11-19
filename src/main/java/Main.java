import model.Shape;
import model.quadrangle.Rectangle;
import model.triangle.EquilateralTriangle;
import model.triangle.IsoscelesTriangle;
import model.triangle.RectangularTriangle;
import model.triangle.Triangle;
import model.quadrangle.Parallelogram;
import model.quadrangle.Quadrangle;
import model.quadrangle.Trapeze;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[8];
        shapes[0] = new Triangle(4, 5, 6);
        shapes[1] = new IsoscelesTriangle(5, 4);
        shapes[2] = new EquilateralTriangle(3);
        shapes[3] = new RectangularTriangle(3, 4);
        shapes[4] = new Quadrangle(2,4,3,5);
        shapes[5] = new Trapeze(5,2,5,8);
        shapes[6] = new Parallelogram(5,8,4);
        shapes[7] = new Rectangle(4,6);
        for (Shape shape : shapes) {
            System.out.println(shape + "\n");
        }


    }
}
