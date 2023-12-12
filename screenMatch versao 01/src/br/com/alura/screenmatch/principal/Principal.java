package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelo.Episodio;
import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão",
                1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " +
                meuFilme.getDuracaoEmMinutos());


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        // System.out.println(meuFilme.somaDasAvaliacoes);
        // System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.retornaMedia());

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());

        Serie serie = new Serie("Lost",
                2000);
        serie.exibeFichaTecnica();
        serie.setTemporadas(10);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " +
                serie.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar",
                2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        // O método filtra tem como parametro um tipo Classificavel
        // O tipo Classificavel é uma interface, então pode passar
        // qualquer classe é implementa a interface
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        Filme filmeDoPaulo = new Filme("Dogville",
                2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        // filmeDoPaulo.setNome("DogVille");
        // filmeDoPaulo.setAnoDeLancamento(2003);
        filmeDoPaulo.avalia(10);

        // Listas
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " +
                listaDeFilmes.size());
        System.out.println("Primeiro filme: " +
                listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);

        
    }
}
