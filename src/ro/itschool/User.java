package ro.itschool;

public class User {

    public String nume;
    public String prenume;

    public int varsta ;


    public User(String numeDat, String prenumeDat, int varstaData) {
        numeDat = nume;
        prenumeDat = prenume;
        varstaData = varsta;

    }

    public User(String numeDat, String prenumeDat) {
        nume = numeDat;
        prenume = prenumeDat;
        varsta = 1;
    }


    public User(){
        varsta = 1;
        nume = "NO NAME";
        prenume = "NO NAME";

    }
}
