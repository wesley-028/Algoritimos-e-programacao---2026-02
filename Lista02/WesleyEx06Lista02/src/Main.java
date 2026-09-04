import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double UmA10, OnzeA20, VinteUmA30, TrintaUmA40, totalDaNota;
        int quantidadeCompras1a10,quantidadeCompras11a20, quantidadeCompras21a30, quantidadeCompras31a40;
        Scanner input = new Scanner(System.in);
        UmA10 = 10.00;
        OnzeA20 = 15.00;
        VinteUmA30 = 20.00;
        TrintaUmA40 = 30.00;
        System.out.printf("Preço dos produtos:\nCOD: 1 a 10: R$%.2f\n" +
                "COD: 11 a 20: R$%.2f\n" +
                "COD: 21 a 30: R$%.2f\n" +
                "COD: 31 a 40: R$%.2f", UmA10, OnzeA20, VinteUmA30, TrintaUmA40);
        System.out.print("\nPara produtos com códigos de 1 a 10, Digite a quantidade: ");
        quantidadeCompras1a10 = input.nextInt();
        System.out.print("Para produtos com códigos de 11 a 20, Digite a quantidade: ");
        quantidadeCompras11a20 = input.nextInt();
        System.out.print("Para produtos com códigos de 21 a 30, Digite a quantidade: ");
        quantidadeCompras21a30 = input.nextInt();
        System.out.print("Para produtos com códigos de 31 a 40, Digite a quantidade: ");
        quantidadeCompras31a40 = input.nextInt();
        totalDaNota = (UmA10 * quantidadeCompras1a10) + (OnzeA20 * quantidadeCompras11a20) + (VinteUmA30 * quantidadeCompras21a30) + (TrintaUmA40 * quantidadeCompras31a40);
        if (totalDaNota > 500){
            System.out.printf("\nValor total da nota: R$%.2f\n*Para notas que fecham em valores acima de R$500,00 aplica-se um desconto de 15%% no valor total da nota!\n" +
                    "Valor final da nota com desconto: R$%.2f", totalDaNota, totalDaNota * 0.85);

        } else if (totalDaNota > 250){
            System.out.printf("\nValor total da nota: R$%.2f\n*Para notas que fecham em valores entre R$250,00 e R$500,00 aplica-se um desconto de 10%% no valor total da nota!\n" +
                    "Valor final da nota com desconto: R$%.2f", totalDaNota, totalDaNota * 0.90);
        }else{
            System.out.printf("\nValor total da nota: R$%.2f\n*Para notas que fecham em valores de até R$250,00 aplica-se um desconto de 5%% no valor total da nota!\n" +
                    "Valor final da nota com desconto: R$%.2f", totalDaNota, totalDaNota * 0.95);
        }


    }
}
