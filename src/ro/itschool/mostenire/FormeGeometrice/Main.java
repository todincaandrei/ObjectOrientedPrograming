package ro.itschool.mostenire.FormeGeometrice;

import ro.itschool.mostenire.FormeGeometrice.Cerc;
import ro.itschool.mostenire.FormeGeometrice.FormaGeometrica;
import ro.itschool.mostenire.FormeGeometrice.Line;

public class Main {
    public static void main(String[] args) {
//        FormaGeometrica[] forme = new FormaGeometrica[4];
//        FormaGeometrica forma = new FormaGeometrica();
//        forme[0] = forma;
//
        Line linie = new Line(1, 2, "Black");
        linie.setEndX(2);
        linie.setEndY(2);

//        FormaGeometrica formaGeometrica = new Line(1,1, "Black"); //polimorfism forma geometrica nu poatea accesa parametrii liniei.
//
//        Line line2 = (Line) formaGeometrica;
//        line2.setEndY(2);

        Cerc cerc = new Cerc(1, 1, "Black");
        cerc.setRaza(3);

        FormaGeometrica[] forme = new FormaGeometrica[2];

        forme[0] = linie;
        forme[1] = cerc;
        for (int i = 0; i < forme.length; i++) {
            FormaGeometrica forma =  forme[i];
            if (forma instanceof Cerc){
                Cerc cercForma = (Cerc) forma;
                System.out.println("Cercul cu punctul de inceput  start: " + forma.getStartX()+" " + forma.getStartY()+" Color " + forma.getColor() + " Raza: " + cercForma.getRaza());

            }
            if (forma instanceof Line){
                Line lineForm = (Line) forma;
                System.out.println("Linie cu: " + lineForm.getStartX() );
            }
        }

    }
}
