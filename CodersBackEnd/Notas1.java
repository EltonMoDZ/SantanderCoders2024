public class Notas1 {
    public static String calculaAprovacao(double nota1, double nota2, double nota3, double peso1, double peso2, double peso3) {
        double pesoENota = (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3);
        double pesos = peso1 + peso2 + peso3;
        double mediaPonderadaNota = pesoENota / pesos;
        if(mediaPonderadaNota >= 9) {
            return String.format("Aluno excelente com a nota %.1f", mediaPonderadaNota);
        } else if (mediaPonderadaNota >= 8 && mediaPonderadaNota < 9) {
            return String.format("Aluno muito bom com a nota %.1f", mediaPonderadaNota);
        } else if (mediaPonderadaNota >= 7 && mediaPonderadaNota < 8){
            return String.format("Aluno bom com a nota %.1f", mediaPonderadaNota);
        } else if (mediaPonderadaNota >= 6 && mediaPonderadaNota < 7) {
            return String.format("Aluno mediano com a nota %.1f", mediaPonderadaNota);
        } else if (mediaPonderadaNota >= 5 && mediaPonderadaNota < 6){
            return String.format("Aluno em recuperação com a nota %.1f", mediaPonderadaNota);
        } else {
            return String.format("Aluno reprovado com a nota %.1f", mediaPonderadaNota);
        }
    }

    public static void main(String[] args) {
        System.out.println(calculaAprovacao(10,9,7,3,4,5));
    }
}
