package org.example;

import org.example.Chain_Of_Responsibility.E2DUmrechner;
import org.example.Chain_Of_Responsibility.E2YUmrechner;
import org.example.Chain_Of_Responsibility.WaehrungsUmrechner;
import org.example.Chain_Of_Responsibility.Y2EUmrechner;
import org.example.Waehrung;
import java.util.List;
import java.util.ArrayList;




public class Main {
    public static void main(String[] args) {



        List<Waehrung> WaehrungsList =  new ArrayList<>();
        WaehrungsList.add(new Waehrung("EUR2YEN", 122.35));
        WaehrungsList.add(new Waehrung("EUR2DOL", 122.35));
        WaehrungsList.add(new Waehrung("YEN2EUR", 122.35));
        WaehrungsList.add(new Waehrung("YEN2DOL", 122.35));
        WaehrungsList.add(new Waehrung("DOL2YEN", 122.35));
        WaehrungsList.add(new Waehrung("DOL2EUR", 122.35));
        WaehrungsList.add(new Waehrung("EUR2YEN", 200.00));

       WaehrungsUmrechner kette = new E2YUmrechner(new E2DUmrechner(new Y2EUmrechner(null)));
        kette.umrechnen("EUR2YEN", 122.35);
        kette.umrechnen("EUR2DOL", 122.35);
        kette.umrechnen("YEN2EUR", 122.35);
        kette.umrechnen("YEN2DOL", 122.35);
        kette.umrechnen("DOL2YEN", 122.35);
        kette.umrechnen("DOL2EUR", 122.35);
        kette.umrechnen("EUR2YEN", 200.00);

       /*
        double [] betraege = {23.54, 124.56, 365.00, 56.98};
        String [] Umrechnungen  = {"EUR2YEN", "EUR2DOL"};
        */



    }
}