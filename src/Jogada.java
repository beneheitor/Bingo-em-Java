import java.util.List;

public class Jogada {

    Sorteio sorte = new Sorteio();

    private int numerosDisponiveis;
    private int turno;

    public Jogada() {
        this.numerosDisponiveis = geraNumerosDisponiveis(sorte.getFila());
        this.turno = geraTurno(sorte.getSorteados());
    }

    private int geraNumerosDisponiveis(List<Integer> fila) {
        numerosDisponiveis = fila.size();// this: Chama a varial de fora para ser utilizada dentro de algum lugar
        return numerosDisponiveis;
    }

    private int geraTurno(List<Integer> sorteados) {
        turno = sorteados.size();
        return turno;
    }

    public int getTurno() {
        return this.turno;
    }

    /// PRINTS PARA VER SE OS CODIGOS ESTÃO COLETANDO OS DADOS CORRETAMENTE ///

    public void imprimirTurno() {
        System.out.println("Turno: " + this.turno);
    }
}

