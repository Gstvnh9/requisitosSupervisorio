package org.example;

import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcoes = 0;
        int escolhaRampa = 0;
        int statusPrograma = 0;
        int statusComunicacao = 0;
        int pecasProcecadas = 0;
        int pecasAdicionadas = 0;
        int tempoTotal = 0;
        int statusProcessamento = 0;
        int pecasVermelhas = 0;
        int pecasVerdes = 0;
        int pecasAzuis = 0;

        String numeroEscolha = "";
        String escolhaPrograma = "";
        String escolhaComunicacao = "";
        String escolhaPecas = "";
        String escolhaProcessamento = "";
        String usuario = "Operador";

        double tempoCiclo = 0;
        double percentual = 1;
        double disponibilidade = 0;
        double desempenho = 0;
        double qualidade = 0;
        double tempoPlanejado = 0;
        double tempoParado = 0;
        double tempoIdealPorPeca = 0;

        boolean sessaoAtiva = true;

        java.util.ArrayList<String> notificacoes = new java.util.ArrayList<>();
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");

        do {

            System.out.println("");
            System.out.println("SENAI - Sistema de Monitoramento Integrado");
            System.out.println("Hora: " + LocalTime.now().format(formatoHora) + " | Usuário: " + usuario);
            System.out.println("==== Menu Principal ====");
            System.out.println("1 - BOTÃO DE EMERGÊNCIA (RF-01)");
            System.out.println("2 - Status do Robô (RF-02)");
            System.out.println("3 - Status do Programa (RF-03)");
            System.out.println("4 - Status da Comunicação (RF-04)");
            System.out.println("5 - Contagem de Peças (RF-05)");
            System.out.println("6 - Tempo de Ciclo (RF-06)");
            System.out.println("7 - Indicador de Taxa de Acerto (RF-07)");
            System.out.println("8 - Status de Processamento da Câmera (RF-10)");
            System.out.println("9 - Registro de Logs em Tempo Real (RF-11)");
            System.out.println("10 - Monitoramento de Eficiência (RF-12)");
            System.out.println("11 - Disponibilidade Mecânica (RF-13)");
            System.out.println("12 - Monitoramento de Peças por Cor (RF-14)");
            System.out.println("13 - Navegação por Sidebar (RF-15)");
            System.out.println("14 - Identificação da Instituição (RF-16)");
            System.out.println("15 - Relógio do Sistema (RF-17)");
            System.out.println("16 - Central de Notificações (RF-18)");
            System.out.println("17 - Perfil do Usuário e Logout (RF-19)");
            System.out.println("0 - Sair do Sistema");
            System.out.println("========================");

            System.out.println("");
            System.out.println("Escolha uma das opções:");
            opcoes = entrada.nextInt();


            if (opcoes == 1) {

                String escolha = "";

                System.out.println("");
                System.out.println("=== RF-01: BOTÃO DE EMERGÊNCIA ===");
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

                System.out.println("");
                System.out.println("=== RF-02: Status do Robô ===");

                //Status imaginário do robô, visto que ainda não temos integração em tempo real com o projeto

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

                System.out.println("");
                System.out.println("=== RF-03: Status do Programa ===");

                if (statusPrograma == 1) {

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

                System.out.println("");
                System.out.println("=== RF-04: Status da Comunicação ===");

                if (statusComunicacao == 1) {

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
                System.out.println("=== RF-05: Contagem de Peças ===");

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

                    while (pecasAdicionadas <= 0) {

                        System.out.println("");
                        System.out.println("Por favor, adicione um valor acima de 0:");
                        pecasAdicionadas = entrada.nextInt();

                    }

                    if (pecasAdicionadas < 0) {
                        System.out.println("Quantidade inválida. Informe um valor positivo.");
                        continue;
                    }
                    pecasProcecadas += pecasAdicionadas;
                    notificacoes.add(LocalTime.now().format(formatoHora) + " - " + pecasAdicionadas + " peças adicionadas.");
                    System.out.println("");
                    System.out.println("Peças processadas com sucesso!");
                    System.out.println("Pressione Enter para voltar ao menu...");
                    entrada.nextLine();
                    entrada.nextLine();

                }

            } else if (opcoes == 6) {

                System.out.println("");
                System.out.println("=== RF-06: Tempo de Ciclo ===");

                if (pecasProcecadas == 0) {

                    System.out.println("Para verificar o tempo de ciclo por peça, é necessário adicionar peças através da opção '5' no Menu Principal");
                    System.out.println("Pressione Enter para voltar ao menu...");
                    entrada.nextLine();
                    entrada.nextLine();

                } else if (pecasProcecadas > 0) {

                    System.out.println("Qual foi o tempo total, em segundos, da operação?");
                    tempoTotal = entrada.nextInt();

                    tempoCiclo = (double) tempoTotal / pecasProcecadas;

                    System.out.println("");
                    System.out.println("O tempo de ciclo é de " + tempoCiclo + " segundo(s) por peça.");
                    System.out.println("Pressione Enter para voltar ao menu...");
                    entrada.nextLine();
                    entrada.nextLine();

                }

            } else if (opcoes == 7) {

                System.out.println("");
                System.out.println("=== RF-07: Indicador de Taxa de Acerto ===");

                if (pecasProcecadas == 0) {

                    System.out.println("Para verificar o percentual de acertos do processo, é necessário processar peças através da opção '5' no Menu Principal");
                    System.out.println("Pressione Enter para voltar ao menu...");
                    entrada.nextLine();
                    entrada.nextLine();

                } else if (pecasProcecadas > 0) {

                    if (pecasProcecadas >= 1 & pecasProcecadas <= 100 ) {

                        percentual = 100;

                    } else if (pecasProcecadas > 100 & pecasProcecadas <= 200) {

                        percentual = 98.5;

                    } else if (pecasProcecadas > 200 & pecasProcecadas <= 300) {

                        percentual = 95;

                    } else if (pecasProcecadas > 300) {

                        percentual = 91.7;

                    }

                    System.out.println("");
                    System.out.println("A partir de " + pecasProcecadas + " peças processadas, houve um percentual de " + percentual + "% de acerto no processo de separação por cor");
                    System.out.println("Pressione Enter para voltar ao menu...");
                    entrada.nextLine();
                    entrada.nextLine();

                }

            } else if (opcoes == 8) {

                System.out.println("");
                System.out.println("=== RF-10: Status de Processamento da Câmera ===");

                if (statusProcessamento == 1) {

                    System.out.println("Atualmente o sistema de visão computacional encontra-se em andamento");
                    System.out.println("");

                    System.out.println("Você gostaria de interromper o processo?");
                    System.out.println("Responda apenas com 'S' ou 'N':");

                    entrada.nextLine();
                    escolhaProcessamento = entrada.nextLine();

                    if (escolhaProcessamento.equalsIgnoreCase("S")) {

                        System.out.println("");
                        statusProcessamento = 0;
                        System.out.println("A visão computacional será interrompida");
                        System.out.println("Pressione Enter para voltar ao menu...");
                        entrada.nextLine();

                    }

                } else if (statusProcessamento == 0) {

                    System.out.println("Atualmente o sistema de visão computacional encontra-se interrompido");
                    System.out.println("");

                    System.out.println("Você gostaria de iniciar o processo?");
                    System.out.println("Responda apenas com 'S' ou 'N':");

                    entrada.nextLine();
                    escolhaProcessamento = entrada.nextLine();

                    if (escolhaProcessamento.equalsIgnoreCase("S")) {

                        System.out.println("");
                        statusProcessamento = 1;
                        System.out.println("A visão computacional será iniciada");
                        System.out.println("Pressione Enter para voltar ao menu...");
                        entrada.nextLine();

                    }

                }

            } else if (opcoes == 9) {

                System.out.println("");
                System.out.println("================================================================== LOGS DO ROBÔ ==================================================================");

                if (escolhaRampa == 0) {

                    System.out.println("- Estado Atual de Operação do Robô: Em repouso");

                } else {

                    System.out.println("- Estado Atual de Operação do Robô: Rampa " + escolhaRampa + " em execução");

                }

                if (statusPrograma == 1) {

                    System.out.println("- O programa de controle se encontra habilitado!");

                } else if (statusPrograma == 0) {

                    System.out.println("- O programa de controle se encontra Desabilitado!");

                }

                if (statusComunicacao == 1) {

                    System.out.println("- Sistema Online");

                } else if (statusComunicacao == 0) {

                    System.out.println("- Sistema Offline");

                }

                System.out.println("- Peças Processadas: " + pecasProcecadas);

                if (pecasProcecadas == 0) {

                    System.out.println("- Para verificar o tempo de ciclo por peça, é necessário adicionar peças através da opção '5' no Menu Principal");

                } else if (pecasProcecadas > 0) {

                    System.out.println("- O tempo de ciclo é de " + tempoCiclo + " segundo(s) por peça.");

                }

                if (pecasProcecadas == 0) {

                    System.out.println("- Para verificar o percentual de acertos do processo, é necessário processar peças através da opção '5' no Menu Principal");

                } else if (pecasProcecadas > 0) {

                    System.out.println("- A partir de " + pecasProcecadas + " peças processadas, houve um percentual de " + percentual + "% de acerto no processo de separação por cor");

                }

                if (statusProcessamento == 1) {

                    System.out.println("- Atualmente o sistema de visão computacional encontra-se em andamento");

                } else if (statusProcessamento == 0) {

                    System.out.println("- Atualmente o sistema de visão computacional encontra-se interrompido");

                }

                double oee = disponibilidade * desempenho * qualidade * 100;
                System.out.printf("- Disponibilidade: %.2f%%%n", disponibilidade * 100);
                System.out.printf("- Desempenho: %.2f%%%n", desempenho * 100);
                System.out.printf("- Qualidade estimada: %.2f%%%n", qualidade * 100);
                System.out.printf("- OEE: %.2f%%%n", oee);
                notificacoes.add(LocalTime.now().format(formatoHora) + " - OEE calculado: " + String.format("%.2f%%", oee));

                System.out.printf("- Disponibilidade mecânica: %.2f%%%n", disponibilidade);

                System.out.println("- Peças processadas: " + pecasProcecadas);
                System.out.println("- Vermelhas: " + pecasVermelhas);
                System.out.println("- Verdes: " + pecasVerdes);
                System.out.println("- Azuis: " + pecasAzuis);

                System.out.println("- Horário atual: " + LocalTime.now().format(formatoHora));

                System.out.println("- [Avatar] " + usuario);

                System.out.println("===================================================================================================================================================");

                System.out.println("");
                System.out.println("Pressione Enter para voltar ao menu...");
                entrada.nextLine();
                entrada.nextLine();

            } else if (opcoes == 10) {

                System.out.println("");
                System.out.println("=== RF-12: Monitoramento da Eficiência (OEE) ===");
                System.out.println("Informe o tempo planejado de produção (segundos):");
                tempoPlanejado = entrada.nextDouble();

                System.out.println("");
                System.out.println("Informe o tempo de parada (segundos):");
                tempoParado = entrada.nextDouble();

                System.out.println("");
                System.out.println("Informe o tempo ideal de produção por peça (segundos):");
                tempoIdealPorPeca = entrada.nextDouble();

                if (pecasProcecadas <= 0) {

                    System.out.println("");
                    System.out.println("Cadastre as peças processadas na opção 5.");
                    System.out.println("Pressione Enter para voltar ao menu...");
                    entrada.nextLine();
                    entrada.nextLine();

                } else if (tempoTotal <= 0) {

                    System.out.println("");
                    System.out.println("Cadastre o tempo total na opção 6.");

                    System.out.println("Pressione Enter para voltar ao menu...");
                    entrada.nextLine();
                    entrada.nextLine();

                } else if (tempoPlanejado <= 0) {

                    System.out.println("");
                    System.out.println("O tempo planejado deve ser maior que zero.");

                    System.out.println("Pressione Enter para voltar ao menu...");
                    entrada.nextLine();
                    entrada.nextLine();

                } else if (tempoParado < 0 || tempoParado >= tempoPlanejado) {

                    System.out.println("");
                    System.out.println("O tempo de parada deve ser menor que o planejado.");

                    System.out.println("Pressione Enter para voltar ao menu...");
                    entrada.nextLine();
                    entrada.nextLine();

                } else if (tempoIdealPorPeca <= 0) {

                    System.out.println("");
                    System.out.println("O tempo ideal por peça deve ser maior que zero.");

                    System.out.println("Pressione Enter para voltar ao menu...");
                    entrada.nextLine();
                    entrada.nextLine();

                } else {

                    double tempoOperacao = tempoPlanejado - tempoParado;
                    disponibilidade = tempoOperacao / tempoPlanejado;
                    desempenho = (tempoIdealPorPeca * pecasProcecadas) / tempoOperacao;

                    if (pecasProcecadas <= 100) qualidade = 1.0;
                    else if (pecasProcecadas <= 200) qualidade = 0.985;
                    else if (pecasProcecadas <= 300) qualidade = 0.95;
                    else qualidade = 0.917;

                    if (tempoTotal > tempoOperacao) {

                        System.out.printf(

                                "O tempo total cadastrado (%d segundos) é maior que o tempo disponível (%.2f segundos).%n",
                                tempoTotal, (double) tempoOperacao

                        );

                        System.out.println("Pressione Enter para voltar ao menu...");
                        entrada.nextLine();
                        entrada.nextLine();

                        System.out.printf(

                                "Altere o tempo total na opção 6 para no máximo %.2f segundos, ou aumente o tempo planejado.%n",
                                (double) tempoOperacao
                        );

                        System.out.println("Pressione Enter para voltar ao menu...");
                        entrada.nextLine();
                        entrada.nextLine();

                    } else if (desempenho > 1) {

                        double tempoIdealMaximo = tempoOperacao / pecasProcecadas;

                        System.out.printf(

                                "O tempo ideal por peça está muito alto para a quantidade de peças cadastradas.%n"

                        );

                        System.out.println("Pressione Enter para voltar ao menu...");
                        entrada.nextLine();
                        entrada.nextLine();

                        System.out.printf(

                                "Altere o tempo ideal por peça para no máximo %.2f segundos, ou reduza a quantidade de peças processadas.%n",
                                tempoIdealMaximo

                        );

                        System.out.println("Pressione Enter para voltar ao menu...");
                        entrada.nextLine();
                        entrada.nextLine();

                    } else {

                        double oee = disponibilidade * desempenho * qualidade * 100;

                        System.out.println("");
                        System.out.printf("Disponibilidade: %.2f%%%n", disponibilidade * 100);
                        System.out.printf("Desempenho: %.2f%%%n", desempenho * 100);
                        System.out.printf("Qualidade estimada: %.2f%%%n", qualidade * 100);
                        System.out.printf("OEE: %.2f%%%n", oee);
                        notificacoes.add(LocalTime.now().format(formatoHora) + " - OEE calculado: " + String.format("%.2f%%", oee));

                        System.out.println("Pressione Enter para voltar ao menu...");
                        entrada.nextLine();
                        entrada.nextLine();

                    }
                }

            } else if (opcoes == 11) {

                System.out.println("");
                System.out.println("=== RF-13: Disponibilidade Mecânica ===");
                System.out.println("Tempo planejado de funcionamento (segundos):");
                double planejado = entrada.nextDouble();

                System.out.println("");
                System.out.println("Tempo de parada mecânica (segundos):");
                double parado = entrada.nextDouble();

                if (planejado <= 0 || parado < 0 || parado > planejado) {

                    System.out.println("Tempos inválidos.");

                    System.out.println("Pressione Enter para voltar ao menu...");
                    entrada.nextLine();
                    entrada.nextLine();

                } else {

                    tempoPlanejado = planejado;
                    tempoParado = parado;
                    disponibilidade = (planejado - parado) / planejado * 100;

                    System.out.println("");
                    System.out.printf("Disponibilidade mecânica: %.2f%%%n", disponibilidade);

                    System.out.println("Pressione Enter para voltar ao menu...");
                    entrada.nextLine();
                    entrada.nextLine();

                }

            } else if (opcoes == 12) {

                System.out.println("");
                System.out.println("=== RF-14: Monitoramento de Peças por Cor ===");
                System.out.println("Peças processadas: " + pecasProcecadas);
                System.out.println("Vermelhas: " + pecasVermelhas);
                System.out.println("Verdes: " + pecasVerdes);
                System.out.println("Azuis: " + pecasAzuis);
                int semCor = pecasProcecadas - pecasVermelhas - pecasVerdes - pecasAzuis;
                System.out.println("Sem classificação: " + semCor);

                if (semCor > 0) {

                    System.out.println("");
                    System.out.println("Quantas peças sem classificação são vermelhas?");
                    int vermelhas = entrada.nextInt();

                    System.out.println("");
                    System.out.println("Quantas são verdes?");
                    int verdes = entrada.nextInt();

                    System.out.println("");
                    System.out.println("Quantas são azuis?");
                    int azuis = entrada.nextInt();

                    if (vermelhas < 0 || verdes < 0 || azuis < 0 ||
                            (long) vermelhas + verdes + azuis > semCor) {

                        System.out.println("");
                        System.out.println("Distribuição inválida. Nenhuma contagem foi alterada.");

                    } else {

                        pecasVermelhas += vermelhas;
                        pecasVerdes += verdes;
                        pecasAzuis += azuis;

                        System.out.println("");
                        System.out.println("Distribuição atualizada!");

                    }
                }

                System.out.println("Pressione Enter para voltar ao menu...");
                entrada.nextLine();
                entrada.nextLine();

            } else if (opcoes == 13) {

                System.out.println("");
                System.out.println("=== RF-15: Navegação por Sidebar (simulação textual) ===");
                System.out.println("1 - Painel Geral");
                System.out.println("2 - Perfil e Cadastro");
                System.out.println("3 - Configurações");

                System.out.println("");
                System.out.println("Selecione um módulo:");
                int modulo = entrada.nextInt();

                if (modulo == 1) {

                    System.out.println("");
                    System.out.println("Painel Geral | Peças: " + pecasProcecadas + " | Comunicação: " + (statusComunicacao == 1 ? "Online" : "Offline"));

                    System.out.println("Pressione Enter para voltar ao menu...");
                    entrada.nextLine();
                    entrada.nextLine();

                } else if (modulo == 2) {

                    System.out.println("");
                    System.out.println("Perfil e Cadastro | Usuário: " + usuario);

                    System.out.println("Pressione Enter para voltar ao menu...");
                    entrada.nextLine();
                    entrada.nextLine();

                } else if (modulo == 3) {

                    System.out.println("");
                    System.out.println("Configurações | Programa: " + (statusPrograma == 1 ? "Habilitado" : "Desabilitado"));

                    System.out.println("Pressione Enter para voltar ao menu...");
                    entrada.nextLine();
                    entrada.nextLine();

                } else {

                    System.out.println("Módulo inválido.");

                    System.out.println("Pressione Enter para voltar ao menu...");
                    entrada.nextLine();
                    entrada.nextLine();

                }

            } else if (opcoes == 14) {

                System.out.println("");
                System.out.println("=== RF-16: Identificação Institucional ===");
                System.out.println("[ SENAI ]");
                System.out.println("Sistema de Monitoramento Integrado");

                System.out.println("Pressione Enter para voltar ao menu...");
                entrada.nextLine();
                entrada.nextLine();

            } else if (opcoes == 15) {

                System.out.println("");
                System.out.println("=== RF-17: Relógio do Sistema ===");
                System.out.println("Horário atual: " + LocalTime.now().format(formatoHora));
                System.out.println("O horário é atualizado a cada exibição do menu.");

                System.out.println("Pressione Enter para voltar ao menu...");
                entrada.nextLine();
                entrada.nextLine();

            } else if (opcoes == 16) {

                System.out.println("");
                System.out.println("=== RF-18: Central de Notificações [SINO] ===");

                if (notificacoes.isEmpty()) {

                    System.out.println("Nenhuma notificação disponível.");

                    System.out.println("Pressione Enter para voltar ao menu...");
                    entrada.nextLine();
                    entrada.nextLine();

                } else {

                    for (String notificacao : notificacoes) {
                        System.out.println("- " + notificacao);

                        System.out.println("Pressione Enter para voltar ao menu...");
                        entrada.nextLine();
                        entrada.nextLine();

                    }
                }

            } else if (opcoes == 17) {

                System.out.println("");
                System.out.println("=== RF-19: Perfil do Usuário ===");
                System.out.println("[Avatar] " + usuario);
                System.out.println("Deseja encerrar a sessão? (S/N)");
                String resposta = entrada.next();

                if (resposta.equalsIgnoreCase("S")) {

                    sessaoAtiva = false;
                    System.out.println("Sessão encerrada. Até logo!");

                }

            } else if (opcoes == 0) {

                sessaoAtiva = false;

                System.out.println("");
                System.out.println("Sistema encerrado.");

            } else {

                System.out.println("Opção inválida.");

            }

        } while (sessaoAtiva);

    }

}