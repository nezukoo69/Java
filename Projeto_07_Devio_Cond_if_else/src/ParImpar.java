import java.util.Scanner;
public class ParImpar {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Digite um numero inteiro: ");
        numero = entrada.nextInt();

        if((numero % 2) == 0){
            System.out.println("o numero" + numero +"é par");
        }
        else{
            System.out.println("O numero" + numero + "é impár");
        }
        entrada.close();
    }
}
