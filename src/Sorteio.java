import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;

public class Sorteio {
    public static List<Integer> gerarSorteio() {
        Random random = new Random();
        List<Integer> nums = new ArrayList<>();
        ArrayList <Integer> removidos = new ArrayList<>();
        /*
        List: Array flexivel que cresce e diminui dependendo da necessidade
        Integer: Significa um objeto inteiro
         */
        for (int cont = 1; cont <= 75; cont++) {
            nums.add(cont); //Adiciona os numeros de 1 a 75 a lista
        }
        Collections.shuffle(nums);//Desorganiza a lista (embaralha)
        int numeroSorteado = nums.get(random.nextInt(1,75));
        removidos.add(numeroSorteado);
        if (nums.contains(numeroSorteado)){
           nums.remove(numeroSorteado);
        }
        System.out.println("O numero sorteado é: " + numeroSorteado);
        System.out.println("O removido foi: " + removidos);
        return nums;
    }
}
