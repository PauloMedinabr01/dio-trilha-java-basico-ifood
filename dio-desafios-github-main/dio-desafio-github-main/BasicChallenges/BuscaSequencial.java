// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println. 

import java.util.*;

public class BuscaSequencial {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] elementos = { 64, 137, -16, 43, 67, 81, -90, 212, 10, 75 };

        int numero = leitor.nextInt();

        System.out.println(buscaSequencial(elementos, numero));

    }

    public static String buscaSequencial(int[] elementos, int numero) {

        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] == numero) {
                return "Achei " + numero + " na posicao " + i;
            }
        }
        return "Numero " + numero + " nao encontrado!";
    }
}