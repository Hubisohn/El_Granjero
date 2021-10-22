package com.manu;

import com.manu.BauerStuff.Bauer;
import com.manu.Bäume.Apfelbaum;
import com.manu.Bäume.Birnenbaum;
import com.manu.Bäume.Nadelbaum;

public class Main {

    public static void main(String[] args) {

        Bauer bauer = new Bauer();

        Apfelbaum aa = new Apfelbaum(1, "Baum", 3);
        Apfelbaum ab = new Apfelbaum(1, "Baum", 3);
        Apfelbaum ac = new Apfelbaum(1, "Baum", 3);

        Birnenbaum ba = new Birnenbaum(1, "Baum", 3);
        Birnenbaum bb = new Birnenbaum(1, "Baum", 3);
        Birnenbaum bc = new Birnenbaum(1, "Baum", 3);
        Birnenbaum bd = new Birnenbaum(1, "Baum", 3);
        Birnenbaum be = new Birnenbaum(1, "Baum", 3);

        Nadelbaum na = new Nadelbaum(1, "Baum", 1);


        ac.Info();
        be.Info();

        aa.Info();
        ba.Info();


        bauer.bauer_hittree(na.fallen());

        aa.Gießen();
        aa.Gießen();
        aa.Gießen();
        aa.Gießen();
        ab.Gießen();
        ab.Gießen();
        ab.Gießen();
        ab.Gießen();
        ab.Gießen();
        ab.Gießen();

        bauer.bauer_pflück(aa.dropObst());
        bauer.bauer_pflück(aa.dropObst());
        bauer.bauer_pflück(aa.dropObst());
        bauer.bauer_pflück(ab.dropObst());
        bauer.bauer_pflück(ab.dropObst());
        bauer.bauer_pflück(ab.dropObst());
        bauer.bauer_inHandInfo();

    }
}
