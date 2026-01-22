package com.mahadi.model;

public class Trainee {
    private int tId;
    private String tName;
    private int tAge;
    private String tAddress;
    private double tSalary;

    public Trainee(int tId, String tName, int tAge, String tAddress, double tSalary) {
        this.tId = tId;
        this.tName = tName;
        this.tAge = tAge;
        this.tAddress = tAddress;
        this.tSalary = tSalary;
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public int gettAge() {
        return tAge;
    }

    public void settAge(int tAge) {
        this.tAge = tAge;
    }

    public String gettAddress() {
        return tAddress;
    }

    public void settAddress(String tAddress) {
        this.tAddress = tAddress;
    }

    public double gettSalary() {
        return tSalary;
    }

    public void settSalary(double tSalary) {
        this.tSalary = tSalary;
    }
}
