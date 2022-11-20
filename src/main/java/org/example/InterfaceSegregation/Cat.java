package org.example.InterfaceSegregation;

public class Cat implements Animal, Walkable {
    @Override
    public void getType() {
        System.out.println("Cat");
    }

    @Override
    public void CanWalk() {
        System.out.println("It can walk");
    }
}

