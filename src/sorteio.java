import java.util.Random;

public class Sorteio {
    public static void sorteio() {
        int jogada;
        Random random = new Random();
        int[] num = new int[75];

        for (int linha = 0; linha < num.length; linha++) {
            num[linha] = random.nextInt(1, 76);
        }
    }
}