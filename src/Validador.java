public class Validador {
    
    public int verificarCartela(int[][] cartela) {
        int wincond = 0;
        for (int coluna = 0; coluna < cartela[0].length; coluna++) { //Verificador de coluna
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
        }

        wincond = 0;

        for (int linha = 0; linha < cartela.length; linha++) { //Verificador de linha
            for (int coluna = 0; coluna < cartela[linha].length; coluna++) {
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
        }

        for (int diagonal1 = 0; diagonal1 < cartela.length; diagonal1++) { //Verificador da diagonal principal
            if (cartela[diagonal1][diagonal1] == 0){
                wincond += 1;
            }
        }
        if (wincond == 5) {
            return 1;
        }
        for (int cont = 4; cont <= 0; cont--) { //Verificador da diagonal secundária
            if (cartela[4 - cont][cont] == 0){
                wincond += 1;
            }
        }
        if (wincond == 5) {
            return 1;
        }
        return 0;
    }
}

