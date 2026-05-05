import java.util.*;

public class Sorteio {

    private int numeroSorteado;
    private List<Integer> fila;
    private List<Integer> sorteados;

    public Sorteio() {
        this.fila = new ArrayList<Integer>();
        this.sorteados = new ArrayList<Integer>();
        gerarFila();
    }

    private void gerarFila() {
        /*
        List: Array flexivel que cresce e diminui dependendo da necessidade
        Integer: Significa um objeto inteiro
         */
        for (int cont = 1; cont <= 75; cont++) {
            this.fila.add(cont); //Adiciona os numeros de 1 a 75 a lista
        }
        Collections.shuffle(this.fila);//Desorganiza a lista (embaralha)
    }

    public void gerarNumeroSorteado() {
        if (!this.fila.isEmpty()) {
            this.numeroSorteado = this.fila.remove(0);
            this.sorteados.add(this.numeroSorteado);
        } else {
            System.out.println("Todos os númerso ja foram sorteados");
        }
    }

    public void alterarCartela(int[][] cartela) {
        for (int linha = 0; linha < cartela.length; linha++) {
            for (int coluna = 0; coluna < cartela[linha].length; coluna++) {
                if (getNumeroSorteado() == cartela[linha][coluna]) {
                    cartela[linha][coluna] = 0;
                }
            }
        }
    }

    public List<Integer> getFila() {
        return this.fila;
    }

    public int getNumeroSorteado() {
        return this.numeroSorteado;
    }

    public List<Integer> getSorteados() {
        return this.sorteados;
    }

    /// PRINTS PARA VER SE OS CODIGOS ESTÃO COLETANDO OS DADOS CORRETAMENTE ///
    ///
    public void imprimirSorteios() {
        System.out.println(this.sorteados);
    }
}
