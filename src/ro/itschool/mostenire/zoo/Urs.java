package ro.itschool.mostenire.zoo;

public class Urs extends Animal{
    public Urs(String name, int varsta, String specie) {
        super(name, varsta, specie);
    }

    public void rage(){
        System.out.println(this.getName() + "face MOR MOR");

    }

    @Override
    public void mananca(){
        System.out.println(this.getName() + " mananca mult");
    }
}
