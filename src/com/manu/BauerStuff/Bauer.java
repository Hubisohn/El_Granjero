package com.manu.BauerStuff;

import com.manu.Obst.Obst;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bauer {

    Korb korb;

    Holz woodForTree;
    int canhold;
    ArrayList<Holz> verfugbarHolz = new ArrayList<>();
    ArrayList<Obst> inHandObst = new ArrayList<Obst>();

    public Bauer(){
        canhold = 2;
    }

    public void bauer_pflück(Obst neuesObst){
        if(inHandObst.size() > canhold){
            System.out.println("Der Bauer hat zu viel Obst in der Hand! Bitte lege etwas hin.");
        }else{
            inHandObst.add(neuesObst);
            //System.out.println("Der Bauer hat gerade " + neuesObst.getType() + " aufgehoben!");
        }
    }

    public void bauer_inHandInfo(){
        if(korb != null){
            for (int i = 0; i < inHandObst.size(); i++) {
                System.out.println(inHandObst.get(i).getType());
            }
        }else if(inHandObst.size() == 2) {
            System.out.println("Der Bauer hat gerade eine(n)" + inHandObst.get(0).getType() + " in der linken Hand und eine(n) " + inHandObst.get(1).getType() + " in der rechten Hand!");
        }else if(inHandObst.size() == 1){
            System.out.printf("Der Bauer hat nur eine(n) " + inHandObst.get(0).getType() + " in der linken Hand!");
        }else{
            System.out.println("Der Bauer hat nichts in der Hand!");
        }
    }

    public void bauer_laydown(){
        if(inHandObst.size() > 0){
            System.out.println("Der Bauer hat gerade eine(n) " + inHandObst.get(0).getType() + " nieder gelegt.");
            inHandObst.remove(0);
        }else{
            System.out.println("Der Bauer hat keine früchte in der Hand!");
        }
    }

    public void bauer_hittree(Holz woodForTree){
        verfugbarHolz.add(woodForTree);

        if(verfugbarHolz.size() != 0){
            if(korb == null){
                korb = new Korb();
                System.out.println("Der Bauer kann nun 20 Früchte tragen!");
                canhold = 20;
                verfugbarHolz.remove(0);
            }else{
                System.out.println("Der Bauer hat bereits einen Korb!");
            }
        }

    }

}
