# SpringCloud project Eureka

## Spring Cloud Gateway

Spring Cloud Gateway es un componente de la suite Spring Cloud que proporciona una solución para construir gateways de servicios en entornos de microservicios. Esencialmente, actúa como un punto de entrada único para todas las solicitudes que ingresan a la arquitectura de microservicios, permitiendo enrutamiento, filtrado y manipulación de solicitudes y respuestas. Esto significa que puedes definir reglas de enrutamiento basadas en patrones de URL, aplicar filtros para modificar o validar solicitudes y respuestas, agregar funcionalidades como balanceo de carga, seguridad, etc. Es una herramienta poderosa para construir arquitecturas de microservicios distribuidas y escalables en entornos basados en Spring Boot.

## Componente Generico

Un componente genérico en Java se refiere a una clase, interfaz o método que puede trabajar con tipos de datos genéricos. Esto significa que puede ser utilizado con diferentes tipos de datos sin tener que escribir el código específico para cada tipo. Los componentes genéricos se definen utilizando parámetros de tipo, también conocidos como "type parameters".

Por ejemplo, en Java, puedes crear una clase genérica utilizando la sintaxis <T> para representar un tipo genérico. Esto permite que la clase sea utilizada con cualquier tipo de dato. Un ejemplo sencillo sería una lista genérica:

```bash
public class ListaGenerica<T> {
    private List<T> elementos = new ArrayList<>();

    public void agregarElemento(T elemento) {
        elementos.add(elemento);
    }

    public T obtenerElemento(int indice) {
        return elementos.get(indice);
    }
}
```

### Ventajas

Las ventajas de utilizar componentes genéricos en Java son:

**Reutilización del código:** Los componentes genéricos permiten escribir código que puede ser reutilizado con diferentes tipos de datos, evitando la duplicación de código para cada tipo específico.

**Flexibilidad:** Al utilizar tipos genéricos, se obtiene flexibilidad para trabajar con diferentes tipos de datos sin tener que modificar el código subyacente. Esto facilita la adaptación del código a diferentes escenarios y requisitos.

**Seguridad en tiempo de compilación:** El uso de componentes genéricos proporciona seguridad en tiempo de compilación al detectar errores de tipo antes de la ejecución del programa. Esto ayuda a reducir errores relacionados con la manipulación de tipos de datos.

**Mantenimiento simplificado:** Al reducir la duplicación de código y mejorar la legibilidad del código, los componentes genéricos facilitan el mantenimiento y la evolución de las aplicaciones a lo largo del tiempo.

**Abstracción y generalización:** Los componentes genéricos permiten abstraer la lógica común y generalizarla para trabajar con diferentes tipos de datos de manera uniforme. Esto promueve un diseño más limpio y modular.

**Mejora del rendimiento:** En algunos casos, el uso de componentes genéricos puede conducir a mejoras de rendimiento al evitar el uso excesivo de conversiones de tipos y la generación de código redundante para cada tipo específico.

### Cuales son sus Usos

**Colecciones genéricas:** Las clases de colecciones como ArrayList<T>, HashMap<K, V>, entre otras, utilizan componentes genéricos para permitir el almacenamiento y manipulación de diferentes tipos de objetos de manera segura y eficiente.

**Métodos y clases utilitarias:** Los métodos y clases utilitarias pueden ser genéricos para trabajar con diferentes tipos de datos de manera uniforme. Por ejemplo, un método genérico para ordenar una lista de cualquier tipo de objeto.

**Estructuras de datos genéricas:** Se pueden crear estructuras de datos genéricas como pilas, colas, árboles, etc., que pueden manejar cualquier tipo de objeto.

**Componentes de persistencia de datos:** Al trabajar con bases de datos, se pueden utilizar componentes genéricos para manejar operaciones CRUD (crear, leer, actualizar, eliminar) en diferentes entidades de manera genérica.

**Clases y métodos de utilidad:** Los componentes genéricos son útiles para crear clases y métodos de utilidad que puedan funcionar con cualquier tipo de datos, como validadores, formateadores, conversores, etc.

**APIs y bibliotecas genéricas:** Las APIs y bibliotecas pueden utilizar componentes genéricos para proporcionar funcionalidades que sean flexibles y adaptables a diferentes necesidades y contextos.

## Definiciones de Dependencias

**Spring Web:** Módulo de Spring para desarrollo de aplicaciones web en Java.

**Spring Dev Tools:** Herramientas para mejorar la experiencia de desarrollo en Spring Boot.

**Spring Data JPA:** Una capa de abstracción que facilita el acceso y la manipulación de datos en aplicaciones Java utilizando la tecnología JPA (Java Persistence API).

**MySQL Driver:** Un controlador que permite la conexión y la comunicación entre una aplicación Java y una base de datos MySQL, facilitando el acceso y la manipulación de datos en la base de datos desde la aplicación.

## Decoradores de la clase Alumno

**@Entity:** Un decorador utilizado en JPA (Java Persistence API) para marcar una clase como una entidad persistente, lo que significa que esta clase se mapea a una tabla en la base de datos.

**@Table:** Un decorador de JPA que se utiliza para especificar el nombre de la tabla en la base de datos a la que está asociada una entidad. Puede incluir opciones adicionales como el esquema de la tabla.

**@AllArgsConstructor:** Un decorador de Lombok que genera automáticamente un constructor que acepta todos los campos de una clase como argumentos, facilitando la creación de objetos completos sin tener que escribir el constructor manualmente.

