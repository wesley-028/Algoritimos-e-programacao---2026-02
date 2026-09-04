import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int opcao;
        double temperatura;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a temperatura em °C: ");
        temperatura = input.nextDouble();
        System.out.print("Converta pare Fahrenheit ou Kelvin!\nDigite (1) para Fahrenheit ou (2) para Kelvin.\nOpção desejeda: ");
        opcao = input.nextInt();
        if (opcao == 1){
            System.out.printf("Antes: %.0f°C\nConversão para Fahrenheit: %.0fF", temperatura, temperatura * 1.8 + 32);
        } else if (opcao == 2) {
            System.out.printf("Antes: %.0f°C\nConversão para Kelvin: %.2f K", temperatura, temperatura + 273.15);
        }else{
            System.out.println("\nOpção inválida!");
        }
    }
}
