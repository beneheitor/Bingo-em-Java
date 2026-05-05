import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Agora, ao instanciar, a cartela já é gerada perfeitamente
        Cartela cartelaJogador1 = new Cartela();
        Cartela cartelaJogador2 = new Cartela();

        Sorteio sorte = new Sorteio();
        Validador validador = new Validador();

        do {
        System.out.println("--- CARTELAS INICIAIS ---");
        cartelaJogador1.imprimirCartela();
        System.out.println("");
        cartelaJogador2.imprimirCartela();

        System.out.println("\n--- SORTEANDO UM NÚMERO ---");
        sorte.gerarNumeroSorteado();
        System.out.println("Número Sorteado: " + sorte.getNumeroSorteado());

        // Marca o número nas cartelas se ele existir
        sorte.alterarCartela(cartelaJogador1.getCartela());
        sorte.alterarCartela(cartelaJogador2.getCartela());

        sorte.imprimirSorteios();
        } while (validador.verificarCartela(cartelaJogador1.getCartela()) == 0 && validador.verificarCartela(cartelaJogador2.getCartela()) == 0);
    }
}