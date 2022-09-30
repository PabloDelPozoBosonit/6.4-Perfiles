Cambiando el puerto por defecto, creando variables en application.properties.
Creamos nuestro properties personal creando mas variables y una clase que lee ese archivo y obtiene las variables.

Creamos 3 clases: Perfil1, Perfil2 y Perfil3 anotadas con @Profile("perfilx")
Desde controller podemos mostrar esas variables y en el perfil en que estemos

Podemos cambiar el perfil con variables de entorno.
