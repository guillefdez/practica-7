package com.icai.practicas.repository;

import com.icai.practicas.model.DispositivoTipo;
import com.icai.practicas.model.Tipo;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DispositivoRepository extends CrudRepository<Tipo, Long> {

    String query =
            """
            SELECT T.TIPO_ID, TIPO, DISPOSITIVO_ID, DISPOSITIVO, D.DESCRIPTION
            FROM TIPO T
            JOIN DISPOSITIVO D
            ON T.TIPO_ID = D.TIPO_ID    
           """;

    String queryTablet = query + " AND T.TIPO = 'Tablet'";
    @Query(query)
    List<DispositivoTipo> dispositivoTipoTodos();

    @Query(queryTablet)
    List<DispositivoTipo> dispositivoTipoTablet();

    @Modifying
    @Query(value= "DELETE FROM DISPOSITIVO WHERE DISPOSITIVO_ID= :id")
    void deleteDispositivo(int id);

    @Modifying
    @Query("UPDATE DISPOSITIVO SET DISPOSITIVO='hola' WHERE DISPOSITIVO_ID= 2")
    void updateQuery();

    @Modifying
    @Query("INSERT INTO DISPOSITIVO (DISPOSITIVO_ID, DISPOSITIVO, TIPO_ID, DESCRIPTION, SKU) " +
            "VALUES (RAND(), CONCAT('S', RAND()) , 101, 'insertandooo', 0);")
    void insertDevice();

}
