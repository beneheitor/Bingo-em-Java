import java.util.*;

public class Sorteio {
    private int numeroSorteado;
    private List<Integer> fila = new ArrayList<>();
    private List<Integer> sorteados = new ArrayList<>();

    public Sorteio() {
        this.fila = gerarFila();
        this.numeroSorteado = gerarNumeroSorteado();
        this.sorteados = gerarListaSorteados();
    }

    private List<Integer> gerarFila() {
        List<Integer> nums = new ArrayList<>();

        /*
        List: Array flexivel que cresce e diminui dependendo da necessidade
        Integer: Significa um objeto inteiro
         */
        for (int cont = 1; cont <= 75; cont++) {
            nums.add(cont); //Adiciona os numeros de 1 a 75 a lista
        }
        Collections.shuffle(nums);//Desorganiza a lista (embaralha)
        return nums;
    }

    private int gerarNumeroSorteado() {
        if (this.fila.isEmpty()) {
            System.out.println("Todos os números já foram sorteados!");
            return -1;
        }

        this.numeroSorteado = this.fila.remove(0);

        this.sorteados.add(this.numeroSorteado);

        return this.numeroSorteado;
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
