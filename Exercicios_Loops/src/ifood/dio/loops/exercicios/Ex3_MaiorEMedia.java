package ifood.dio.loops.exercicios;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0;
        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior)
                maior = numero;

            count = count + 1;
        } while (count < 5);

        System.out.println("O maior numero digitado foi: " + maior);
        System.out.println("A média entre os numeros foi: " + (soma / 5));

    }
}