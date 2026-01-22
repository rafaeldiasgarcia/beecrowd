package p1005Media1;

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
         
         Scanner sc = new Scanner(System.in);
         
         double a = sc.nextFloat();
         double b = sc.nextFloat();
         double media = ((a * 3.5) + (b * 7.5)) / 11.0;
         
         System.out.printf("MEDIA = %.5f%n", media);
 
    }
 
}