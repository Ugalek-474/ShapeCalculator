package model;

public abstract class Shape {
    private String name;

    protected Shape(String name){

        this.name = name;
    }

    protected abstract double getPerimeter();

    public String getName() {
        return name;
    }

}
