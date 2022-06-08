import java.util.Scanner;

public class Menu {
    public static void main (String[]args){
        System.out.println("===Menu de Opções===");
        System.out.println(" 1 - Cadastrar Produtos ");
        System.out.println(" 2 - Listas de Produtos ");
        System.out.println(" 3 - Sair do Sistema ");
        System.out.println("=== Escolha uma opção ===");

        Scanner entrada = new Scanner(System.in);
        int menu = entrada.nextInt();

        switch (menu){
            case 1:
                System.out.println("Você escolheu o menu 1");
                System.out.println("Que é a opção cadastrar produtos");
                break;
            case 2:
                System.out.println("Voce escolheu a opção 2");
                System.out.println("Que é a opção listar produtos");
                break;
            case 3:
                System.out.println("Você escolheu a opção 3");
                System.out.println("Que é a opção Sair do sistema");
                break;
            default:
                System.out.println("Item invalido");
        }
        entrada.close();
    }
}
