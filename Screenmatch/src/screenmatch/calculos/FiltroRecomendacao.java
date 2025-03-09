package screenmatch.calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra (Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Está entre os melhores avaliados");
        } else if (classificavel.getClassificacao() >= 2){
            System.out.println("Esta bem avaliado");
        } else {
            System.out.println("Coloque para assistir depois");
        }
    }
}
