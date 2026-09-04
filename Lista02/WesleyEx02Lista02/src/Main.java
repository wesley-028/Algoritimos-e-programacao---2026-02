import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double kWh;
        Scanner input = new Scanner(System.in);
        System.out.print("consumo(kWh) do local:  ");
        kWh = input.nextDouble();
        if(kWh > 200){
            System.out.printf("Consumo do local: %.1f(kWh)\nValor da conta de energia: R$%.2f", kWh, kWh * 0.90);

        } else if (kWh > 100) {
            System.out.printf("Consumo do local: %.1f(kWh)\nValor da conta de energia: R$%.2f", kWh, kWh * 0.70);
        }else {
            System.out.printf("Consumo do local: %.1f(kWh)\nValor da conta de energia: R$%.2f", kWh, kWh * 0.50);
        }
    }
}
