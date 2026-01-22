package com.mahadi.model;

public class Employee {
    private String eName;
    private String eAddress;

    public Employee(String eName, String eAddress) {
        this.eName = eName;
        this.eAddress = eAddress;
    }

    public String geteAddress() {
        return eAddress;
    }

    public void seteAddress(String eAddress) {
        this.eAddress = eAddress;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }
}
