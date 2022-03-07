package ro.itschool.mostenire.zoo;

public class Maimuta extends Animal {

    private int nrDegete;
    public Maimuta(String name, int varsta, String specie) {
        super(name, varsta, specie);
        this.nrDegete = nrDegete;
    }

    public int getNrDegete() {
        return nrDegete;
    }

    public void setNrDegete(int nrDegete) {
        this.nrDegete = nrDegete;
    }


    public void setCatara(){
        String nume = this.getName();
        System.out.println(nume + " se catara! ");
    }
}
