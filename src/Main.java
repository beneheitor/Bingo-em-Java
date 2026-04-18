import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cartela.gerarCartela(); // Metodo da classe Cartela gerador e tratador da cartela
        Cartela.imprimirCartela(Cartela.gerarCartela()); // Metodo da classe Cartela que imprime a cartela
    }
}