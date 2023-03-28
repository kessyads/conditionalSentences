package conditionalClass;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args){
    Scanner teclado = new Scanner (System.in);
    String estado;
    
    System.out.println("Por favor, insira seu estado");
    estado = teclado.nextLine();
    
        if (estado.equals("SP")){
            System.out.println("Você é paulista.");
        } else if (estado.equals("RJ")){
            System.out.println("Você é carioca.");
        } else if (estado.equals("MG")){
            System.out.println("Você é mineiro.");
        } else {
            System.out.println("Você é de outro estado. Qual sua naturalidade?");
        }
        teclado.close();
    
    }
}