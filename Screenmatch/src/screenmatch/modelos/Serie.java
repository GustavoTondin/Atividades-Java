package screenmatch.modelos;

import screenmatch.calculos.Classificavel;

public class Serie extends Titulo implements Classificavel {
    private int temporada;
    private int episodiosPorTemporada;
    private boolean ativa;
    private int minutosPorEpisodios;

    public int getMinutosPorEpisodios() {
        return minutosPorEpisodios;
    }

    public void setMinutosPorEpisodios(int minutosPorEpisodios) {
        this.minutosPorEpisodios = minutosPorEpisodios;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return episodiosPorTemporada * minutosPorEpisodios * temporada;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}
