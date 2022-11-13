package org.example.Chain_Of_Responsibility;

public class Y2EUmrechner extends WaehrungsUmrechner{

    private final double FACTOR = 0.0069;


    public Y2EUmrechner(WaehrungsUmrechner naechsteUmrechner) {
        super(naechsteUmrechner);
    }


    @Override
        public boolean zustaendig(String variante) {
            if (variante.equals("YEN2EUR")){
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
                System.out.println("\nYEN in EURO umrechnen:");
                System.out.println("€" + betrag + " = " + "¥" + umrechnung);
            }else if (this.naechsteUmrechner != null) {
                naechsteUmrechner.umrechnen(variante, betrag);
            }else{
                System.out.println("Wir können dieses Umrechnung leider nicht durchführung\n");
            }

        }




}


