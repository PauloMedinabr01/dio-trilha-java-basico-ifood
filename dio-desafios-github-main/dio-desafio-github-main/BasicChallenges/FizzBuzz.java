// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println. 

import java.util.*;

public class FizzBuzz {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        int num = number.nextInt();

        System.out.println(fizzBuzz(num));

    }

    public static String fizzBuzz(int numero) {
        if ((numero % 3 == 0) && (numero % 5 == 0))
            return "FizzBuzz";
        if (numero % 3 == 0)
            return "Fizz";
        if (numero % 5 == 0)
            return "Buzz";
        return "" + numero;
    }
}