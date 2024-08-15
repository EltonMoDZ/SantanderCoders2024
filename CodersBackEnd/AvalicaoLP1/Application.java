package AvalicaoLP1;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        int opcaoMenu = 0;
        String[][] contatos = new String[2][3];
        do {
            System.out.println(">>>> Agenda <<<<");
            System.out.println(">>>> Menu Contato <<<<");
            System.out.println("1 - Adicionar Contato");
            System.out.println("2 - Detalhar Contato");
            System.out.println("3 - Editar Contato");
            System.out.println("4 - Remover Contato");
            System.out.println("5 - Sair");
            System.out.print("Digite sua escolha: ");
            opcao = sc.nextInt();
            int contadorDeContatos = 0;
            switch (opcao) {
                case 1:
                    while (opcaoMenu != 2) {
                        System.out.println("Insira o nome do contato: ");
                        contatos[contadorDeContatos][0] = sc.nextLine();
                        System.out.println("Insira o telefone do contato: ");
                        contatos[contadorDeContatos][1] = sc.nextLine();
                        System.out.println("Insira seu email: ");
                        contatos[contadorDeContatos][2] = sc.nextLine();
                        System.out.println("Você deseja adicionar algum novo contato? Se sim, de enter, se não, digite 2");
                        opcaoMenu = sc.nextInt();
                    }
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
            }

        }  while (opcao != 5);
        sc.close();
        System.out.println("Saindo..");
    }
}
