package org.example.Chain_Of_Responsibility;

public interface IUmrechnen {
    void umrechnen (String variante, double betrag);
    double getFactor();
    boolean zustaendig(String variante);


}
