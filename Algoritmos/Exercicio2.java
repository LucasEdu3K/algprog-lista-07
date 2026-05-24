import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Criando e alimentando o ArrayList de perguntas
        ArrayList<String> perguntas = new ArrayList<>(Arrays.asList(
            "Telefonou para a vítima? ",
            "Esteve no local do crime? ",
            "Mora perto da vítima? ",
            "Devia para a vítima? ",
            "Já trabalhou com a vítima? "
        ));

        int respostasPositivas = 0;

        System.out.println("Responda com 'sim' ou 'não' para as perguntas abaixo:");
        
        // Percorrendo o ArrayList com um loop for-each
        for (String pergunta : perguntas) {
            System.out.print(pergunta);
            String resposta = scanner.nextLine().trim().toLowerCase();
            if (resposta.equals("sim")) {
                respostasPositivas++;
            }
        }

        // Classificação
        String classificacao;
        if (respostasPositivas == 5) {
            classificacao = "Assassino";
        } else if (respostasPositivas >= 3) {
            classificacao = "Cúmplice";
        } else if (respostasPositivas == 2) {
            classificacao = "Suspeita";
        } else {
            classificacao = "Inocente";
        }

        System.out.println("\nClassificação do indivíduo: " + classificacao);
        scanner.close();
    }
}
