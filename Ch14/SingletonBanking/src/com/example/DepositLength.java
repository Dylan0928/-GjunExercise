package com.example;

public enum DepositLength {
    THREE_MONTHS(90),
    SIX_MONTHS(180),
    ONE_YEAR(365);
    
    private int days;

    private DepositLength(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }
    
}
