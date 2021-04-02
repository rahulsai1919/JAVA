package com.rahul;

public class VipCustomer
{
    private String name;
    private double credit_limit;
    private String email;

    public VipCustomer() {
        this("empty name",0.00,"customer email");
        System.out.println("no arg constructor");
    }

    public VipCustomer(String name, String email) {

        this(name,0.00,email);
        System.out.println("two arg constructor");
    }

    public VipCustomer(String name, double credit_limit, String email) {
        this.name = name;
        this.credit_limit = credit_limit;
        this.email = email;
        System.out.println("all arg constructor");
    }

    public String getName() {
        return name;
    }

    public double getCredit_limit() {
        return credit_limit;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "VipCustomer{" +
                "name='" + name + '\'' +
                ", credit_limit=" + credit_limit +
                ", email='" + email + '\'' +
                '}';
    }
}
