package conditionalClass;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
    Scanner teclado = new Scanner (System.in);
    int N1, N2;
    
    System.out.println("Por favor, insira um número");
    N1 = Integer.parseInt(teclado.nextLine());
    System.out.println("Por favor, insira outro número");
    N2 = Integer.parseInt(teclado.nextLine());
    
    if(N1 == N2)
    System.out.println("Ambos os números são iguais");

    else {
            System.out.println("Ambos os números são diferentes");
        }
     }
}