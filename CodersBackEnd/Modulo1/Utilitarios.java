public class Utilitarios {
    private static final Double PI = 3.14;

    public static Double conversorCelciusparaFahrenheit(Double x){
        return (x * 1.8) + 32;
    }

    public static Double conversorFahrenheitparaCelcius(Double x){
        return (x - 32) * 5 / 9;
    }

    public static String calculoDeDiametro(Double raio){
        if (raio < 0) {
            throw new IllegalArgumentException("O raio deve ser positivo.");
        }
        final Double VALOR = 2 * PI * raio;
        return String.format("%.2f", VALOR);
    }

    public static double calcularAreaCirculo(double raio) {
        if (raio < 0) {
            throw new IllegalArgumentException("O raio deve ser positivo.");
        }
        return PI * raio * raio;
    }


    public static void main(String[] args) {
        System.out.println(conversorCelciusparaFahrenheit(32.0));
        System.out.println(calculoDeDiametro(20.0));
        System.out.println(conversorFahrenheitparaCelcius(32.0));
        System.out.println(calcularAreaCirculo(40));
    }
}
