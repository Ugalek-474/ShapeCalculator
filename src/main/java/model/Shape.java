package model;

public abstract class Shape {
    private ShapeType type;

    protected Shape(ShapeType type){

        this.type = type;
    }

    protected abstract double getPerimeter();

    public String getName() {
        return type.getName();
    }

}
