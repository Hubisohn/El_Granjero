package com.manu.Bäume;

import com.manu.Obst.Birne;
import com.manu.Obst.Obst;

public class Birnenbaum extends Obstbaum{

    static int counter = 0;

    public Birnenbaum(int age, String gattung, int max_poss) {
        super(age, gattung, max_poss);
        counter += 1;
    }

    @Override
    public void Info() {
        System.out.println("Es gibt " + counter + " Birnenbäume!. Der ausgewählte Birnenbaum hat " + obstAmBaum.size() + " Fürchte!");
    }

    @Override
    public void Gießen() {
        if (obstAmBaum.size() != max_poss) {
            obstAmBaum.add(new Birne("Birne"));
            System.out.println("Der Birnenbaum wurde gegossen!");
        } else {
            System.out.println("Der Baum ist voller Fürchte. Pflücke doch erst eine damit du mehr Gewinn machst!");
        }
    }

/*    @Override
    public Obst dropObst(){
        if(obstAmBaum.size() > 0){
            //System.out.println("Der Bauer hat eine Birne aufgehoben!");
            return new Birne("Birne");
        }else{
            System.out.println("Der Birnenbaum hat keine Früchte auf dem Baum!");
            return null;
        }
    }
*/
}
