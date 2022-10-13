package Task5;

class Dachshund extends Dog {
    private int PowerScent;

    public Dachshund(String name, String CoatColor, int Year, int PowerScent) {
        this.Name = name;
        this.CoatColor = CoatColor;
        this.Year = Year;
        this.PowerScent = PowerScent;
    }

    public void WhatItIsADod() {
        System.out.println(this.Name + "\t" + this.CoatColor + "\t" + this.Year + "\t Обоняние:" + this.PowerScent);
    }
}
