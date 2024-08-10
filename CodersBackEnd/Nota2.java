public class Nota2 {
    public static String calculaAprovacao(double nota1, double nota2, double nota3, double peso1, double peso2, double peso3) {
        double pesoENota = (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3);
        double pesos = peso1 + peso2 + peso3;
        double mediaPonderadaNota = pesoENota / pesos;
        if(mediaPonderadaNota >= 7) {
            return String.format("Aluno aprovado com a nota %.1f", mediaPonderadaNota);
        } else if (mediaPonderadaNota < 7) {
            return String.format("Aluno reprovado com a nota %.1f", mediaPonderadaNota);
        } else {
            return "Entradas invalidas";
        }
    }

    public static void main(String[] args) {
        System.out.println(calculaAprovacao(10,9,7,4,3,5));
    }
}
