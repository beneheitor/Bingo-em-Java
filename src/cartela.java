import java.util.Random;

public class Cartela {
    public static int[][] gerarCartela() {
        int[][] cartela = new int[5][5];
        Random random = new Random();
        int temp = 0;

        for (int linha = 0; linha < cartela.length; linha++) { // Gerador da matriz de bingo
            for (int coluna = 0; coluna < cartela[linha].length; coluna++) {
                cartela[linha][coluna] = random.nextInt(1 + coluna * 15, 16 + coluna * 15);
            }
        }

        for (int coluna = 0; coluna < cartela.length; coluna++) { // Eliminador de números repetidos
            for (int linha = 0; linha < cartela.length; linha++) {
                for (int linha2 = linha + 1; linha2 < cartela.length; linha2++) {
                    if (cartela[linha][coluna] == cartela[linha2][coluna]) {
                        do {
                            cartela[linha2][coluna] = random.nextInt(1 + coluna * 15, 16 + coluna * 15);
                        } while (cartela[linha][coluna] == cartela[linha2][coluna]);
                    }
                }
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

    public static void imprimirCartela(int[][] cartela) {

        System.out.println("""
                |==================================|
                ||B     I       N       G       O ||
                |==================================|""");

        for (int linha = 0; linha < cartela.length; linha++) {
            for (int coluna = 0; coluna < cartela.length; coluna++) {
                // O \t serve para dar um espaço de "Tabulação"
                // para manter as colunas alinhada na tela
                System.out.print(cartela[linha][coluna] + "\t\t");
                //Pula para a próxima linha da cartela
            }
            System.out.println();
        }
        System.out.println("************************************");
    }
}

