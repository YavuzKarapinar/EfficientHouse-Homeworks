package homework07;
public class Gambler {
    public static void main(String[] args) {
        Game.run();
    }
}

class Game {
    public static void checkingIfs(Player p1, Player p2) {
        int dice;

        if (p1.score - p2.score <= 6) {
            dice = p2.roll();
            System.out.println(p2.name + " " + dice + " att�.");
        }
    }

    public static void gameManager(Player p1, Player p2) {
        int dice;

        while (p1.score <= 15 && p2.score <= 15) {
            dice = p1.roll();
            System.out.println(p1.name + " " + dice + " att�.");
            dice = p2.roll();
            System.out.println(p2.name + " " + dice + " att�.");

            if (p1.score >= 15) {
                checkingIfs(p1, p2);
                break;
            }
            if (p2.score >= 15) {
                checkingIfs(p2, p1);
                break;
            }
        }
    }

    public static void run() {
        java.util.Random r = new java.util.Random();
        boolean gameBeginer = r.nextBoolean();

        Player p1 = new Player();
        p1.name = "Berkay";
        Player p2 = new Player();
        p2.name = "Yavuz";

        System.out.println("Zar oyununa ho�geldiniz.");

        if (gameBeginer) {
            System.out.println("Yaz� geldi. Ev sahibi oyuncu oyuna ba�l�yor.");
            gameManager(p1, p2);

        } else {
            System.out.println("Tura geldi. Misafir oyuncu oyuna ba�l�yor.");
            System.out.println();
            gameManager(p2, p1);
        }
        System.out.println("Berkay oyuncusunun toplam puan� : " + p1.score);
        System.out.println("Yavuz oyuncusunun toplam puan� : " + p2.score);
    }
}

class Player {
    public int score;
    public String name;

    public int roll() {
        java.util.Random random = new java.util.Random();
        int dice = random.nextInt(6) + 1;

        if (dice == 1)
            score = 0;
        else
            score += dice;
        return dice;
    }
}