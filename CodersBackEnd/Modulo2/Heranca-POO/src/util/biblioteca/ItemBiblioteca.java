package util.biblioteca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import util.biblioteca.dvd.Dvd;
import util.biblioteca.typesEnum.TypesEnum;

public class ItemBiblioteca {
    TypesEnum tipo;
    String titulo;
    LocalDate dataDevolucao; // Armazenar a data como LocalDate
    Boolean emprestado;

    // Lista estática para armazenar todos os itens
    protected static List<ItemBiblioteca> items = new ArrayList<>();

    public ItemBiblioteca(TypesEnum tipo, String titulo, LocalDate dataDevolucao) {
        this.tipo = tipo;
        this.titulo = titulo;
        this.dataDevolucao = dataDevolucao;
        this.emprestado = false;
    }

    public static void emprestar(int indice) {
        items.get(indice - 1).emprestado = true;
    }

    public static void devolver(int indice) {
        items.get(indice - 1).emprestado = false;
    }

    public static void listarItems() {
        int contador = 1;
        for (ItemBiblioteca item : ItemBiblioteca.items) {
            System.out.println("Item " + contador);
            item.exibirDetalhes();
            contador++;
            System.out.println();
        }
    }

    public void exibirDetalhes() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataFormatada = (dataDevolucao != null) ? dataDevolucao.format(formatter) : "Não definida";
        System.out.println("Tipo de produto: " + tipo);
        System.out.println("Título: " + titulo);
        if (emprestado){
            System.out.println("Status: Emprestado");
        } else {
            System.out.println("Status: Não Emprestado");
        }
        System.out.println("Data de publicação: " + dataFormatada);
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataFormatada = (dataDevolucao != null) ? dataDevolucao.format(formatter) : "Não definida";
        return "Tipo do Item: " + tipo
                + "\nTitulo: " + titulo
                + "\nData de publicação: " + dataFormatada + "\n";
    }

    // Método para adicionar um DVD à lista
    public static void adicionarDvd(String titulo, String data, int duracao) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate = LocalDate.parse(data, formatter);

        Dvd dvd = new Dvd(titulo, duracao, TypesEnum.DVD, localDate);
        items.add(dvd);
    }

    // Método para adicionar um livro à lista
    public static void adicionarLivro(String titulo, String data) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate = LocalDate.parse(data, formatter);

        ItemBiblioteca livro = new ItemBiblioteca(TypesEnum.LIVRO, titulo, localDate);
        items.add(livro);
    }
}
