import java.util.Scanner;


public class Salario{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite a quantidade de meses que o funcionário trabalha na loja: ");
        int meses = scanner.nextInt();


        System.out.println("Digite a quantidade de horas que o funcionário trabalhou no mês: ");
        float horas = scanner.nextFloat();


        float total = 0;
        float valorPorHora = 12;


        if(meses <= 12){
            total = (meses*8) + (horas*valorPorHora);
        }
        else if(meses > 12 && meses < 20){
            total = (meses*12) + (horas*valorPorHora);
        }
        else if(meses >= 20){
            total = (meses*15) + (horas*valorPorHora);
        }


        System.out.println("O valor total foi: " + total);


        scanner.close();
    }
}
