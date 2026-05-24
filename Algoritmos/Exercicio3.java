import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        while (true) {
            System.out.print("Digite uma nota (ou -1 para encerrar): ");
            double nota = scanner.nextDouble(); // Digite com vírgula
            if (nota == -1) {
                break;
            }
            notas.add(nota);
        }

        int qtd = notas.size();
        System.out.println("\nQuantidade de valores lidos: " + qtd);

        if (qtd > 0) {
            double soma = 0;

            System.out.print("Valores na ordem informada: ");
            for (double nota : notas) {
                System.out.print(nota + " ");
                soma += nota;
            }
            System.out.println();

            System.out.println("Valores na ordem inversa:");
            for (int i = qtd - 1; i >= 0; i--) {
                System.out.println(notas.get(i));
            }

            double media = soma / qtd;
            System.out.println("Soma dos valores: " + soma);
            System.out.printf("Média dos valores: %.2f\n", media);

            int acimaMedia = 0;
            int abaixoSete = 0;

            for (double nota : notas) {
                if (nota > media) {
                    acimaMedia++;
                }
                if (nota < 7) {
                    abaixoSete++;
                }
            }

            System.out.println("Quantidade de valores acima da média: " + acimaMedia);
            System.out.println("Quantidade de valores abaixo de sete: " + abaixoSete);
        }

        System.out.println("\nPrograma de análise de notas encerrado com sucesso. Obrigado!");
        scanner.close();
    }
}
