package ro.itschool.mostenire.zoo;

public class Main {
    public static void main(String[] args) {
        Maimuta maimutaCici = new Maimuta("Cici",24,"Macac");

        maimutaCici.setCatara();

        Urs urs = new Urs("Marinel",24,"Brun");
        urs.rage();


        Animal[] animale = new Animal[2];
        animale[0] = maimutaCici;
        animale[1] = urs;

        for (int i = 0; i < animale.length; i++) {
            animale[i].mananca();
        }
    }
}
