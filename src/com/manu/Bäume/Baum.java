package com.manu.Bäume;

public abstract class Baum {

    int age;
    String gattung;

    public Baum(int age, String gattung){
        this.age = age;
        this.gattung = gattung;
    }

    public abstract void Info();

    public abstract void Gießen();

}
