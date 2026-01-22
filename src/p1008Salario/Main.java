package p1008Salario;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int numFuncionairo = sc.nextInt();
        int numHorasTrabalhadas = sc.nextInt();
        double valorPorHora = sc.nextDouble();
        double salario = numHorasTrabalhadas * valorPorHora;

        System.out.printf("NUMBER = %d%n" +
                "SALARY = U$ %.2f%n", numFuncionairo, salario);

    }

}