// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  
// Dado um número A e o seu limite N, encontre a soma de todos os múltiplos A até o seu limite N.

import java.util.Scanner;

public class SomandoMultiplos {
    public static void main(String[] args) {
        int A, N;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();

        int soma = 0;

        for (int i = 0; i <= N; i++) {
            if (i % A == 0) {
                soma += i;
            }
        }

        System.out.println(soma);
    }
}