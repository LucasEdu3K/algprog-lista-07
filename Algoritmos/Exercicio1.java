
import java.util.ArrayList;
import java.util.Scanner;


public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] meses = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        ArrayList<Double> temperaturas = new ArrayList<>();
        double soma = 0;

        for (int i = 0; i < 12; i++){
            System.out.println("Digite a temperatura média de " + meses[i] + ": ");
            double temp = sc.nextDouble();
            temperaturas.add(temp);
            soma += temp;
        }

        double mediaAnual = soma / 12;
        System.out.printf("\n Media anual das temperaturas: %.2fºC\n", mediaAnual);
        System.out.println("Meses com temperaturas acima da média: ");

        for(int i = 0; i < 12; i++){
            if (temperaturas.get(i) > mediaAnual){
                System.out.println((i + 1) + " - " + meses[i] + ":" + temperaturas.get(i) + "ºC"); 
            }
        }
        sc.close();

    }

}