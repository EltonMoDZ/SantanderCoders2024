import java.util.Scanner;

public class ProvaCodingTank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a baixo seu Salario:");
        double salario = sc.nextDouble();
        String inss = isSalarioINSS(salario);
        String ir = isSalarioIR(salario);
        calcSalarioFinal(salario, inss, ir);

        sc.close();
    }
    public static void calcSalarioFinal(double salario, String INSS, String IR){
        String tipoSalarioINSS = INSS;
        String tipoSalarioIR = IR;
        Double salarioBruto = salario;
        Double descontoDoINSS = 0.0;
        Double salarioMenosINSS = salarioBruto - descontoDoINSS;
        Double descontoDoIR = 0.0;

        switch (tipoSalarioINSS) {
            case "salario1":
            descontoDoINSS = descontoINSS.salario1.operacao(salario);
                break;
            case "salario2":
            descontoDoINSS = descontoINSS.salario2.operacao(salario);
                break;
            case "salario3":
            descontoDoINSS = descontoINSS.salario3.operacao(salario);
                break;
            case "salario4":
            descontoDoINSS = descontoINSS.salario4.operacao(salario);
                break;
            default:
                System.out.println("Um erro correu na verificação do INSS");
                break;
        }
        switch (tipoSalarioIR) {
            case "salario1":
                descontoDoIR = descontoIR.salario1.operacao(salarioMenosINSS);
                break;
            case "salario2":
                descontoDoIR = descontoIR.salario2.operacao(salarioMenosINSS);
                break;
            case "salario3":
                descontoDoIR = descontoIR.salario3.operacao(salarioMenosINSS);
                break;
            case "salario4":
                descontoDoIR = descontoIR.salario4.operacao(salarioMenosINSS);
                break;
            default:
                System.out.println("Um erro correu na verificação do IR");
                break;
        }
        Double salarioLiquido = (salarioBruto -descontoDoINSS) - descontoDoIR;
        System.out.printf("Seu saldo bruto era de: %.2f \nVocê pagou de INSS: %.2f \nVocê também pagou de IR %.2f \nSeu saldo liquido será de: %.2f", salarioBruto, descontoDoINSS, descontoDoIR, salarioLiquido);
    }

    public static String isSalarioINSS(double salario){
        String tipo = "";
        if (salario <= 1212) {
            tipo = "salario1";
        } else if((salario < 1212) && salario <= 2427.35){
            tipo = "salario2";
        } else if ((salario < 2427.35) && salario <= 3641.03){
            tipo = "salario3";
        } else if ((salario < 3641.03) && salario <= 7087.22){
            tipo = "salario4";
        }
        return tipo;
    }

    public static String isSalarioIR(double salario){
        String tipo = "";
        if (salario < 1903.98) {
            tipo = "salario1";
        } else if((salario > 1903.98) && salario <= 2826.65){
            tipo = "salario2";
        } else if ((salario > 2826.65) && salario <= 3751.05){
            tipo = "salario3";
        } else if ((salario > 3751.05) && salario <= 4664.68){
            tipo = "salario4";
        } else if ((salario > 4664.68)){
            tipo = "salario5";
        }
        return tipo;
    }

    public enum descontoINSS{
        salario1 {
            public double operacao(double salario){
                return salario * 0.075;
            }
        },
        salario2 {
            public double operacao(double salario){
                return salario * 0.09;
            }
        },
        salario3 {
            public double operacao(double salario){
                return salario * 0.12;
            }
        },
        salario4 {
            public double operacao(double salario){
                return salario * 0.14;
            }
        };
        public abstract double operacao(double salario);
    }

    public enum descontoIR{
        salario1{
            public double operacao(double salario){
                return 0;
            };
        },
        salario2{
            public double operacao(double salario){
                return salario * 0.075;
            };
        },
        salario3{
            public double operacao(double salario){
                return salario * 0.15;
            };
        },
        salario4{
            public double operacao(double salario){
                return salario * 0.225;
            };
        },
        salario5{
            public double operacao(double salario){
                return salario * 0.275;
            };
        },
        ;
        
        public abstract double operacao(double salario);
    }

}
