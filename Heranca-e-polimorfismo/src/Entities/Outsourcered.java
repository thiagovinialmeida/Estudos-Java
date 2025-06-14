package Entities;

public class Outsourcered extends Employee{

    private double AdditionalCharge;

    public Outsourcered(String name, int hours, double valuePerHours, double additionalCharge) {
        super(name, hours, valuePerHours);
        AdditionalCharge = additionalCharge;
    }

    @Override
    public double Payment(){
        return super.Payment() + 200 * 1.1;
    }
}
