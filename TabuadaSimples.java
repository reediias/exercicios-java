import java.util.Scanner;

public class TabuadaSimples{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Me fala um número: ");
        int numero = scanner.nextInt();

        int contador = 1;
        while(contador <= 10){
            int resultado = numero * contador;
            System.out.println(numero + " vezes " + contador + " é igual a " + resultado);
            contador++;
        }
        scanner.close();
    }
}
