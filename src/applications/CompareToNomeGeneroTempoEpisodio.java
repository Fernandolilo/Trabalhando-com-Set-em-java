package applications;

import java.util.Comparator;

public class CompareToNomeGeneroTempoEpisodio implements Comparator<Serie> {
    @Override
    public int compare(Serie s1, Serie s2) {
            int nome = s1.getNeme().compareTo(s2.getNeme());
            if(nome != 0){
                return nome;
            }
           int genero = s1.getGenero().compareTo(s2.getGenero());
           if(genero != 0){
               return genero;
           }
        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}
