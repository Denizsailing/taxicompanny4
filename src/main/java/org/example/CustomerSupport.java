package org.example;

import org.example.interfaces.IWorker;

class CustomerSupport extends Person implements IWorker {
    private double hourlyRate;

    public CustomerSupport(String name, int age, double hourlyRate) {
        super(name, age);
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * 40 * 52;
    }
}
