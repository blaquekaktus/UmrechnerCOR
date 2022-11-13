package org.example.Chain_Of_Responsibility;
import org.example.Waehrung;

public abstract class WaehrungsUmrechner implements IUmrechnen {

    private double factor;

    public void setFactor(double factor) {
        this.factor = factor;
    }
    @Override
    public double getFactor() {
        return factor;
    }



    protected WaehrungsUmrechner naechsteUmrechner;

    public WaehrungsUmrechner(WaehrungsUmrechner naechsteUmrechner) {
        this.naechsteUmrechner = naechsteUmrechner;
    }


    @Override
    public void umrechnen(String variante, double betrag) {


        if (this.naechsteUmrechner != null) {
            naechsteUmrechner.umrechnen(variante, betrag);
        }
    }
}

