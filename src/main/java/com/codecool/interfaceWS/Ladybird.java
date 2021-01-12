package com.codecool.interfaceWS;

public class Ladybird implements Flying, Feeding, Speaking {
    private String name;
    private Boolean isFemale;

    public Ladybird(String name, Boolean isFemale){
        this.name=name;
        this.isFemale=isFemale;
    }

    @Override


    public void fly(){
        speak( "Buzz, Buzz");
    }

    public void feed(){
       speak( "I love aphid");
    }


}
