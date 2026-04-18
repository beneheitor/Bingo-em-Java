import java.util.*;

public class Sorteio {
    public static List<Integer> gerarSorteio() {
        List<Integer> nums = new ArrayList<>();
        /*
        List: Array flexivel que cresce e diminui dependendo da necessidade
        Integer: Significa um objeto inteiro
         */
        for (int cont = 1; cont <= 75; cont++) {
            nums.add(cont); //Adiciona os numeros de 1 a 75 a lista
        }
        Collections.shuffle(nums); //Desorganiza a lista (embaralha)
        return nums;
    }
}
