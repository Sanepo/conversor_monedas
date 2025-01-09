import java.util.Scanner;

public class Principal {
    public static void main(String[] args)  {
        int selectorTipoMoneda = 0;
        boolean bandera = true;
        String textoMenu = """
                ********************************************** 
                Sea bienvenido/a al Conversor de Moneda
                
                1) Dolar => Peso argentino
                2) Peso argentino => Dolar
                3) Dolar => Real brasileno
                4) Real brasileno => Dolar
                5) Dolar => Peso colombiano
                6) Peso colombiano => Dolar
                7) Salir
               
                **********************************************
                Elija una opción válida:
                """;
        String textoSolicitud = "Ingrese el valor que deseas convertir: ";
        double valorAConvertir;

        Scanner lectura = new Scanner(System.in);
        Calculos calculo = new Calculos();

        while(selectorTipoMoneda != 7){
            try{
                System.out.println(textoMenu);
                selectorTipoMoneda = Integer.valueOf(lectura.next());

                switch (selectorTipoMoneda){
                    case 1:
                        System.out.println(textoSolicitud);
                        valorAConvertir = Double.valueOf(lectura.next());
                        calculo.calcularConversion(valorAConvertir,"USD","ARS");
                        break;
                    case 2:
                        System.out.println(textoSolicitud);
                        valorAConvertir = Double.valueOf(lectura.next());
                        calculo.calcularConversion(valorAConvertir,"ARS","USD");
                        break;
                    case 3:
                        System.out.println(textoSolicitud);
                        valorAConvertir = Double.valueOf(lectura.next());
                        calculo.calcularConversion(valorAConvertir,"USD","BRL");
                        break;
                    case 4:
                        System.out.println(textoSolicitud);
                        valorAConvertir = Double.valueOf(lectura.next());
                        calculo.calcularConversion(valorAConvertir,"BRL","USD");
                        break;
                    case 5:
                        System.out.println(textoSolicitud);
                        valorAConvertir = Double.valueOf(lectura.next());
                        calculo.calcularConversion(valorAConvertir,"USD","COP");
                        break;
                    case 6:
                        System.out.println(textoSolicitud);
                        valorAConvertir = Double.valueOf(lectura.next());
                        calculo.calcularConversion(valorAConvertir,"COP","USD");
                        break;
                    case 7:
                        System.out.println("Gracias por usar nuestro servicio att Santiago :)");
                        break;
                    default:
                        System.out.println("Elección erronea");
                        break;
                }
            } catch (NumberFormatException e){
                System.out.println("Por favor selecciona un número ");
            }
        }


    }
}
