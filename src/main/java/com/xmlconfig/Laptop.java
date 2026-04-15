package com.xmlconfig;

public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Creating "+this.getClass().getSimpleName());
    }
    @Override
    public void compile(){
        System.out.println("Compiling "+this.getClass().getSimpleName());
    }
}
