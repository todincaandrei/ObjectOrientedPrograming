package ro.itschool.catalog;

import java.util.ArrayList;

public class RubricaAbsenta {

    private Materie materie;

    private ArrayList<Absenta> absenta = new ArrayList<>();

    public Materie getMaterie() {
        return materie;
    }

    public void setMaterie(Materie materie) {
        this.materie = materie;
    }

    public ArrayList<Absenta> getAbsenta() {
        return absenta;
    }

    public void setAbsenta(ArrayList<Absenta> absenta) {
        this.absenta = absenta;
    }

    public void addAbsenta(Absenta absenta1) {
        absenta.add(absenta1);
    }
}
