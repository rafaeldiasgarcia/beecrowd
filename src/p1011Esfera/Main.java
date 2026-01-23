package p1011Esfera;

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        double volume = (4.0 / 3.0) * 3.14159 * Math.pow(r, 3);

        System.out.printf("VOLUME = %.3f%n", volume);
 
    }
 
}