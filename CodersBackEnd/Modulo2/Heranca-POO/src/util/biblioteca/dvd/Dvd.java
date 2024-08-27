package util.biblioteca.dvd;

import util.biblioteca.ItemBiblioteca;
import util.biblioteca.typesEnum.TypesEnum;

import java.time.LocalDate;

public class Dvd extends ItemBiblioteca {
    private final int duracao;

    public Dvd(String titulo, int duracao, TypesEnum tipo, LocalDate dataDevolucao) {
        super(tipo, titulo, dataDevolucao);
        this.duracao = duracao;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Duração: " + duracao + " minutos");
    }

    @Override
    public String toString() {
        return super.toString() + "\nDuração: " + duracao + " minutos\n";
    }
}
