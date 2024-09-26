public class Ativiidades{
    public int calcularFatorial(int n){
        if(n == 0){
            return 1;
        }
        else{
            return n*calcularFatorial(n-1);
        }
    }


    public static void main(String[] args){
        Ativiidades fatorial = new Ativiidades();
        int resultado = fatorial.calcularFatorial(7);
        System.out.println("o fatorial de 7 é: " + resultado);
    }
}
