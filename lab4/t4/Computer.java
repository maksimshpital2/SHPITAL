package ru.mirea.lab4.t4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Computer {
    private Processor processor;
    private List<Ram> ramList = new ArrayList();
    private List<HardDisc> hardDiscsList = new ArrayList();
    private boolean power = false;

    public Computer(Processor processor, List<Ram> ramList, List<HardDisc> hardDiscsList) {
        this.processor = processor;
        this.ramList = ramList;
        this.hardDiscsList = hardDiscsList;
    }

    public void switchOn() {
        this.power = true;
    }

    public void switchOff() {
        this.power = false;
    }

    public String checkVirus() {
        return "Checked";
    }

    public void getSizeHardDisc() {
        int size = 0;

        HardDisc hardDisc;
        for(Iterator var2 = this.hardDiscsList.iterator(); var2.hasNext(); size += hardDisc.getSize()) {
            hardDisc = (HardDisc)var2.next();
        }

        System.out.println(size);
    }
}

