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
@Table("USERS")
public class Tipo {
    private @Column("TIPO_ID") @Id
    Long TIPO_ID;
    private @Column("TIPO")
    String TIPO;
    private @Column("DESCRIPTION")
    String DESCRIPTION;
}
