import java.util.Scanner;


public class Restaurante{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        int lasanha = 10;
        int caviar = 50;
        int arrozMole = 8;
        int carneDeBoi = 7;
        int pure = 5;


        System.out.println("PRODUTOS DISPONÍVEIS:");
        System.out.println("1. Lasanha");
        System.out.println("2. Caviar");
        System.out.println("3. Arroz mole");
        System.out.println("4. Carne de boi");
        System.out.println("5. purê de batata");
       
        System.out.println("Digite o produto que você deseja de acordo com a numeração acima: ");
        int escolha = scanner.nextInt();


        System.out.println("Digite a quantidade desse produto: ");
        float quantidade = scanner.nextFloat();


        float total = 0;


        if(escolha == 1){
            total = (lasanha * quantidade);
        }
        else if(escolha == 2) {
            total = (caviar * quantidade);
        }
        else if(escolha == 3){
            total = (arrozMole * quantidade);
        }
        else if(escolha == 4){
            total = (carneDeBoi * quantidade);
        }
        else if(escolha == 5){
            total = (pure * quantidade);
        }


        System.out.println("O valor total foi: " + total);


        scanner.close();
    }
}
