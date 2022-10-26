// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.*;

public class NumerosIguais {

  public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);

    int numero1 = leitor.nextInt();
    int numero2 = leitor.nextInt();

    if (numero1 == numero2)
      System.out.println("Sao iguais!");
    else
      System.out.println("Nao sao iguais!");

    // TODO: Imprima se os valores numéricos passados são iguais ou não.
  }
} 