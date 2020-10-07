# userGL

Descargar el proyecto

1.-En command Line

    Ingrese a la raíz del proyecto
    
    Ejecutar ./gradlew clean build en Linux o gradlew.bat clean build en Windows.
    
    Ejecutar ./gradlew run en Linux/Mac o gradlew.bat run en Windows para ejecutar el proyecto.
    

2.-Endpoint para consumir la API

  http://localhost:8080/v1/users/

3.-Ejemplo RQ:

  {
    "name": "Juan Rodriguez",
    "email": "PEREZ1@BCI.COM1",
    "password": "hunter2",
    "phones": [
      {
        "number": "1234567",
        "cityCode": "1",
        "countryCode": "57"
      },
      {
        "number": "1234565",
        "cityCode": "2",
        "countryCode": "58"
      }
      ]
  }
