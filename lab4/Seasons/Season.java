package ru.mirea.lab4.Seasons;

public enum Season {
    WINTER(-14), SPRING(55), SUMMER(28){
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(10);

    private double avgTmp;

    Season(double avgTmp){
        this.avgTmp = avgTmp;
    }

    public double getAvgTmp() {
        return avgTmp;
    }

    public String getDescription() {
        return "Холодное время года";

    }

}
