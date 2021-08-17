package edu.utfpr.cp.dacom.sa.soilcorrection.correcao.correcaocmolcdm3;

import edu.utfpr.cp.dacom.sa.soilcorrection.fontes.FontePotassio;
import edu.utfpr.cp.dacom.sa.soilcorrection.correcao.nutrientes.ICorrecaoNutriente;
import edu.utfpr.cp.dacom.sa.soilcorrection.correcao.nutrientes.ICorrecaoNutrienteQuantidadeAplicar;

public class CorrecaoPotassio 
        implements 
            ICorrecaoNutriente<FontePotassio>,
            ICorrecaoNutrienteQuantidadeAplicar<FontePotassio> {

    public double calculaNecessidadeAdicionarCMolcDm3 (
        double teorSolo,
        double participacaoCTCExistente,
        double participacaoCTCDesejada) {

            if (teorSolo <= 0) {
                throw new IllegalArgumentException();
            }

            if (participacaoCTCExistente <= 0) {
                throw new IllegalArgumentException();
            }

            if (participacaoCTCDesejada <= 0) {
                throw new IllegalArgumentException();
            }

            return (teorSolo 
                    * participacaoCTCDesejada 
                    / participacaoCTCExistente) 
                    - teorSolo;
    }

}
