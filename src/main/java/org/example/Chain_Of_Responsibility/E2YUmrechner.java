package org.example.Chain_Of_Responsibility;

public class E2YUmrechner extends WaehrungsUmrechner{

    private final double FACTOR = 143.68;


    public E2YUmrechner(WaehrungsUmrechner naechsteUmrechner) {
        super(naechsteUmrechner);
    }


    @Override
    public boolean zustaendig(String variante) {
        if (variante.equals("EUR2YEN")){
           return true;
        }
        else
        {
            return false;
        }
    }


    public void umrechnen(String variante, double betrag) {
        if (zustaendig(variante)) {
            double umrechnung = FACTOR * betrag;
            System.out.println("\nEURO in YEN umrechnen:");
            System.out.println("€" + betrag + " = " + "¥" + umrechnung);
        }else if (this.naechsteUmrechner != null) {
                naechsteUmrechner.umrechnen(variante, betrag);
        }else{
            System.out.println("Wir können dieses Umrechnung leider nicht durchführung!\n");
        }

    }




}
