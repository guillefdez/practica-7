# Practica 6: Persistencia con Queries

## Explicación desarrollo

Se han creado los endpoints correspondientes para insertar, actualizar y eliminar un dispositivo.
El Repositorio, a diferencia de las anteriores prácticas esta vez accepta parametros como el Id para realizar las operaciones mencionadas.
Estos endpoints son llamados desde el javascript y una vez devuelve la llamada HTTP recarga la tabla para ver reflejados los cambios.

## Objetivo de la práctica

Desarrollo de una App de Spring Boot que incluya una funcionalidad que permita persistir información utilizando la librería Spring Data JDBC con una base de datos H2.

El módulo de persistencia debe incluir las operaciones (INSERT, UPDATE,  SELECT y DELETE)

Las operaciones debe de incluir como mínimo dos operaciones “JOINS”  utilizando la anotación @Query.

