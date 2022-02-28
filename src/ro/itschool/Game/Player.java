package ro.itschool.Game;

public class Player {

    private int life;
    private int power;

    public Player() {
        this.life = 100;
        this.power = 30;
    }

    public int getLife() {
        return life;
    }

    public int getPower() {
        return power;
    }

    public void healYourself() {

        if (life <= 92){
            life = life + 8;
        }
    }

    public void attack(Player enemy) {
        enemy.life = enemy.life - power;


    }
}