**@Data:** Un decorador de Lombok que combina varios otros decoradores para generar de forma automática métodos como getters, setters, toString, equals y hashCode, reduciendo la cantidad de código boilerplate en las clases.

**@NoArgsConstructor:** Un decorador de Lombok que genera automáticamente un constructor sin argumentos, útil para la creación de instancias de una clase sin necesidad de pasar argumentos al constructor.

**@Id:** Un decorador utilizado en JPA (Java Persistence API) para marcar un campo como la clave primaria de una entidad, indicando que este campo identifica de forma única cada registro en la tabla asociada.

**@GeneratedValue:** Un decorador de JPA que se utiliza junto con @Id para especificar cómo se generará automáticamente el valor de la clave primaria. Puede tomar opciones como GenerationType.IDENTITY, GenerationType.AUTO, GenerationType.SEQUENCE, entre otras.

**@Column:** Un decorador de JPA que se utiliza para especificar las propiedades de una columna en la base de datos, como el nombre de la columna, su tipo de datos, si permite nulos, su longitud, entre otras opciones.

**@Temporal:** Un decorador de JPA que se utiliza para especificar la representación temporal de un campo de fecha o tiempo en la base de datos, como TIMESTAMP, DATE o TIME.

**@PrePersist:** Un decorador de JPA que se utiliza en métodos de una entidad para indicar que deben ejecutarse antes de que la entidad sea persistida por primera vez en la base de datos, por ejemplo, para establecer valores predeterminados o realizar operaciones previas a la persistencia.

**@Transactional:** Un decorador utilizado en Spring Framework para marcar métodos o clases como transaccionales, lo que significa que las operaciones dentro de ellos se ejecutarán dentro de una transacción, permitiendo que las modificaciones en la base de datos sean consistentes y se gestionen correctamente en caso de errores.

## Conceptos de Spring Boot

**ResponseEntity< ? >:** Un objeto utilizado en Spring MVC para representar una respuesta HTTP completa, incluyendo el cuerpo, el encabezado y el estado de la respuesta. El tipo genérico <?> representa el tipo de datos del cuerpo de la respuesta, que puede ser cualquier tipo de objeto.

**Optional:** Una clase en Java utilizada para representar un contenedor que puede o no contener un valor. Se utiliza para evitar el manejo de valores nulos de manera directa, mejorando la legibilidad y seguridad del código.

**@PathVariable:** Un decorador de Spring MVC que se utiliza para mapear variables de la URL a parámetros en métodos de controladores, permitiendo acceder a datos específicos de la URL en las operaciones del controlador.

**Eureka:** El servidor Eureka es una herramienta de registro y descubrimiento de servicios dentro del ecosistema Spring Cloud. Permite que los microservicios se registren y se encuentren dinámicamente en un entorno distribuido, facilitando la comunicación entre ellos sin necesidad de configuraciones estáticas. Eureka ayuda a construir arquitecturas de microservicios escalables y resilientes al proporcionar un mecanismo centralizado para la administración y localización de servicios en la infraestructura de la aplicación.

## Definición de propiedades

**spring.application.name=MicroservicioSpringGateway**: Define el nombre de la aplicación Spring Boot, que en este caso es "MicroservicioSpringGateway". Este nombre se utiliza para identificar la aplicación dentro del ecosistema de Spring y puede ser utilizado por otros componentes de Spring Cloud, como Eureka, para registrar y descubrir servicios.

**server.port=8090:** Especifica el puerto en el cual se ejecutará el servidor de la aplicación Spring Boot, en este caso el valor es 8090. Esto determina en qué puerto escuchará la aplicación las solicitudes entrantes.

**eureka.client.service-url.defaultZone=http://localhost:8761/eureka:** Configura la URL del servidor Eureka al cual la aplicación Spring Cloud Gateway se conectará para registrarse y descubrir otros servicios. En este caso, se utiliza http://localhost:8761/eureka como la URL del servidor Eureka.

**spring.cloud.gateway.mvc.routes[0].id=microservicio-usuarios:** Define un enrutamiento específico para una ruta de la aplicación Spring Cloud Gateway. En este caso, el identificador del enrutamiento es "microservicio-usuarios".

**spring.cloud.gateway.mvc.routes[0].uri=lb://microservicio-usuarios:** Especifica la URI de destino a la cual se redirigirán las solicitudes que cumplan con el criterio de enrutamiento definido. En este caso, las solicitudes se enviarán al servicio registrado en Eureka con el nombre "microservicio-usuarios" utilizando el balanceo de carga incorporado en Spring Cloud.

**spring.cloud.gateway.mvc.routes[0].predicates=Path=/api/alumno/:** Define el predicado para el enrutamiento, que en este caso se basa en la ruta de la solicitud. Las solicitudes que comiencen con "/api/alumno/" cumplirán con este predicado y serán enrutadas según la configuración.

**spring.cloud.gateway.mvc.routes[0].filters=StripPrefix=2:** Configura los filtros que se aplicarán a las solicitudes que coincidan con el enrutamiento especificado. En este caso, se aplica el filtro "StripPrefix=2" que elimina los primeros dos segmentos de la ruta de la solicitud antes de enviarla al servicio de destino. Esto puede ser útil para ajustar la ruta de la solicitud antes de que llegue al servicio final.
