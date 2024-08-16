/**
 * Application
 */
public class Application {
    public static void main(String[] args) {
        Agenda.adicionar("Elton", "aaa@gmail.com", "9199812543");
        Agenda.adicionar("Suel", "@", "9821");
        Agenda.adicionar("Holden", "@323", "982323");
        Agenda.listar();
        Agenda.detalhar(0);
        Agenda.remover(0);
        Agenda.listar();
        Agenda.adicionar("Peralta", "@191", "982723");
        Agenda.listar();
        Agenda.remover(1);
        Agenda.listar();
        Agenda.remover(10);

    }
}

/**
 * Agenda
 */
class Agenda {
    static String[][] contatos = new String[100][3];

    static void adicionar(String nome, String email, String telefone){
        int indice = buscarNovoIndice();
        if (indice < 0 || indice > contatos.length) {
            System.out.println("Agenda cheia");
            return;
         }
        contatos[indice][0] = nome;
        contatos[indice][1] = email;
        contatos[indice][2] = telefone;
        System.out.println("Novo contato adicionado com sucesso");
        System.out.println();
    }

    static void remover(int contato) {
        if (contato < 0 || contato > contatos.length || contatos[contato][0] == null) {
            System.out.println("Índice fora dos limites do array ou não existe");
            return;
        }
    
        while (contatos[contato][2] != null) {
            contatos[contato][0] = null;
            contatos[contato][1] = null;
            contatos[contato][2] = null;
        }
    
        for (int i = contato; i < contatos.length - 1; i++) {
            int proximoContato = i + 1;
            if(i != (contatos.length - 1)){
                if (contatos[i][0] == null && contatos[proximoContato][0] != null) {
                contatos[i][0] = contatos[proximoContato][0];
                contatos[i][1] = contatos[proximoContato][1];
                contatos[i][2] = contatos[proximoContato][2];

                contatos[proximoContato][0] = null;
                contatos[proximoContato][1] = null;
                contatos[proximoContato][2] = null;

                } else {
                   break;
                }
            }
        }
        System.out.println("Contato removido");
        System.out.println();
    
    }

    static void detalhar(int i){
        System.out.printf("Detalhes do contado: %s\nEmail: %s\nTelefone: %s\n", contatos[i][0], contatos[i][1], contatos[i][2]);
        System.out.println();
    }

    static void listar(){
        if(contatos[0][0] == null){
            System.out.println("Não existe ainda contatos na agenda.");
            return;
        }
        for(int i = 0; i < contatos.length; i++){
            if(contatos[i][0] != null){
                System.out.printf("%s, %s\n", i, contatos[i][0]);
            }
        }
        System.out.println();
    }
    
    static int buscarNovoIndice(){
        int indice = -1;
        for(int i = 0; i < contatos.length; i++){
            if(contatos[i][0] == null){
                indice = i;
                break;
            }
        }
        return indice;
    }
    
}


