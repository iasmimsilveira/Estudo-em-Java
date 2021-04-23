package olapessoal;

import java.util.Scanner;

public class OlaPessoal {
    public static void main(String[] args) {
        int num;

        num = leInteiro();
        System.out.println(num);
    }

    public static int leInteiro() {
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.print("Entre com um número: ");
        num = entrada.nextInt();
        return num;
    }
}


