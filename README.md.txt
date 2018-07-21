# Ejemplo Spring Boot 

###### Este es una aplicacion web java maven utilizando Spring Boot, donde se tendran dos servcios implementados /employee y /employee/{id_employee} los cuales estan relacionados con la consulta de datos de objetos empleados.

###### Para la carga de datos, se utilizo la interface CommandLineRunner de manera que se indicara que un bean se corra cuando este contenido en la aplicacionSpring

###### De los servicios implementados, se tiene:

######  /employee 				devolvera la lista de empleados 
######	/employee/{id_employee} devolvera el empleado con el id señalado


## Pasos para probar

###### 1) clonar el repositorio
###### 2) abrir el proyecto en cualquier IDE de su preferencia: Neatbeans 8.2, Eclipse, IntelliJ
###### 3) correr el proyecto
###### 4) en un navegador probar los servicios con http://localhost:8080/employee/1 o http://localhost:8080/employee


