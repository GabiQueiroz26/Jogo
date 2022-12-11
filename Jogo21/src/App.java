import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {     
    Baralho baralho = new Baralho();
    ArrayList<Cartas> cartas;
    Pessoa jogadorPessoa = new Pessoa();
    Computador jogadorComputador = new Computador();
    int vencedorJogo = 0;

    cartas = baralho.criaBaralho(true);

    jogadorPessoa.pegarCarta(cartas);
    jogadorPessoa.pegarCarta(cartas);

    Scanner sc = new Scanner(System.in);
    
    while (true) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("§                             §");
        System.out.println("§   Bem vindo ao Jogo 21!!    §");
        System.out.println("§                             §");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        System.out.println("Voce recebeu duas cartas do baralho");

        for (int i = 0; i < jogadorPessoa.exibeCartasJogador().size(); i++) {

            System.out.println(jogadorPessoa.exibeCartasJogador().get(i).numero + " de " + jogadorPessoa.exibeCartasJogador().get(i).naipe);
        }

        System.out.println("\nSua pontuação atual é de " + jogadorPessoa.atualizaPontos(jogadorPessoa.getJogador()) + " pontos");

    
        System.out.println("Voce quer (1) continuar ou (2) parar?");
        int d = sc.nextInt();

    
        if (d == 1) {
            
            jogadorPessoa.pegarCarta(cartas);
            System.out.println("\nSua pontuação: " + jogadorPessoa.atualizaPontos(jogadorPessoa.getJogador()));

            if (jogadorPessoa.getPontos() > 21) {
                System.out.println("Estourou. Com o valor de: " + jogadorPessoa.atualizaPontos(jogadorPessoa.getJogador()) + " pontos.");
            }
        }
    
        if (d == 2) {
            break;
        }
    }

    while (jogadorComputador.atualizar(jogadorComputador.getJogador())) {
        jogadorComputador.pegarCarta(cartas);
    }


    vencedorJogo = Vencedor.vencedor(jogadorPessoa.getPontos(), jogadorComputador.getPontos());
         if (vencedorJogo == 0) {
            System.out.println("\nOs dois jogadores estouraram");
        } else if (vencedorJogo == 1) {
            System.out.println("\nVocê venceu :)");
        } else if (vencedorJogo == 2) {
            System.out.println("\nO computador venceu :(");
        } else {
            System.out.println("\nEmpate no jogo!");
        }

    System.out.println("Digite 1 para mostrar as cartas ou 2 para sair.");
    System.out.println();

    int mostrarMaos = sc.nextInt();
    if (mostrarMaos == 1) {
        System.out.println("\t\t   Suas cartas ");
        for (int i = 0; i < jogadorPessoa.exibeCartasJogador().size(); i++) {
            System.out.println(jogadorPessoa.exibeCartasJogador().get(i).numero + " de " + jogadorPessoa.exibeCartasJogador().get(i).naipe);
        }
        System.out.println("Com o total de: " + jogadorPessoa.getPontos() + " pontos.");
        System.out.println("\n\t\tCartas do computador");
        for (int i = 0; i < jogadorComputador.exibeCartasJogador().size(); i++) {
            System.out.println(jogadorComputador.exibeCartasJogador().get(i).naipe + " de " + jogadorComputador.exibeCartasJogador().get(i).numero);
        }
        System.out.println("Com o total de: " + jogadorComputador.getPontos() + " pontos.");
        System.out.println();
    } else {
        sc.close();
    }


        
    }
}
