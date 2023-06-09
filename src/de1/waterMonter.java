package de1;

public class waterMonter extends monter {
        
    public waterMonter() {

    }

    public waterMonter(String name) {
        super(name);
    }

    public String setName(String name) {
        return super.setName(name);
    }

    public String getName () {
        return super.getName();
    }

    public String attack() {
        return "Water attack!!";
    }

}
