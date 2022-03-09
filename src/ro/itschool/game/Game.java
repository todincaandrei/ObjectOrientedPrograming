package ro.itschool.game;

import java.util.Scanner;

public class Game {

    private Player player1;
    private Player player2;

    public void startGame() {
        this.player1 = new Player();
        this.player2 = new Player();
        Scanner sc = new Scanner(System.in);


        do {
            // player 1 menu
            System.out.println("Player 1:");
            System.out.println("1.Attack");
            System.out.println("2.Heal");
            int option = sc.nextInt();
            sc.nextLine();
            if (option == 1) {
                this.player1.attack(player2);

            } else if (option == 2) {
                this.player1.healYourself();
            }

            // player 2 menu
            System.out.println("Player 2:");
            System.out.println("1.Attack");
            System.out.println("2.Heal");
            int option2 = sc.nextInt();
            sc.nextLine();
            if (option2 == 1) {
                this.player2.attack(player1);

            } else if (option2 == 2) {
                this.player2.healYourself();
            }

            System.out.println("Player 1: " + player1.getLife());
            System.out.println("Player 2: " + player2.getLife());



        } while (player1.getLife() > 0 || player2.getLife() > 0);
    }


}
//    Vrem un Joc care contine 2 Playeri Player1 si Player2, Fiecare player are viata 100 by default si putere de atack 30;
//        Jocul are metodata prin care porneste jocul , pornirea jocului presupune sa ii afisam utilizatorului un meniu, cu optiunea:
//
//        1.Ataca
//        2.Vindeca-te.
//
//        Jocul va repeta aceste optiuni atat player 1 cat si pentru player 2 pana cand unul din player va avea viata 0..
//        videca-rea presupune ca viata sa se mareasca cu 8 unitati de viata
//
//        Player1 :
//        1.Ataca
//        2.Vindeca-te.
//
//        Player2
//        1.Ataca
//        2.Vindeca-te.