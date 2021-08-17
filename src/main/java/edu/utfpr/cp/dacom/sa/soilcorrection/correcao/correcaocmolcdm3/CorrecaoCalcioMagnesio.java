package edu.utfpr.cp.dacom.sa.soilcorrection.correcao.correcaocmolcdm3;

import edu.utfpr.cp.dacom.sa.soilcorrection.fontes.FonteCalcioMagnesio;
import edu.utfpr.cp.dacom.sa.soilcorrection.correcao.nutrientes.ICorrecaoNutriente;

public class CorrecaoCalcioMagnesio 
        implements ICorrecaoNutriente<FonteCalcioMagnesio> {

    public double calculaQuantidadeAplicar(
        double qtdeFonteAdicionar, 
        double prntPercent) {

        if (qtdeFonteAdicionar <= 0) {
            throw new IllegalArgumentException();
        }

        if (prntPercent <= 0) {
            throw new IllegalArgumentException();
        }

        return qtdeFonteAdicionar / prntPercent;
    }
}
