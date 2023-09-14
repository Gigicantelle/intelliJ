import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       System.out.println("Hello and welcome!");
        int valor = 10;

    System.out.println("variavel do tipo int: " + valor);


        byte minhaVariavelByte = 10;
        System.out.println("byte:" + minhaVariavelByte);

        short minhavariavelshort = 10;
        System.out.println("variavel do tipo short: " + minhavariavelshort);

        long minhaVariavelLong = 1000000000L;
        System.out.println("variavel do tipo long: " + minhaVariavelLong);

        boolean minhaVariavelBoolean = true;
        System.out.println("variavel do tipo boolean " +minhaVariavelBoolean);

        char minhaVariavelchar = 'a';
        System.out.println("variavel do tipo char" + minhaVariavelchar);

        float minhaVariavelFloat = 3.14f;
        System.out.println("variavel do tipo float" + minhaVariavelFloat);

        int minhaVariavelInt = 100000;
        System.out.println("variavel do tipo int" +  minhaVariavelInt );

        double minhaVariavelDouble = 3.14159265359;
        System.out.println("variavel do tipo double" +  minhaVariavelDouble );


        //Operações matematicas

        int valor1;
        int valor2;
        valor1=20;
        valor2=30;
        int soma;
        soma= valor1 + valor2;
        System.out.println("a soma é " + soma );


        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");

        System.out.println("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        soma = numero1 +numero2;
        System.out.println("A soma é: " + soma);



        System.out.println("Digite o primeiro número: ");
        int numero5 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero6 = scanner.nextInt();

        int subtracao = numero5 - numero6;
        System.out.println("A subtracao é: " + subtracao);



        System.out.println("Digite o primeiro número: ");
        int numero7 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero8 = scanner.nextInt();

        int multiplicacao = numero7 * numero8;
        System.out.println("A multiplicacao é: " + multiplicacao);




        System.out.println("Digite o primeiro número: ");
        int numero9 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero10 = scanner.nextInt();

        int divisao = numero9 / numero10;
        System.out.println("A divisão é: " + divisao);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();


    //Algoritmo par ou impar

        if (numero % 2 == 0) {
            System.out.println(numero + " número par.");
        } else {
            System.out.println(numero + " número ímpar.");
        }
        scanner.close();




    }
}