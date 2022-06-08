import java.util.Scanner; //Import necessario para a utilizar a classe

public class JogoAdivinha {
    public static void main (String[] args){
        //Instancia do objeto (buffer) utilizando a classe scanner
        Scanner entrada = new Scanner(System.in);
        int palpite;
        System.out.println("Digite seu palpite:");
        palpite = entrada.nextInt();
        if(palpite == 15){
            System.out.println("Você acertou!!!");
        }
        else{
            if(palpite < 15) {
                System.out.println("Seu palpite esta abaixo");
            }else{
                System.out.println("Seu palpite está acima.");
            }
        }
        entrada.close();
    }
}
