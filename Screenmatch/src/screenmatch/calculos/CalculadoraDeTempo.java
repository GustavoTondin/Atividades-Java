package screenmatch.calculos;

import screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempototal;

    public int getTempototal(){
        return tempototal;
    }

    public void inclui(Titulo t){
        tempototal += t.getDuracaoEmMinutos();
    }

}
