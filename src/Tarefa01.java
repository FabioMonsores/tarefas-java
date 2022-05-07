import java.util.Scanner;
public class Tarefa01 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        double H, horasExtras, numeroDeHorasFalta, divisao;
        divisao = 2.0/3.0;

        System.out.println("Digite o número de horas extras trabalhadas: ");
        horasExtras = ler.nextDouble();
        System.out.println("Digite o número de horas que faltou ao trabalho: ");
        numeroDeHorasFalta = ler.nextDouble();

        H = (horasExtras - (divisao*(numeroDeHorasFalta)))*60.0;

        System.out.printf("Suas horas trabalhadas são: %.2f minutos(\"%.2f horas\")\n\n",  H, H/60);

        if(H >= 2401){
            System.out.println("Sua gratificação será de, R$500,00");
            System.out.println("Tenha um Feliz Natal!");
        }

        else if (H >= 1801 && H <= 2400 ) {
            System.out.println("Sua gratificação será de R$400,00");
            System.out.println("Tenha um Feliz Natal!");
        }

        else if (H >= 1201 && H <= 1800) {
            System.out.println("Sua gratificação será de R$300,00");
            System.out.println("Tenha um Feliz Natal!");
        }

        else if(H >= 600 && H <= 1200){
            System.out.println("Sua gratificação será de 200,00");
            System.out.println("Tenha um Feliz Natal!");
        }

        else {
            System.out.println("Sua gratificação será de 100,00");
            System.out.println("Tenha um Feliz Natal!");
        }
    }
}
