import java.util.Random; //Importando o gerador de números aleatórios

public class Main {
    public static void main(String[] args) {
        String cartela[][] = new String[5][5];
        Random random = new Random();
        String numero = String.valueOf(random.nextInt(75) + 1);

        for (int linha = 0; linha < cartela.length; linha++) {
            cartela[linha][0] = String.valueOf(random.nextInt(1, 15));
            cartela[linha][1] = String.valueOf(random.nextInt(16, 30));
            cartela[linha][2] = String.valueOf(random.nextInt(31, 45));
            cartela[linha][3] = String.valueOf(random.nextInt(46, 60));
            cartela[linha][4] = String.valueOf(random.nextInt(61, 75));
            cartela[2][2] = "#";

        }








        System.out.println("|========================|");
        System.out.println("|| B    I    N    G   O ||");
        System.out.println("|========================|");


        System.out.println("\n O número sorteado é: " + numero);



        for(int li = 0; li < cartela.length; li++) {
            for (int coluna = 0; coluna < cartela.length; coluna++) {
                // O \t serve para dar um espaço de "Tabulação"
                // para manter as colunas alinhada na tela
                System.out.print(cartela[li][coluna] + "\t");
                //Pula para a próxima linha da cartela

            }
            System.out.println();
        }
        System.out.println("***************************"); }
}
