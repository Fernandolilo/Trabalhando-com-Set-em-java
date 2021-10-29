package applications;

import java.util.*;

public class Application {
    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t--");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("Suits", "advocacia", 60));
            add(new Serie("Liga da justiça", "ação", 150));
            add(new Serie("Anna", "ação", 60));
        }};
        for (Serie serie : minhasSeries ) {
            System.out.println(serie.getNeme() + " - " +serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        /*
         * para efetuar uma impreção ordenada é necessarios fazer o uso do LinkedHashSet
         */
        System.out.println("--\tOrdem de inserção\t--");
        Set<Serie>minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("Suits", "advocacia", 60));
            add(new Serie("Liga da justiça", "ação", 150));
            add(new Serie("Anna", "ação", 60));
        }};
        for (Serie serie : minhasSeries1 ) {
            System.out.println(serie.getNeme() + " - " +serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        /*
         * para este proximo metodo poder funcionar foi feito um compareTo na class Serie, pois sem ele
         * este metodo retorna com erro.
         */

        System.out.println("--\tOrdem natuara\t--");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie: minhasSeries2) {
            System.out.println(serie.getNeme() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("--\tOrdem Nome/Gênero/TempoEpisodio--\t");
        Set<Serie> minhaSerie3 = new TreeSet<>(new CompareToNomeGeneroTempoEpisodio());
        minhaSerie3.addAll(minhasSeries);
        for (Serie serie: minhaSerie3) {
            System.out.println(serie.getNeme() + " - " + serie.getGenero() + " - " +serie.getTempoEpisodio());
        }

    }
}

