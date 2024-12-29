# Conversor de Monedas

Este proyecto es un conversor de monedas desarrollado en Java, le agregué la moneda nuevo sol, que es de mi pais Perú, asi como yo tu tambien puedes agregar tu conversión favorita. Utiliza la librería Gson para la conversión de datos JSON a objetos y viceversa, y la API ExchangeRate para obtener los tipos de cambio actuales.

## Requisitos

- Java 8 o superior
- IntelliJ IDEA
- Librería Gson
- API Key de ExchangeRate API

## Instalación

1. **Clonar el repositorio**:
   ```bash
   git clone https://github.com/SandroV09/conversor-de-monedas.git
   cd conversor-de-monedas
Abrir el proyecto en IntelliJ IDEA:

Abre IntelliJ IDEA.
Selecciona File > Open y elige la carpeta del proyecto.
Agregar la librería Gson:

Ve a File > Project Structure > Libraries.
Haz clic en + y selecciona From Maven.
Busca com.google.code.gson:gson:2.8.6 y añádelo al proyecto.
Configurar la API Key de ExchangeRate API:

Regístrate en ExchangeRate API y obtén tu API Key.
Crea un archivo config.properties en la raíz del proyecto con el siguiente contenido:
api_key=TU_API_KEY
Uso
Ejecutar el programa:

En IntelliJ IDEA, selecciona la clase principal MenuPrincipal y ejecuta el método main.
Interacción con el menú:

Sigue las instrucciones en pantalla para convertir entre diferentes monedas.
Estructura del Proyecto
src/main/java: Contiene el código fuente del proyecto.
MenuPrincipal.java: Clase principal que maneja el menú de opciones.
Conversor.java: Clase que maneja la lógica de conversión de monedas.
ExchangeRateService.java: Clase que se comunica con la API ExchangeRate para obtener los tipos de cambio.
src/main/resources: Contiene recursos del proyecto como config.properties.
Ejemplo de Código
MenuPrincipal.java
import java.io.IOException;
import java.util.Scanner;

public class MenuPrincipal {

    public static void main(String[] args) throws IOException, InterruptedException {
        new MenuPrincipal().menuPrincipal();
    }

    public void menuPrincipal() throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 11) {
            System.out.println("**************************************************");
            System.out.println("Bienvenido al Sistema de Conversión de Monedas");
            System.out.println("1) Dólar ==> Peso Mexicano ");
            System.out.println("2) Peso Mexicano ==> Dólar ");
            System.out.println("3) Dólar ==> Peso Argentino ");
            System.out.println("4) Peso Argentino ==> Dólar ");
            System.out.println("5) Dólar ==> Real Brasileño ");
            System.out.println("6) Real Brasileño ==> Dólar ");
            System.out.println("7) Dólar ==> Peso Colombiano ");
            System.out.println("8) Peso Colombiano ==> Dólar ");
            System.out.println("9) Nuevos Soles ==> Dólar ");
            System.out.println("10) Dólar ==> Nuevos Soles ");
            System.out.println("11) Salir ");
            System.out.println("Por favor elija una opción válida: ");
            opcion = scanner.nextInt();
            System.out.println("***************************************************");

            switch (opcion) {
                case 1: // Lógica para conversión de Dólar a Peso Mexicano
                    break;
                case 2: // Lógica para conversión de Peso Mexicano a Dólar
                    break;
                // Agregar más casos según sea necesario
                case 11:
                    System.out.println("Gracias por usar la App. ¡Hasta luego! Vuelva pronto. :)");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
Contribuciones
Las contribuciones son bienvenidas. Por favor, abre un issue o envía un pull request para discutir cualquier cambio que desees realizar.

Licencia
Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.
