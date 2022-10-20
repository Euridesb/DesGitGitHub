package br.com.dio.calculadora;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b ;

        System.out.println("Digite o primeiro numero: ");
        a=scan.nextInt();
        System.out.println("Digite o segundo numero: ");
        b=scan.nextInt();

        double somar = somar(a, b);
        double subtrair = subtrair(a, b);
        double multiplicar = multiplicar(a, b);
        double dividir = dividir(a, b);

        System.out.println("somar: "+ somar);
        System.out.println("subtrair: "+ subtrair);
        System.out.println("multiplicar: "+ multiplicar);
        System.out.println("dividir: "+ dividir);

    }
    public static int somar(int a, int b){
        return a + b;
    }
    public static int subtrair(int a, int b){
        return a - b;
    }
    public static int multiplicar(int a, int b){
        return a * b;
    }
    public static int dividir(int a, int b){
        return a / b;
    }

}
