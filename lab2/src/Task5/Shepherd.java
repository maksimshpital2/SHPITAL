package Task5;

class Shepherd extends Dog {
    private int SoundVolume;

    public Shepherd(String name, String CoatColor, int Year, int SoundVolume) {
        this.Name = name;
        this.CoatColor = CoatColor;
        this.Year = Year;
        this.SoundVolume = SoundVolume;
    }

    public void WhatItIsADod() {
        System.out.println(this.Name + "\t" + this.CoatColor + "\t" + this.Year + "\t Громкость лая:" + this.SoundVolume);
    }
}