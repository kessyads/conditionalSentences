package conditionalClass;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
    Scanner teclado = new Scanner (System.in);
    int number;

    System.out.println("Por favor, insira um número");
    number = Integer.parseInt(teclado.nextLine());

    if (number >=20){
    System.out.println("Este número é maior que 20");
    }
    teclado.close();
    
    }
}
