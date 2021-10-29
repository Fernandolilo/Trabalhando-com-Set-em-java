package applications;

import java.util.Objects;

public class Serie implements Comparable<Serie> {

    private String neme;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(){
    }

    public Serie(String neme, String genero, Integer tempoEpisodio) {
        this.neme = neme;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNeme() {
        return neme;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "neme='" + neme + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Serie)) return false;
        Serie serie = (Serie) o;
        return getNeme().equals(serie.getNeme()) && getGenero().equals(serie.getGenero()) && getTempoEpisodio().equals(serie.getTempoEpisodio());
    }
    /*
     * neste caso estamos criando o compareTo para auxiliar no metodo de
     * efetuar uma impresão na ordem natural,  sem que haja a necessidade de fazer um for!
     */

    @Override
    public int hashCode() {
        return Objects.hash(getNeme(), getGenero(), getTempoEpisodio());
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if (tempoEpisodio != 0){
            return tempoEpisodio;
        }
        return this.getGenero().compareTo(serie.getGenero());
    }
}
