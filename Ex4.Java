package conditionalClass;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
    Scanner teclado = new Scanner (System.in);
    int  N1;

    System.out.println("Por favor, insira um número");
    N1 = Integer.parseInt(teclado.nextLine());
    if (N1 > 20 && N1 < 90){
    System.out.println("O número está compreendido entre 20 e 90");
    } else{
    System.out.println("O número está fora de alcance");
    }
    teclado.close();
    
    }
}
