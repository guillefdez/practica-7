package com.icai.practicas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DispositivoTipo {
    private Long TIPO_ID;
    private String TIPO;
    private Long DISPOSITIVO_ID;
    private String DISPOSITIVO;
    private String DESCRIPTION;
}
