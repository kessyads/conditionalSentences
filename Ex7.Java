package conditionalClass;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        int N1, N2, N3;

        System.out.println("Por favor, insira o primeiro número");
        N1 = Integer.parseInt(teclado.nextLine());
        System.out.println("Por favor, insira o segundo número");
        N2 = Integer.parseInt(teclado.nextLine());
        System.out.println("Por favor, insira o terceiro número");
        N3 = Integer.parseInt(teclado.nextLine());

        if (N1 < N2){
            if (N2 < N3){
                System.out.println("A ordem crescente é " + N1 + " " + N2 + " " + N3);
            } else if (N1 < N3) {
                System.out.println("A ordem crescente é " + N1 + " " + N3 + " " + N2);
            } else {
                System.out.println("A ordem crescente é " + N3 + " " + N1 + " " + N2);
            }
        } else {
            if (N1 < N3) {
                System.out.println("A ordem crescente é " + N2 + " " + N1 + " " + N3);
            } else if (N2 < N3) {
                System.out.println("A ordem crescente é " + N2 + " " + N3 + " " + N1);
            } else {
                System.out.println("A ordem crescente é " + N3 + " " + N2 + " " + N1);
            }
        }
    }
}
