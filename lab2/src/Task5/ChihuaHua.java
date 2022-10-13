package Task5;

class ChihuaHua extends Dog {
    private int BeautyWool;

    public ChihuaHua(String name, String CoatColor, int Year, int BeautyWool) {
        this.Name = name;
        this.CoatColor = CoatColor;
        this.Year = Year;
        this.BeautyWool = BeautyWool;
    }

    public void WhatItIsADod() {
        System.out.println(this.Name + "\t" + this.CoatColor + "\t" + this.Year + "\t Красота:" + this.BeautyWool);
    }
}
