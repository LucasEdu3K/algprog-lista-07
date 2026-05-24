import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Criando um ArrayList para os contadores e inicializando 9 posições com zero
        ArrayList<Integer> contadores = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            contadores.add(0);
        }

        while (true) {
            System.out.print("Digite as vendas brutas do vendedor (ou -1 para sair): ");
            double vendaBruta = scanner.nextDouble(); // Digite com vírgula
            if (vendaBruta == -1) {
                break;
            }

            double salario = 200 + (0.09 * vendaBruta);

            if (salario >= 1000) {
                // Incrementa a última posição (índice 8)
                contadores.set(8, contadores.get(8) + 1);
            } else {
                int indice = (int) ((salario - 200) / 100);
                if (indice >= 0 && indice < 8) {
                    // Incrementa o índice correspondente
                    contadores.set(indice, contadores.get(indice) + 1);
                }
            }
        }

        System.out.println("\nQuantidade de vendedores por faixa salarial:");
        for (int i = 0; i < 8; i++) {
            int inicioFaixa = 200 + (i * 100);
            int fimFaixa = inicioFaixa + 99;
            System.out.println("$" + inicioFaixa + " - $" + fimFaixa + ": " + contadores.get(i));
        }
        System.out.println("$1000 em diante: " + contadores.get(8));
        
        scanner.close();
    }
}
