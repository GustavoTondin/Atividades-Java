import screenmatch.calculos.CalculadoraDeTempo;
import screenmatch.calculos.FiltroRecomendacao;
import screenmatch.modelos.Episodio;
import screenmatch.modelos.Filme;
import screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        // Cria um novo Filme
        Filme filme1 = new Filme();
        filme1.setNome("Tonettando");
        filme1.setAnoDeLancamento(2003);
        filme1.setDuracaoEmMinutos(200);
        filme1.setIncluidoNoPlano(true);

        //Exibi a Fixa técnica e avalição do filme que foi criado
        filme1.exibeFichaTecnica();
        filme1.avalia(5);
        filme1.avalia(9);
        System.out.println("Total de avaliacoes: " + filme1.getTotalDeAvaliacao());
        System.out.println("Media de nota: "  + filme1.pegaMedia());

        // Cria uma nova serie
        Serie arcane = new Serie();
        arcane.setNome("Arcane");
        arcane.setAnoDeLancamento(2020);
        arcane.setTemporada(2);
        arcane.setEpisodiosPorTemporada(10);
        arcane.setMinutosPorEpisodios(42);
        arcane.setIncluidoNoPlano(true);
        arcane.avalia(10);
        arcane.avalia(9);

        //Exibi a Fixa técnica e tempo da serie criado
        arcane.exibeFichaTecnica();
        System.out.println("Tempo para maratonar a série " + arcane.getNome() + ": " + arcane.getDuracaoEmMinutos());

        // Cria um segundo filme
        Filme filme2 = new Filme();
        filme2.setNome("Tonettando 2");
        filme2.setAnoDeLancamento(2005);
        filme2.setDuracaoEmMinutos(250);

        //Cria uma calculadora de tempo, para ver quanto tempo demoraria para vermos uma quantidade de filmes e series
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        calculadora.inclui(arcane);
        System.out.println(calculadora.getTempototal());

        //Cria um novo episodio de uma serie
        Episodio episodioArcane1 = new Episodio();
        episodioArcane1.setNumero(1);
        episodioArcane1.setSerie(arcane);
        episodioArcane1.setTotalVisualizacoes(1000);

        //Cria um filtro de recomendacao para Filmes, Series e Episodios
        FiltroRecomendacao filtro1 = new FiltroRecomendacao();
        filtro1.filtra(filme1);
        filtro1.filtra(episodioArcane1);
        filtro1.filtra(arcane);
    }
}