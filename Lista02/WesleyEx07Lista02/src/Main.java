import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double valorRendaMesal, valorPrestacao;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite sua renda mensal: ");
        valorRendaMesal = input.nextDouble();
        System.out.print("Digite o valor da prestação que deseja pagar: ");
        valorPrestacao = input.nextDouble();
        if (valorPrestacao <= valorRendaMesal * 0.30){
            System.out.printf("\nFinanciamento aprovado!\nValor da prestação: %.2f\nContando com esssa obrigação, sua renda passara a ser R$%.2f",
                    valorPrestacao, valorRendaMesal - valorPrestacao);

        }else if (valorPrestacao > 3000 && valorRendaMesal >= 10000 && valorPrestacao <= valorRendaMesal * 0.40) {
            System.out.printf("\nFinanciamento aprovado!\nValor da prestação: %.2f\nContando com esssa obrigação, sua renda passara a ser R$%.2f",
                    valorPrestacao, valorRendaMesal - valorPrestacao);
        }else if (valorPrestacao > 3000 && valorRendaMesal >= 10000 && valorPrestacao > valorRendaMesal * 0.40){
            System.out.printf("\nFinanciamento negado por alta prestação!\nValor da renda: R$%.2f\nValor máximo de prestação permitido para a faixa de renda: R$%.2f", valorRendaMesal, valorRendaMesal * 0.40);
        }else{
            System.out.printf("\nFinanciamento reprovado por baixa renda!\nValor da renda R$%.2f\nValor máximo permitido para a prestação: R$%.2f", valorRendaMesal, valorRendaMesal * 0.30);
        }
    }
}
