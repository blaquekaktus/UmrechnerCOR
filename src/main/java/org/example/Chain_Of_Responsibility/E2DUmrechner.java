package org.example.Chain_Of_Responsibility;

public class E2DUmrechner extends WaehrungsUmrechner{

    private final double FACTOR = 1.04;


    public E2DUmrechner(WaehrungsUmrechner naechsteUmrechner) {
        super(naechsteUmrechner);
    }


    @Override
    public boolean zustaendig(String variante) {
        if (variante.equals("EUR2DOL")){
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
            System.out.println("\nEURO in DOLLAR Umrechnen:");
            System.out.println("€" + betrag + " = " + "¥" + umrechnung);
        }else if (this.naechsteUmrechner != null) {
            naechsteUmrechner.umrechnen(variante, betrag);
        }else{
            System.out.println("Wir können dieses Umrechnung leider nicht durchführung!\n");
        }

    }
}
