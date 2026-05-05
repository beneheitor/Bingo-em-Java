import java.util.List;

public class Jogada {

    private int turno;

    public Jogada() {
        this.turno = 0;
    }

    public void geraNumerosDisponiveis(List<Integer> fila) {
        int numerosDisponiveis = fila.size();
    }

    public void geraTurno(List<Integer> sorteio) {
        this.turno = sorteio.size();
    }

    public int getTurno() {
        return turno;
    }

    /// PRINTS PARA VER SE OS CODIGOS ESTÃO COLETANDO OS DADOS CORRETAMENTE ///

    public void imprimirTurno() {
        System.out.println("Turno: " + getTurno());
    }
}

