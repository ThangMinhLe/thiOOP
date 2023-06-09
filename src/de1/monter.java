package de1;

public class monter {
    private String name;

    public monter() {

    }

    public monter(String name) {
        this.name = name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public String getName () {
        return name;
    }

    public void show(){
        System.out.printf("%10s",this.getName());
    }

    public String attack(){
        return "Monter Attack!!";
    }

}
