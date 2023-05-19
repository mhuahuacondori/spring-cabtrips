# API de de viajes CabTrips

_Esta API se ancarga de manejar la informacion de viajes._

## Comenzando 🚀

_Estas instrucciones te permitirán que el proyecto funcione en una máquina local para propósitos de desarrollo y pruebas._

### Pre-requisitos 📋

_Que cosas necesitas para probar el proyecto_

```
- Base de datos MongoDB.
- IDE IntelliJ IDEA o similar.
- JDK Java 8.
- Postman.
```

### Instalación 🔧

_Primero debes de ambientar el entorno para las pruebas_

_Configura_

```
- Crear Database name: "cabtrips" y Collection Name: "trips".
- Importa data del Archivo "trips.json" que se encuentra en "/src/main/resources/".
- Configurar el "application.properties" del proyecto, cambiar url de la base de datos segun corresponda.
```

## Ejecutando las pruebas ⚙️

_Ejecuta el proyecto Spring Boot_

### Pruebas🔩

_Debes de utilizar los siguientes endpoints_

```
- Metodo Get:

    -localhost:8070/trip/v1/countRecords
        *Consultar la cantidad de viajes totales.
        
    -localhost:8070/trip/v1/countCity/{city}
        *Consultar la cantidad de viajes totales por ciudad.
        
    -localhost:8070/trip/v1/countCountry/{country}
        *Consultar la cantidad de viajes totales por país.
        
    -localhost:8070/trip/v1/currentRecords/{status}/{page}/{size}
        *Consultar los viajes actuales.
        
- Metodo Post:

    -localhost:8070/trip/v1/saveRecord
        *Crear un viaje.
        
- Metodo Put:

    -localhost:8070/trip/v1/updateRecord/{id}
        *Actualizar un viaje.



Puede utilizar el archivo "spring-cabtrip.postman_collection.json" 
que se encuentra en "/src/main/resources/". Importa el proyecto en "postman".
```
_Swagger_
```
-localhost:8070/swagger-ui.html
```
## Construido con 🛠️

_Las herramientas que se utilizo para crear el proyecto_


* [Spring Boot](https://start.spring.io/) - El framework web usado.
* [Spring Data MongoDB](https://spring.io/projects/spring-data-mongodb) - Persistencia de datos.
* [Lombok](https://projectlombok.org/) - Genera ese código repetitivo por nosotros.
* [Maven](https://maven.apache.org/) - Manejador de dependencias.
* [OpenApi](https://springdoc.org/) - Documentar, probar y consumir servicios web (Swagger).
* [Postman](https://www.postman.com/) - Probar y consumir servicios web.
## Expresiones de Gratitud 🎁

* Gracias  🤓.



---
⌨️ con ❤️ por [mhuahuacondori](https://github.com/mhuahuacondori) 😊