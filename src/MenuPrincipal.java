import java.io.IOException;
import java.util.Scanner;

public class MenuPrincipal {

    public void menuPrincipal() throws IOException, InterruptedException {

        DolarAPesoMex dolarAPesoMex = new DolarAPesoMex();
        PesoMexADolar pesoMexADolar = new PesoMexADolar();
        DolarAPesoArgentino dolarAPesoArgentino = new DolarAPesoArgentino();
        PesoArgentinoADolar pesoArgentinoAdolar = new PesoArgentinoADolar();
        DolarARealBrasileno dolarARealBrasileno = new DolarARealBrasileno();
        RealBrasilenoADolar realBrasilenoADolar = new RealBrasilenoADolar();
        DolarAPesoColombiano dolarAPesoColombiano = new DolarAPesoColombiano();
        PesoColombianoADolar pesoColombianoADolar = new PesoColombianoADolar();
        SolesADolar  SolesADolar = new  SolesADolar();
        DolarASoles DolarASoles = new DolarASoles();


        try {
            Scanner scanner = new Scanner(System.in);
            int opcion = 0;

            while(opcion != 11) {

                System.out.println("**************************************************");

                System.out.println("\bBienvenido al Sistema de Conversión de Monedas");
                System.out.println("\b1) Dólar ==> Peso Mexicano ");
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
                System.out.println("\bPor favor elija una opción válida: ");
                opcion = scanner.nextInt();

                System.out.println("***************************************************");

                switch (opcion) {
                    case 1:dolarAPesoMex.dolarAPesoMex();
                        break;
                    case 2: pesoMexADolar.pesoMexADolar();
                        break;
                    case 3: dolarAPesoArgentino.dolarAPesoArgentino();
                        break;
                    case 4: pesoArgentinoAdolar.pesoArgentinoADolar();
                        break;
                    case 5: dolarARealBrasileno.dolarARealBrasileno();
                        break;
                    case 6: realBrasilenoADolar.realBrasilenoADolar();
                        break;
                    case 7: dolarAPesoColombiano.dolarAPesoColombiano();
                        break;
                    case 8: pesoColombianoADolar.pesoColombianoADolar();
                        break;
                    case 9: SolesADolar.SolesADolar();
                        break;
                    case 10: DolarASoles.DolarASoles();
                        break;
                    case 11:
                        System.out.println("Gracias por usar la App. ¡Hasta luego! Vuelva pronto. :)");
                }
            }
        }catch (Exception e){
            System.out.println("Error: opción no válida");
        }
    }
}