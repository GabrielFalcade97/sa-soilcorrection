package edu.utfpr.cp.dacom.sa.soilcorrection.correcao.nutrientes;

import edu.utfpr.cp.dacom.sa.soilcorrection.fontes.IFonteNutriente;
import lombok.NonNull;

public interface ICorrecaoNutrienteQuantidadeAplicar<T extends IFonteNutriente> {
    
    public default double calculaQuantidadeAplicar(
        double necessidade, 
        @NonNull T fonteNutriente) {

        if (necessidade <= 0) {
            throw new IllegalArgumentException();
        }

        return necessidade / fonteNutriente.getTeorFonte();
    }
}
