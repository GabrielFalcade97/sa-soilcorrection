package edu.utfpr.cp.dacom.sa.soilcorrection.fontes;

import edu.utfpr.cp.dacom.sa.soilcorrection.nutrientes.nutrientesadicionais.NomeNutrienteAdicional;
import edu.utfpr.cp.dacom.sa.soilcorrection.nutrientes.nutrientesadicionais.NutrienteAdicional;
import java.util.Set;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor

public enum FontePotassio implements IFonteNutriente {
    CLORETO_POTASSIO(0.58, Set.of()),
    SULFATO_POTASSIO(0.52, Set.of(NutrienteAdicional.builder().nome(NomeNutrienteAdicional.ENXOFRE).teorNutriente(0.17).build())),
    SULFATO_POTASSIO_MAGNESIO(0.22, Set.of(NutrienteAdicional.builder().nome(NomeNutrienteAdicional.ENXOFRE).teorNutriente(0.22).build(),
                                           NutrienteAdicional.builder().nome(NomeNutrienteAdicional.MAGNESIO).teorNutriente(0.18).build()));
    
    @Getter private final double teorFonte;
    @Getter private final Set<NutrienteAdicional> nutrientesAdicionais;

    
}
