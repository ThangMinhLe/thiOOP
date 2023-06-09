package de1;

public class fireMonter extends monter {
     
    public fireMonter() {

    }

    public fireMonter (String name) {
        super(name);
    }

    public String getName () {
        return super.getName();
    }

    public String setName(String name) {
        return super.setName(name);
    }

    @Override
    public String attack() {

        return "Fire Monter Attack!!";
    }


    
}
