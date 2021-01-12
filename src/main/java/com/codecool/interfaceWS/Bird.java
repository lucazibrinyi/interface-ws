package com.codecool.interfaceWS;

public class Bird implements Flying, Feeding, Speaking{
    private String name;
    private Boolean isFemale;

    public Bird(String name, Boolean isFemale) {
        this.name = name;
        this.isFemale = isFemale;
    }

    @Override

    public void fly() {
        speak("Csájp, Csájp");
    }



    public void feed(){
        speak("What a wonderful worm");
    }

}
