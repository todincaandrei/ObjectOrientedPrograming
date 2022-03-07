package ro.itschool.mostenire.zoo;

public class Animal {
    private String name;
    private int varsta;
    private String specie;


    public Animal(String name, int varsta, String specie) {
        this.name = name;
        this.varsta = varsta;
        this.specie = specie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public void mananca(){
        System.out.println(this.name + "mananca");
    }
}
