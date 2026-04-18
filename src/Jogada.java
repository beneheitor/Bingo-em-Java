import java.util.List;

public class Jogada {
    int numerosDisponiveis;
    int turnoAtual = 0;

    public int gerarTurno(List<Integer> nums) {
        this.numerosDisponiveis = nums.size(); // this: Chama a varial de fora para ser utilizada dentro de algum lugar

        return numerosDisponiveis;
    }
}

