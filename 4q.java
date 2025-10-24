import java.util.Scanner;

public class SalarioDescontos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora? ");
        double valorHora = sc.nextDouble();

        System.out.print("Número de horas trabalhadas no mês: ");
        double horasTrabalhadas = sc.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;

        double descontoIR = salarioBruto * 0.11;
        double descontoINSS = salarioBruto * 0.08;
        double descontoSindicato = salarioBruto * 0.05;

        double salarioLiquido = salarioBruto - (descontoIR + descontoINSS + descontoSindicato);

        System.out.println("Salário bruto: R$ " + salarioBruto);
        System.out.println("Desconto INSS: R$ " + descontoINSS);
        System.out.println("Desconto Sindicato: R$ " + descontoSindicato);
        System.out.println("Salário líquido: R$ " + salarioLiquido);

        sc.close();
    }
}
