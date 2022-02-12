package com.techreturners;

public enum Position {
    North("N"), South("S"), East("E"), West("W");

    public String position;

    Position(String position) {
        this.position = position;
    }
}