import java.util.Scanner;
public class Tarefa03 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a sua idade");

        Integer idade = ler.nextInt();
        ler.close();

        if (idade <= 5 && idade <= 7) {
            System.out.println("Categoria INFANTIL!");
        }
        else if (idade >= 8 && idade <= 10) {
            System.out.println("Categoria JUVENIL");
        }
        else if (idade >= 11 && idade <= 15) {
            System.out.println("Categoria ADOLESCENTE");
        }
        else if (idade >= 16 && idade <= 30) {
            System.out.println("Categoria ADULTO");
        }
        else{
            System.out.println("Categoria SÊNIOR");
        }
    }
}
