//exercicio1
import java.util.Scanner;
public class exercicios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade:");
        int idade = scanner.nextInt();

        System.out.println(idade + "anos em dias:" + idade * 365);
        System.out.println(idade + "anos em meses:" + idade * 12);

        //exercicio2

        float valor1 = 8;
        float valor2 = 9;
        float valor3 = 7;
        float valor4 = 4;
        float valor5 = 5;
        float valor6 = 6;

        float soma1 = valor1 + valor2 + valor3;
        float soma2 = valor4 + valor5 + valor6;
        float media1 = soma1 / 3;
        float media2 = soma2 / 3;
        float soma3 = media1 + media2;
        float media3 = soma3 / 2;

        System.out.println("valor da media 7,8,9 é " + media1);
        System.out.println("valor da media 4,5,6 é " + media2);
        System.out.println("soma das medias " + soma3);
        System.out.println("valor da media geral é " + media3);

        //Exercicio livre

        String Musica = "If You Lie Down With Me";
        String artista = "Lana Del Rey";
        int duracao = 355;
        int anoLancamento = 2021;

        System.out.println("Musica: " + Musica);
        System.out.println("Artista: " + artista);
        System.out.println("Duração: " + duracao + " segundos");
        System.out.println("Ano de Lançamento: " + anoLancamento);

        System.out.println("quantos albuns a cantora tem:");
        int ab= scanner.nextInt();
        System.out.println("quantos albuns você ja ouviu:");
        int ac= scanner.nextInt();
        int ad= ab-ac;
        System.out.println("essa é a quantidade de albuns que resta para ouvir:" + ad);































    }
}










