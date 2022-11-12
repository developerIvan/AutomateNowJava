package cars;

public abstract class Car {
    protected String make;
    protected String model;
    protected int year;

    public abstract String getMake();
    public abstract String getModel();
    public abstract int getYear();
}
