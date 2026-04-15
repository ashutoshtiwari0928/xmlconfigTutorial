package com.xmlconfig;

public class Alien {
    private int age;
    private Computer computer;
    private Computer computer2;

    public Alien(int age, Computer computer) {
        this.age = age;
        this.computer = computer;
    }

    public void code(){
        System.out.println("Hello World! by alien");
        computer.compile();
        computer2.compile();
    }
    public Alien(){
        System.out.println("Creating "+this.getClass().getSimpleName());
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        System.out.println("Setting computer "+computer.getClass().getSimpleName());
        this.computer = computer;
    }

    public Computer getComputer2() {
        return computer2;
    }

    public void setComputer2(Computer computer2) {
        this.computer2 = computer2;
    }
}
