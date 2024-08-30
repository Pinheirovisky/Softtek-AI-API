package com.projetoAI.Project.AI.testes;

import com.projetoAI.Project.AI.dtos.GeminiResponseDTO;
import com.projetoAI.Project.AI.models.Chamado;
import com.projetoAI.Project.AI.services.ChatService;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

@Component
public class ProjectAI {

    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {

        ChatService chatService = new ChatService();

        Scanner sc = new Scanner(System.in);

        var chamados = chatService.mapearChamadosESetaIndice();

        // A Chave API é necessária para a utilização de APIs da Google como a Utilizada nesse projeto (generativelanguage API)
        System.out.println("Caso você não possua uma Chave API, obtenha uma em: https://aistudio.google.com/app/apikey");
        System.out.println("Insira sua API KEY do Google:");
        String api_key = sc.nextLine();


        // busca um chamado pela Primary key
        int op;
        do {
            System.out.println("""
                    Olá. Bem vindo à Côda. Sua assistente para o tratamento de chamados.
                    Com a Côda é possível receber insights e soluções para chamados por meio de Inteligência Artificial
                    Digite o número correspondente à opção desejada:
                    1 - Visualizar Chamados
                    2 - Buscar Chamado
                    3 - Obter Ajuda em um Chamado
                    0 - Sair""");
            op = sc.nextInt();
            sc.nextLine();
            if (op == 1) {
//                Exibe todos os chamados
                chamados.forEach((String, chamado) -> System.out.println(chamado.toStringSimplificado() + "\n"));
            } else if (op == 2) {
//                Recebe o numero de um chamado e retorna as informações do chamado
//                Pergunta ao usuário se quer uma sugestão de solução com IA
                System.out.println("Insira o número do chamado para visualizá-lo:");
                String nroChamado = sc.nextLine();
                Chamado chamadoEncontrado = chatService.buscaChamados(nroChamado);
                if (chamadoEncontrado != null) {
                    System.out.println(chamadoEncontrado.toString());
//                    Pergunta ao usuário se quer uma sugestão de solução com IA
                    System.out.println("Deseja obter ajuda da IA com esse chamado? [S/N]");
                    String resposta = sc.nextLine();
                    if (resposta.equalsIgnoreCase("S")) {
                        try {
                            GeminiResponseDTO ajudaIA = chatService.SolicitacaoIA(chamadoEncontrado, api_key);
                            System.out.println(ajudaIA.toString());
                        } catch (NullPointerException e){
                            System.out.println("Sua Chave API é inválida. Insira uma chave API válida e tente novamente");
                            System.out.println("Obtenha uma Chave API do Google em: https://aistudio.google.com/app/apikey");
                            System.out.print("API Key:");
                            api_key = sc.nextLine();
                        }
                    }
                } else {
                    System.out.println("Chamado não encontrado.");
                }
            } else if (op == 3) {
//                Recebe o numero de um chamado e realiza uma requisição à API
                System.out.println("Insira o número do chamado que deseja receber Ajuda para a sua solução:");
                String nroChamado = sc.nextLine();
                Chamado chamadoEncontrado = chatService.buscaChamados(nroChamado);
                if (chamadoEncontrado != null) {
                    try {
                        GeminiResponseDTO ajudaIA = chatService.SolicitacaoIA(chamadoEncontrado, api_key);
                        System.out.println(ajudaIA.toString());
                    } catch (NullPointerException e){
                        System.out.println("Sua Chave API é inválida. Insira uma chave API válida e tente novamente");
                        System.out.print("API Key:");
                        api_key = sc.nextLine();
                    }
                } else {
                    System.out.println("Chamado não encontrado.");
                }
            } else if (op == 0) {
                System.out.println("Encerrando o programa.");
            } else {
                System.out.println("Opção inválida.\n");
            }
        } while (op != 0);

    }
}


