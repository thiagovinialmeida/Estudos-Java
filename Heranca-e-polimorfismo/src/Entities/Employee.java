package Entities;

public class Employee {
    protected String Name;
    protected int Hours;
    protected double ValuePerHours;

    public Employee(String name, int hours, double valuePerHours) {
        Name = name;
        Hours = hours;
        ValuePerHours = valuePerHours;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getHours() {
        return Hours;
    }

    public void setHours(int hours) {
        Hours = hours;
    }

    public double getValuePerHours() {
        return ValuePerHours;
    }

    public void setValuePerHours(double valuePerHours) {
        ValuePerHours = valuePerHours;
    }

    public double Payment(){
        return Hours * ValuePerHours;
    }
}
