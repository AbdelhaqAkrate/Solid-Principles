package org.example.LiskovSubstitution;

public class Square extends Rectangle {
    public Square(double h) {
        super(h,h);
    }
    @Override
    public void setH(double h) {
        this.h = h;
        this.w = h;
    }
    @Override
    public void setW(double w) {
        this.h = w;
        this.w = w;
    }
}

