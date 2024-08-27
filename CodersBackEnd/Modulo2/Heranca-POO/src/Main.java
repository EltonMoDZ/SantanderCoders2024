import util.biblioteca.ItemBiblioteca;
import util.biblioteca.dvd.Dvd;
import util.biblioteca.livro.Livro;


public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema dia 1");
        Livro.adicionarLivro("Alice no pais das maravilhas", "11-09-2024");
        Dvd.adicionarDvd("Matrix", "03-09-2024", 122);
        ItemBiblioteca.listarItems();
        System.out.println("Sistema no dia 2");
        ItemBiblioteca.emprestar(2);
        ItemBiblioteca.listarItems();
        System.out.println("Sistema no dia 3");
        ItemBiblioteca.devolver(2);
        ItemBiblioteca.listarItems();
        System.out.println("Dia 4 -- Faliu");
    }
}
