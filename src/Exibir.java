public class Exibir {
    public static void inicio() {
        System.out.println("##########################");
        System.out.println("## Bem vindo ao Jokenpo ##");
        System.out.println("##########################");
    }

    public static void opcao() {
        System.out.println("Digite uma opção e aperte \"Enter\":");
        System.out.println("(1) - Pedra");
        System.out.println("(2) - Papel");
        System.out.println("(3) - Tesoura");
    }

    public static void continuar() {
        System.out.println("Quer continuar?");
        System.out.println("(1) - Sim");
        System.out.println("(2) - Não");
    }

    public static void placar(String resultado, int pontosUsuario, int pontosComputador) {
        System.out.println(resultado);
        System.out.printf("\nPlacar: Usuario %d x %d Computador\n", pontosUsuario, pontosComputador);
        System.out.println();
    }

    public static void escolhaDoComputador(String pcEscolheu) {
        System.out.printf("O computador escolheu %s\n", pcEscolheu);
        switch (pcEscolheu) {
            case "PEDRA" -> System.out.println(
                    "    _______\n" +
                            "---'   ____)\n" +
                            "      (_____)\n" +
                            "      (_____)\n" +
                            "      (____)\n" +
                            "---.__(___)");
            case "PAPEL" -> System.out.println(
                    "     _______\n" +
                            "---'    ____)____\n" +
                            "           ______)\n" +
                            "          _______)\n" +
                            "         _______)\n" +
                            "---.__________)");
            case "TESOURA" -> System.out.println(
                    "    _______\n" +
                            "---'   ____)____\n" +
                            "          ______)\n" +
                            "       __________)\n" +
                            "      (____)\n" +
                            "---.__(___)");
        }
    }
}
