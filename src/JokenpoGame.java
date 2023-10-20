import java.util.Scanner;

public class JokenpoGame {
    public static final int PEDRA = 1;
    public static final int PAPEL = 2;
    public static final int TESOURA = 3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resultado = "";
        boolean continuar = true;
        Exibir.inicio();
        do {
            Exibir.opcao();
            resultado = Jogada.jogarJokenpo();
            Exibir.placar(resultado, Jogada.pontosUsuario, Jogada.pontosComputador);
            continuar = Jogada.querContinuar();
        } while (continuar);
        sc.close();
    }
}
