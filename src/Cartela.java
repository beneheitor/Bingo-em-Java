import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Cartela {

    private int[][] cartela;

    public Cartela() {
        this.cartela = gerarCartela();
    }

    private int[][] gerarCartela() {
        int[][] cartela = new int[5][5];
        Random random = new Random();
        int temp = 0;

        for (int coluna = 0; coluna < cartela.length; coluna++) { //Gerador da cartela (sem números repetidos)
            List<Integer> numerosPossiveis = new ArrayList<>();
            int numero_min = 1 + (coluna * 15);
            int numero_max = 15 + (coluna * 15);

            for (int x = numero_min; x <= numero_max; x++) {
                numerosPossiveis.add(x);
            }
            Collections.shuffle(numerosPossiveis);
            for (int linha = 0; linha < cartela.length; linha++) {
                cartela[linha][coluna] = numerosPossiveis.get(linha);
            }
        }

        for (int coluna = 0; coluna < cartela[0].length; coluna++) { //Bubble sort para controle da ordem dos números
            for (int bubble = 0; bubble < cartela.length - 1; bubble++) {
                for (int linha = 0; linha < cartela.length - 1 - bubble; linha++) {
                    if (cartela[linha + 1][coluna] < cartela[linha][coluna]) {
                        temp = cartela[linha][coluna];
                        cartela[linha][coluna] = cartela[linha + 1][coluna];
                        cartela[linha + 1][coluna] = temp;
                    }
                }
            }
        }

        cartela[2][2] = 0;
        return cartela;
    }

    public int[][] getCartela() {
        return cartela;
    }

    public void imprimirCartela() {

        System.out.println("""
                \n|==================================|
                ||B     I       N       G       O ||
                |==================================|""");

        for (int linha = 0; linha < cartela.length; linha++) {
            for (int coluna = 0; coluna < cartela[linha].length; coluna++) {
                // O \t serve para dar um espaço de "Tabulação"
                // para manter as colunas alinhada na tela
                System.out.print(cartela[linha][coluna] + "\t\t");
                //Pula para a próxima linha da cartela
            }
            System.out.println();
        }
        System.out.println("************************************\n");
    }
}

