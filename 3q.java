import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora? ");
        double valorHora = sc.nextDouble();

        System.out.print("Número de horas trabalhadas no mês: ");
        double horasTrabalhadas = sc.nextDouble();

        double salario = valorHora * horasTrabalhadas;

        System.out.println("Seu salário no mês é: R$ " + salario);

        sc.close();
    }
}
