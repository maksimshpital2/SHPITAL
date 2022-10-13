package ru.mirea.lab4.t4;

import java.util.ArrayList;
import java.util.List;

public class ComputerRunner {
    public ComputerRunner() {
    }

    public static void main(String[] args) {
        List<Ram> ramList = new ArrayList();
        ramList.add(new Ram(2));
        ramList.add(new Ram(2));
        List<HardDisc> hardDiscList = new ArrayList();
        hardDiscList.add(new HardDisc(500));
        hardDiscList.add(new HardDisc(1000));
        new Computer(new Processor(), ramList, hardDiscList);
    }
}