public class Calculos {
    public void calcularConversion(double valorAConvertir, String valorOriginal, String valorObjetivo){
        double equivalencia;

        ConsultaMoneda consulta = new ConsultaMoneda();
        Moneda moneda = consulta.convertirMoneda(valorOriginal,valorObjetivo);
        equivalencia = valorAConvertir * moneda.conversion_rate();
        System.out.println("El valor de "+valorAConvertir+"["+moneda.base_code()+"] corresponde" +
                " al valor de "+equivalencia+ "["+ moneda.target_code()+"]");
    }
}
