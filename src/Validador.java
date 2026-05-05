public class Validador {
    
    public int verificarCartela(int[][] cartela) {
        int wincond = 0;
        for (int coluna = 0; coluna < cartela[0].length; coluna++) {
            for (int linha = 0; linha < cartela.length; linha++) {
                if (cartela[linha][coluna] == 0) {
                    wincond += 1;
                }
            }
            if (wincond < 5) {
                wincond = 0;
            }
        }
        if (wincond == 5) {
            return 1;
        } else {
            return 0;
        }
    }
}
