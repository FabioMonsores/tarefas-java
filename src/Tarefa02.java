import java.util.Scanner;
public class Tarefa02 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        Integer idade = ler.nextInt();
        System.out.println("Digite seu peso: ");
        Double peso = ler.nextDouble();
        ler.close();

//        MENORES DE 20 ANOS
        if(idade < 20 && peso <= 60) {
            System.out.println("Grupo de risco 9");
        }
        else if (idade < 20 && peso > 60 && peso < 90) {
            System.out.println("Grupo de risco 8");
        }
        else if(idade < 20 && peso > 90) {
            System.out.println("Grupo de risco 7");
        }

//        DE 20 A 50 ANOS
        else if(idade >= 20 && idade <= 50 && peso <= 60) {
            System.out.println("Grupo de risco 6");
        }
        else if (idade >= 20 && idade <= 50 && peso > 60 && peso < 90) {
            System.out.println("Grupo de risco 5");
        }
        else if (idade >= 20 && idade <= 50 && peso > 90) {
            System.out.println("Grupo de risco 4");
        }

//        MAIOR DE 50 ANOS
        else if(idade > 50 && peso < 60) {
            System.out.println("Grupo de risco 3");
        }
        else if (idade > 50 && peso > 60 && peso < 90) {
            System.out.println("Grupo de risco 2");
        }
        else {
            System.out.println("Grupo de risco 1");
        }
    }
}
