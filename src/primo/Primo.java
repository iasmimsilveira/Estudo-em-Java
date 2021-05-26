package primo;

import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        int inicio, fim;

        inicio = leInteiro("Entre com o valor inicial: ");
        fim = leInteiro("Entre com o valor final: ");
        for (int i = inicio; i <= fim; i++) {
            if (ePrimo(i)) {
                System.out.println(i + " ");
            }
        }
        System.out.println("");
    }

    public static boolean ePrimo(int num) {
        boolean primo = true;

        for (int i = 2; i < num-1; i++) {
            if((num % i) == 0) {
                primo = false;
                break;
            }
        }
        return primo;
    }

    public static int leInteiro(String msg) {
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.print("Entre com um número: ");
        num = entrada.nextInt();
        return num;
    }

}
