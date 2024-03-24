import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intervalo1 = 0, intervalo2 = 0, intervalo3 = 0, intervalo4 = 0;
        int numero;

        System.out.println("Digite uma sequência de números positivos (digite um número negativo para encerrar):");

        do {
            System.out.print("Número: ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                if (numero >= 0 && numero <= 25) {
                    intervalo1++;
                } else if (numero >= 26 && numero <= 50) {
                    intervalo2++;
                } else if (numero >= 51 && numero <= 75) {
                    intervalo3++;
                } else if (numero >= 76 && numero <= 100) {
                    intervalo4++;
                }
            }
        } while (numero >= 0);

        System.out.println("\nResultados:");
        System.out.println("[0-25]: " + intervalo1 + " números");
        System.out.println("[26-50]: " + intervalo2 + " números");
        System.out.println("[51-75]: " + intervalo3 + " números");
        System.out.println("[76-100]: " + intervalo4 + " números");

        scanner.close();
    }
}
