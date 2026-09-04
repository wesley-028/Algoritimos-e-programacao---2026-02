import java.util.Scanner;
public class Main {
    public  static void main(String[] args){
        int idade;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a idade do nadador: ");
        idade = input.nextInt();
        if(idade >= 18){
            System.out.printf("Nadador atuldo!\nIdade: %d", idade);

        } else if (idade >= 13) {
            System.out.printf("Nadador Juvenil!\nIdade: %d", idade);
        }else {
            System.out.printf("Nadador infantil!\nIdade: %d", idade);
        }
    }
}