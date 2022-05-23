package com.icai.practicas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("DISPOSITIVO")
public class Dispositivo {
    private @Column("DISPOSITIVO_ID") @Id
    Long DISPOSITIVO_ID;
    private @Column("DISPOSITIVO")
    String DISPOSITIVO;
    private @Column("TIPO_ID")
    Long TIPO_ID;
    private @Column("DESCRIPTION")
    String DESCRIPTION;
    private @Column("SKU")
    Long SKU;
}
