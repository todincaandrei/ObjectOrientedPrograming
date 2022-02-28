package ro.itschool.animal;

public class Animal {
     private String nume;
     private  int varsta;
     private String culoare;


     public Animal(String nume, String culoare){
         this.nume = nume;
         this.culoare=culoare;
         this.varsta = 1;
     }

     public void toarce(){
         System.out.println("toarce");
     }





}
