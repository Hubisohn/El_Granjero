package com.manu.Bäume;

import com.manu.Obst.Obst;

import java.util.ArrayList;

public abstract class Obstbaum extends Baum{

    int max_poss;
    ArrayList<Obst> obstAmBaum = new ArrayList<Obst>();

    public Obstbaum(int age, String gattung, int max_poss) {
        super(age, gattung);
        this.max_poss = max_poss;
    }

    public Obst dropObst(){
        if(obstAmBaum.size() > 0){
            Obst geerntet = obstAmBaum.get(0);

            System.out.println("Der Bauer hat einen " + geerntet.getType() + " aufgehoben!");

            obstAmBaum.remove(0);
            return geerntet;
        }else{
            System.out.println("Der " + this.gattung + " hat keine Früchte auf dem Baum!");
            return null;
        }
    }


}
