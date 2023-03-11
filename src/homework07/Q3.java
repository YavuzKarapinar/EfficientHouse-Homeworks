package homework07;

public class Q3 {
    public static void main(String[] args) {
        PigGame.run();
    }
}

class PigGame {
    public static boolean turn = true;
    public static void run() {
        algo();
    }

    public static void algo() {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        java.util.Random random = new java.util.Random();
        Human human = new Human();
        PC pc = new PC();
        int wantedScore = 10;

        while (Human.score <= wantedScore || PC.score <= wantedScore) {
            if(turn) {
                System.out.println("---------------------------------------");
                int r = human.roll();
                    if(r == 1) {
                        System.out.println("Your roll is 1, your turn passed to PC!");
                        turn = false;
                    } else {
                        System.out.println("Human Dice is: " + r);
                        System.out.print("Hold: h, Roll: r -> ");
                        char ch = kb.nextLine().charAt(0);

                        if(ch == 'h') {
                            human.hold(r);
                            System.out.println("New score is: " + Human.score);
                            turn = false;
                        } else if(ch == 'r') {
                            System.out.println("Human rolled!");
                            human.roll();
                        } else {
                            System.out.println("Wrong choice!");
                            turn = false;
                        }
                    }
                if(Human.score >= wantedScore)
                    break;
            } else {
                System.out.println("---------------------------------------");
                int r = pc.roll();
                if(r == 1) {
                    System.out.println("PC Dice is: " + r);
                    System.out.println("Your roll is 1, your turn passed to human!");
                    turn = true;
                } else {
                    System.out.println("PC Dice is: " + r);

                    if(random.nextBoolean()) {
                        pc.hold(r);
                        System.out.println("New score is: " + PC.score);
                        turn = true;
                    } else {
                        System.out.println("PC rolled!");
                        pc.roll();
                    }
                }
            }
                if(PC.score >= wantedScore)
                    break;
        }
        System.out.println("Human score: " + Human.score + " PC score:" + PC.score);
    }

}

class Human {
    public static int score;

    public int hold(int r) {
        score += r;

        return score;
    }

    public int roll() {
        java.util.Random r = new java.util.Random();

        return r.nextInt(6) + 1;
    }

}

class PC {
    public static int score;

    public int roll() {
        java.util.Random r = new java.util.Random();
        return r.nextInt(6) + 1;
    }

    public int hold(int r) {
        score += r;
        return r;
    }
}

