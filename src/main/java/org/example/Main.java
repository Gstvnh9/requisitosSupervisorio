package org.example;

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner entrada = new Scanner(System.in);

        int opcoes = 0;
        int escolhaRampa = 0;
        int statusPrograma = 1;
        int statusComunicacao = 1;
        int pecasProcecadas = 0;
        int pecasAdicionadas = 0;
        int tempoTotal = 0;

        String numeroEscolha = "";
        String escolhaPrograma = "";
        String escolhaComunicacao = "";
        String escolhaPecas = "";

        double tempoCiclo;

        do {

            System.out.println("");
            System.out.println("==== Menu Principal ====");
            System.out.println("1 - BOTÃO DE EMERGÊNCIA");
            System.out.println("2 - Status do Robô");
            System.out.println("3 - Status do Programa");
            System.out.println("4 - Status da Comunicação");
            System.out.println("5 - Contagem de Peças");
            System.out.println("6 - Tempo de Ciclo");
            System.out.println("========================");

            System.out.println("");
            System.out.println("Escolha uma das opções:");
            opcoes = entrada.nextInt();


            if (opcoes == 1) {

                String escolha = "";

                System.out.println("");
                System.out.println("Você realmente deseja fazer uma 'PARADA EMERGENCIAL'?");
                System.out.println("Responda apenas com 'S' ou 'N':");

                entrada.nextLine();
                escolha = entrada.nextLine();

                if (escolha.equalsIgnoreCase("S")) {

                    System.out.println("");
                    System.out.println("Realizando Parada de Emergência!");

                } else if (escolha.equalsIgnoreCase("N")) {

                    opcoes = 0;

                }

            } else if (opcoes == 2) {

                //Status imaginário do robô, visto que ainda não temos integração em tempo real com o projeto

                System.out.println("");
                if (escolhaRampa == 0) {

                    System.out.println("Estado Atual de Operação do Robô: Em repouso");

                } else {

                    System.out.println("Estado Atual de Operação do Robô: Rampa " + escolhaRampa + " em execução");

                }

                System.out.println("");
                System.out.println("Você deseja alterar o número da rampa?");
                System.out.println("Responda apenas com 'S' ou 'N':");

                entrada.nextLine();
                numeroEscolha = entrada.nextLine();

                if (numeroEscolha.equalsIgnoreCase ("S")) {

                    System.out.println("");
                    System.out.println("Digite o número da rampa desejada:");
                    escolhaRampa = entrada.nextInt();

                    System.out.println("");
                    System.out.println("Rampa Atualizada!");
                    System.out.println("Pressione Enter para voltar ao menu...");
                    entrada.nextLine();
                    entrada.nextLine();

                }

            } else if (opcoes == 3) {

               if (statusPrograma == 1) {

                   System.out.println("");
                   System.out.println("O programa de controle se encontra habilitado!");
                   System.out.println("");

                   System.out.println("Você deseja desabilitá-lo?");
                   System.out.println("Responda apenas com 'S' ou 'N':");

                   entrada.nextLine();
                   escolhaPrograma = entrada.nextLine();

                   if (escolhaPrograma.equalsIgnoreCase("S")) {

                       statusPrograma = 0;

                       System.out.println("");
                       System.out.println("O programa será Desabilitado!");
                       System.out.println("Pressione Enter para voltar ao menu...");
                       entrada.nextLine();

                   }

               } else if (statusPrograma == 0) {

                   System.out.println("");
                   System.out.println("O programa de controle se encontra Desabilitado!");
                   System.out.println("");

                   System.out.println("Você deseja habilitá-lo?");
                   System.out.println("Responda apenas com 'S' ou 'N':");

                   entrada.nextLine();
                   escolhaPrograma = entrada.nextLine();

                   if (escolhaPrograma.equalsIgnoreCase("S")) {

                       statusPrograma = 1;

                       System.out.println("");
                       System.out.println("O programa será Habilitado!");
                       System.out.println("Pressione Enter para voltar ao menu...");
                       entrada.nextLine();

                   }

               }

            } else if (opcoes == 4) {

                if (statusComunicacao == 1) {

                    System.out.println("");
                    System.out.println("Sistema Online");
                    System.out.println("");

                    System.out.println("Deseja desconectá-lo?");
                    System.out.println("Responda apenas com 'S' ou 'N':");

                    entrada.nextLine();
                    escolhaComunicacao = entrada.nextLine();

                    if (escolhaComunicacao.equalsIgnoreCase("S")) {

                        statusComunicacao = 0;

                        System.out.println("");
                        System.out.println("Sistema Desconectado!");
                        System.out.println("Pressione Enter para voltar ao menu...");
                        entrada.nextLine();

                    }

                } else if (statusComunicacao == 0) {

                    System.out.println("");
                    System.out.println("Sistema Offline");
                    System.out.println("");

                    System.out.println("Deseja Conectá-lo?");
                    System.out.println("Responda apenas com 'S' ou 'N':");

                    entrada.nextLine();
                    escolhaComunicacao = entrada.nextLine();

                    if (escolhaComunicacao.equalsIgnoreCase("S")) {

                        statusComunicacao = 1;

                        System.out.println("");
                        System.out.println("Sistema Conectado!");
                        System.out.println("Pressione Enter para voltar ao menu...");
                        entrada.nextLine();

                    }

                }

            } else if (opcoes == 5) {

                System.out.println("");
                System.out.println("Peças Processadas: " + pecasProcecadas);
                System.out.println("");

                System.out.println("Você deseja adicionar mais peças?");
                System.out.println("Responda apenas com 'S' ou 'N':");

                entrada.nextLine();
                escolhaPecas = entrada.nextLine();

                if (escolhaPecas.equalsIgnoreCase("S")) {

                    System.out.println("");
                    System.out.println("Quantas peças serão adicionadas?");
                    pecasAdicionadas = entrada.nextInt();

                    while (pecasAdicionadas == 0) {

                        System.out.println("");
                        System.out.println("Por favor, adicione um valor acima de 0:");
                        pecasAdicionadas = entrada.nextInt();

                    }

                    pecasProcecadas += pecasAdicionadas;
                    System.out.println("");
                    System.out.println("Peças processadas com sucesso!");
                    System.out.println("Pressione Enter para voltar ao menu...");
                    entrada.nextLine();
                    entrada.nextLine();

                }

            } else if (opcoes == 6) {

                if (pecasProcecadas == 0) {

                    System.out.println("");
                    System.out.println("Para verificar o tempo de ciclo por peça, é necessário adicionar peças através da opção '5' no Menu Principal");
                    System.out.println("Pressione Enter para voltar ao menu...");
                    entrada.nextLine();
                    entrada.nextLine();

                } else if (pecasProcecadas > 0) {

                    System.out.println("");
                    System.out.println("Qual foi o tempo total, em segundos, da operação?");
                    tempoTotal = entrada.nextInt();

                    tempoCiclo = tempoTotal / pecasProcecadas;

                    System.out.println("");
                    System.out.println("O tempo de ciclo é de " + tempoCiclo + " segundo(s) por peça.");
                    System.out.println("Pressione Enter para voltar ao menu...");
                    entrada.nextLine();
                    entrada.nextLine();

                }

            }

        } while (opcoes != 1);

    }

}
