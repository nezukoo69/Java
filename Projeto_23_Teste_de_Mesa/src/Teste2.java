public class Teste2 {
    public static void main(String[]args){
        int controle = 10;
        long acumulador = 1;
        boolean condicao;
        System.out.println("Numero da iteração\tCondição\tControle\tAcumulador");
        while(controle > 0){
            int interacao = 10 - controle + 1;
            acumulador *= controle;
        }
    }
}
