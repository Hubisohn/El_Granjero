package com.manu.Bäume;

import com.manu.BauerStuff.Holz;

import java.sql.SQLOutput;

public class Nadelbaum extends Baum{

    int size;
    static int counter = 0;

    public Nadelbaum(int age, String gattung, int size) {
        super(age, gattung);
        this.size = size;
        counter++;
    }

    @Override
    public void Info() {
        System.out.printf("Es gibt " + counter + " Nadelbäume!");
    }


    @Override
    public void Gießen() {
        size++;
        System.out.printf("Der Nadelbaum wurde gegossen!");
    }

    public Holz fallen(){
        if(counter > 0) {
            System.out.println("Der Bauer hat einen Nadelbaum gefällt. Es gibt nur noch " + counter + " Nadelbäume. +1 Holz");
            return new Holz();
        }else{
            System.out.println("Es gibt keinen Nadelbaum, den der Bauer fällen kann!");
            return null;
        }
    }
}
