import java.util.Scanner;
public class Tarefa04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double salarioBruto, valorReceber, salarioComDesconto, gratificacao, desconto;

        System.out.println("Digite o salário bruto: ");
        salarioBruto = ler.nextDouble();

        if (salarioBruto <= 350) {
            gratificacao = (salarioBruto + 100);
        } else if (salarioBruto <= 600) {
            gratificacao = (salarioBruto + 75);
        } else if (salarioBruto <= 900) {
            gratificacao = (salarioBruto + 50);
        } else {
            gratificacao = (salarioBruto + 35);
        }

        desconto = (salarioBruto * 0.07); // 7% -> 7/100 = 0.07
        salarioComDesconto = (salarioBruto - desconto);
        valorReceber = salarioComDesconto + gratificacao;

        System.out.printf("Salário Bruto: %.2f%n",  salarioBruto);
        System.out.printf("Gratificação: %.2f%n", gratificacao);
        System.out.printf("Desconto: %.2f%n", desconto);
        System.out.printf("Valor a Receber: %.2f",  valorReceber);
    }
}