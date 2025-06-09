package org.scoula.beans;

public class Parrot2 {
    private String name = "Kodo";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Parrot: "+ name;
    }
}
