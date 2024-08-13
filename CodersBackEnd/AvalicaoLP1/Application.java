package AvalicaoLP1;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println(">>>> Menu Contato <<<<");
            System.out.println("1 - Adicionar Contato");
            System.out.println("2 - Detalhar Contato");
            System.out.println("3 - Editar Contato");
            System.out.println("4 - Remover Contato");
            System.out.println("5 - Sair");
            System.out.print("Digite sua escolha: ");
            opcao = sc.nextInt();
        }  while (opcao != 5);
        System.out.println("Saindo..");
    }
}
