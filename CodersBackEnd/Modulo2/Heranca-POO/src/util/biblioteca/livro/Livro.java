package util.biblioteca.livro;

import util.biblioteca.ItemBiblioteca;
import util.biblioteca.typesEnum.TypesEnum;

import java.time.LocalDate;

public class Livro extends ItemBiblioteca {

    public Livro(String titulo, LocalDate date) {
        super(TypesEnum.LIVRO, titulo, date);
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
    }

    // Método para adicionar um livro à biblioteca
    public static void adicionarLivro(String titulo, String data) {
        ItemBiblioteca.adicionarLivro(titulo, data);  // Chama o método da ItemBiblioteca
    }
}
