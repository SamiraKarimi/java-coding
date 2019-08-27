package com.samira;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private  int teeth;
    private String coat;
    public Dog(String name, int size, int weight,int eyes,int legs, int teeth, String coat) {
        super(name,1, 1, size, weight);
        this.eyes = eyes;
        this.coat = coat;
        this.legs = legs;
        this.teeth = teeth;
    }
    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called!");
        chew();
        super.eat();
    }
}
