package Task5;

public abstract class Dog {
    protected String Name;
    protected String CoatColor;
    protected int Year;

    public Dog() {
    }

    protected void WhatItIsADod() {
        System.out.println(this.Name + "\t" + this.CoatColor + "\t" + this.Year);
    }
}

