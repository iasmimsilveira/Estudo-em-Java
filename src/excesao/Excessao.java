package excesao;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Excessao {
    public static void main(String[] args) {
        int op1, op2, result;
        boolean operandoOk = false;

        do {
            op1 = entraInt("Entre com op1: ");
            op2 = entraInt("Entre com op2: ");
            try {
                result = op1 / op2;
                System.out.println("Divisão = " + result);
                operandoOk = true;
            }
            catch (ArithmeticException e) {
                System.out.println("Erro: divisão por zero");
            }
        } while (!operandoOk);
    }

    public static int entraInt(String msg) {
        Scanner entrada = new Scanner(System.in);
        boolean entradaOk = false;
        int op = 0;

        do {
            try {
                System.out.print(msg);
                op = entrada.nextInt();
                entradaOk = true;
            }
            catch (InputMismatchException e) {
                System.out.println("Erro: dado inválido");
                entrada.next();
            }
        } while (!entradaOk);
        return op;
    }
}
