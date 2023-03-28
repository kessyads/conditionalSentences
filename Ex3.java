package conditionalClass;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
    Scanner teclado = new Scanner (System.in);
    float  N1, N2, SOMA;

    System.out.println("Por favor, insira o primeiro número");
    N1 = Integer.parseInt(teclado.nextLine());
    System.out.println("Por favor, insira o segundo número");
    N2 = Integer.parseInt(teclado.nextLine());
    
    SOMA = N1 + N2;
   
    if (SOMA >= 10){
        SOMA = SOMA + 5;
    } else{
        SOMA = SOMA - 7;
    }
    System.out.println("A soma de seus números é"+SOMA);
    teclado.close();
    
    }
}
