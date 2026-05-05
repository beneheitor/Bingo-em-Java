import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cartela cartelaJogador1 = new Cartela();
        Cartela cartelaJogador2 = new Cartela();

        Sorteio sorte = new Sorteio();
        Validador validador = new Validador();

        do {
        System.out.println("-------- CARTELAS INICIAIS --------");
        cartelaJogador1.imprimirCartela();
        cartelaJogador2.imprimirCartela();

        System.out.println("\n------- SORTEANDO UM NÚMERO -------\n");
        sorte.gerarNumeroSorteado();
        System.out.println("Número Sorteado: " + sorte.getNumeroSorteado());

        // Marca o número nas cartelas se ele existir
        sorte.alterarCartela(cartelaJogador1.getCartela());
        sorte.alterarCartela(cartelaJogador2.getCartela());

        char pare = scanner.next().charAt(0;

        } while (validador.verificarCartela(cartelaJogador1.getCartela()) == 0 && validador.verificarCartela(cartelaJogador2.getCartela()) == 0);

        System.out.println("-------- Números sorteados --------");
        sorte.imprimirSorteios();
        if (validador.verificarCartela(cartelaJogador1.getCartela()) == 0) {
            System.out.println("\n-------- CARTELA VENCEDORA --------");
            cartelaJogador1.imprimirCartela();
        } else {
            System.out.println("\n-------- CARTELA VENCEDORA --------");
            cartelaJogador2.imprimirCartela();
        }

        scanner.close();
    }
}