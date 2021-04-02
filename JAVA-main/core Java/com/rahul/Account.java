package com.rahul;

public class Account
{
    private String Account_Number;
    private double balance;
    private String customer_name;
    private String email;
    private String phone_number;

    public Account()
    {
        this("00000",0.00,"no name","no email","0000");
        System.out.println("no arg constructor");
    }

    public Account(String account_Number, double balance, String customer_name, String email, String phone_number) {
        System.out.println("parameterised constructor");
        this.Account_Number = account_Number;
        this.balance = balance;
        this.customer_name = customer_name;
        this.email = email;
        this.phone_number = phone_number;
    }

    public Account(String customer_name, String email, String phone_number) {
        this("00000",0.00,customer_name,email,phone_number);
    }

    public void setAccount_Number(String account_Number) {
        this.Account_Number = account_Number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getAccount_Number() {
        return Account_Number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void deposit_fund(double deposit_amount)
    {
        this.balance += deposit_amount;
        System.out.println(customer_name + " ,you have deposited "+deposit_amount+" and the current" +
                "balance is " + balance);
    }

    public void withdraw(double withdrawl_amount)
    {
        double current_balance = this.balance;
        if((current_balance-withdrawl_amount) < 1000)
        {
            System.out.println("You don't have sufficient funds in your account");
        }
        else
        {
            this.balance -= withdrawl_amount;
            System.out.println("You have withdrawn "+withdrawl_amount+" and the current balance is "+balance);
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "Account_Number='" + Account_Number + '\'' +
                ", balance=" + balance +
                ", customer_name='" + customer_name + '\'' +
                ", email='" + email + '\'' +
                ", phone_number='" + phone_number + '\'' +
                '}';
    }
}
