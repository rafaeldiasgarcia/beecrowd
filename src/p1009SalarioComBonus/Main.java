package p1009SalarioComBonus;

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        double salarioFixo = sc.nextDouble();
        double totalVendasMes = sc.nextDouble();
        double salarioComBonus = salarioFixo + (totalVendasMes * 0.15);

        System.out.printf("TOTAL = R$ %.2f%n", salarioComBonus);
 
    }
 
}