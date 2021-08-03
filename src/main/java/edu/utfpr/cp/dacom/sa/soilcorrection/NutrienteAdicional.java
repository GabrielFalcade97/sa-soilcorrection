package edu.utfpr.cp.dacom.sa.soilcorrection;

import lombok.Getter;
import lombok.Setter;
import lombok.NonNull;
import lombok.Builder;


@Builder
public class NutrienteAdicional {

    @NonNull final NomeNutrienteAdicional nome;
    
    @Getter private final double teorNutriente;

    @Getter @Setter private double correcaoAdicional;



    
    
}
