package com.example.location.Entity.Rentable;

public class Money {
    private final double principal;
    private final double interestRate;
    private final int days;

    public Money(double principal, double interestRate, int days) {
        this.principal = principal;
        this.interestRate = interestRate;
        this.days = days;
    }

    public double getTotalRepayment() {
        return principal * (1 + interestRate * days / 365);
    }

    public double getInterestAmount() {
        return principal * interestRate * days / 365;
    }
}