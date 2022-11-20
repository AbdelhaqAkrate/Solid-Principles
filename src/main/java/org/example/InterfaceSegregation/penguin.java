package org.example.InterfaceSegregation;

public class penguin implements Animal,swimmable, Walkable {
    @Override
    public void getType() {
        System.out.println("bird");
    }

    @Override
    public void CanSwim() {
        System.out.println("It can swim");
    }

    @Override
    public void CanWalk() {
        System.out.println("It can walk");
    }
}
