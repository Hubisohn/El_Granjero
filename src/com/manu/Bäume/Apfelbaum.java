package com.manu.Bäume;

import com.manu.Obst.Apfel;

public class Apfelbaum extends Obstbaum{

    static int counter = 0;

    public Apfelbaum(int age, String gattung, int max_poss) {
        super(age, gattung, max_poss);
        counter += 1;
    }

    @Override
    public void Info() {
        System.out.println("Es gibt " + counter + " Birnenbäume!. Der ausgewählte Apfelbaum hat " + obstAmBaum.size() + " Fürchte!");
    }

    @Override
    public void Gießen() {
        if(obstAmBaum.size() != max_poss) {
            obstAmBaum.add(new Apfel("Apfel"));
            System.out.println("Der Apfelbaum wurde gegossen!");
        }else{
            System.out.println("Der Baum ist voller Fürchte. Pflücke doch erst eine damit du mehr Gewinn machst!");
        }
    }

}
