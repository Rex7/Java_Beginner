/*

 *     Rex
 */
package JavaBasic.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Regis
 */
class Checker implements Comparator<Player> {

    @Override
    public int compare(Player player1, Player player2) {
        if (player1.score < player2.score) {
            return 1;
        } else if (player1.score == player2.score) {
            return player1.name.compareTo(player2.name);
        }
        return -1;
    }

}

class Player {

    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class ComparatorDemo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for (int i = 0; i < n; i++) {
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for (Player player1 : player) {
            System.out.printf("%s %s\n", player1.name, player1.score);
        }
    }
}
