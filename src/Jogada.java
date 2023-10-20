import java.util.Random;
import java.util.Scanner;

public class Jogada {
    public static int pontosUsuario = 0;
    public static int pontosComputador = 0;

    static Scanner sc = new Scanner(System.in);

    public static String jogarJokenpo() {
        String resultado = "";
        int escolhaUsuario = sc.nextInt();
        int escolhaComputador = new Random().nextInt(2) + 1;
        String pcEscolheu = "";

        switch (escolhaComputador) {
            case 1 -> pcEscolheu = "PEDRA";
            case 2 -> pcEscolheu = "PAPEL";
            case 3 -> pcEscolheu = "TESOURA";
        }
        Exibir.escolhaDoComputador(pcEscolheu);

        if (escolhaUsuario == escolhaComputador) {
            resultado = "Empate!";
        } else {
            switch (escolhaUsuario) {
                case JokenpoGame.PEDRA ->
                    resultado = (escolhaComputador == JokenpoGame.TESOURA) ? "Parabens! Você Ganhou!"
                            : "Que pena, você perdeu!";
                case JokenpoGame.PAPEL ->
                    resultado = (escolhaComputador == JokenpoGame.PEDRA) ? "Parabens! Você Ganhou!"
                            : "Que pena, você perdeu!";
                case JokenpoGame.TESOURA ->
                    resultado = (escolhaComputador == JokenpoGame.PAPEL) ? "Parabens! Você Ganhou!"
                            : "Que pena, você perdeu!";
                default -> resultado = "Escolha inválida";
            }
            ;
            if (resultado.equals("Parabens! Você Ganhou!")) {
                pontosUsuario++;
            } else if (resultado.equals("Que pena, você perdeu!")) {
                pontosComputador++;
            }
        }
        return resultado;
    }

    public static Boolean querContinuar() {
        Boolean continuar = true;
        int escolha = 0;

        while (continuar) {
            Exibir.continuar();
            escolha = sc.nextInt();
            switch (escolha) {
                case 1 -> continuar = true;
                case 2 -> continuar = false;
                default -> {
                    System.out.println("Opção inválida!\n");
                    continue;
                }
            }
            break;
        }
        return continuar;
    }
}
