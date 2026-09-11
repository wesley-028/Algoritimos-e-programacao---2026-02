import java.util.Scanner;
void main(){
    Scanner input = new Scanner(System.in);
    System.out.print("Mês: ");
    int numero = input.nextInt();
    switch (numero){
        case 1 -> System.out.print("Janeiro");
        case 2 -> System.out.print("Fevereiro");
        case 3 -> System.out.print("Março");
        case 4 -> System.out.print("Abril");
        case 5 -> System.out.print("Maio");
        case 6 -> System.out.print("Junho");
        case 7 -> System.out.print("Julho");
        case 8 -> System.out.print("Agosto");
        case 9 -> System.out.print("Setembro");
        case 10 -> System.out.print("Outubro");
        case 11 -> System.out.print("Novembro");
        case 12 -> System.out.print("Dezembro");
        default -> System.out.print("Número inválido!");
    }
}