package de1;

public class stoneMonter extends monter {

    public stoneMonter () {

    }

    public stoneMonter (String name) {
        super(name);
    }

    public String setName(String name) {
        return super.setName(name);
    }

    public String getName() {
        return super.getName();
    }

    public String attack() {
        return "Stone Monter Attack!!!";
    }


    
}
