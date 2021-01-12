package com.codecool.interfaceWS;

public interface Speaking {
    public default void speak(String say){
        System.out.println(say);
    }
}
