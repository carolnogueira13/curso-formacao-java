package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;
import br.com.alura.screenmatch.modelo.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão",
                1970);
        meuFilme.avalia(9);

        Filme outroFilme = new Filme("Avatar",
                2023);
        outroFilme.avalia(6);

        Filme filmeDoPaulo = new Filme("Dogville",
                2003);
        filmeDoPaulo.avalia(10);

        Serie serie = new Serie("Lost",
                2000);

        // Tipo Titulo, pode adicionar tanto Serie quanto Filme
        // Classes filhas de Titulo
        List<Titulo> listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.add(filmeDoPaulo);
        listaDeAssistidos.add(meuFilme);
        listaDeAssistidos.add(outroFilme);
        listaDeAssistidos.add(serie);

//        listaDeAssistidos.forEach(System.out::println);

        for (Titulo item : listaDeAssistidos){
            System.out.println(item.getNome());
            if (item instanceof Filme filme){
                System.out.println("Classificacao do filme " + filme.getNome() +
                        ": " + filme.getClassificacao());
            }
        }

        List<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jaqueline");

        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);

        System.out.println("Depois da ordenação: ");
        System.out.println(buscaPorArtista);

        // Para permitir a ordenação na lista de Titulos precisa que
        // Titulo implemente a interface Comparable<T> para determinar
        // como comparar os objetos dessa classe
        // Ordenacao por nome utilizando a interface Comparable
        Collections.sort(listaDeAssistidos);
        System.out.println("Lista de titulos ordenados por nome: ");
        System.out.println(listaDeAssistidos);

        // Ordenacao por ano de Lancamento utilizando o metodo sort da propria lista
        // e o Comparatoer, para definir como é a ordenacao
        listaDeAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano de lançamento: ");
        System.out.println(listaDeAssistidos);



    }
}
