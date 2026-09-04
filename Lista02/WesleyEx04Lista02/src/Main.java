import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int n1,n2,n3;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        n1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        n2 = input.nextInt();
        System.out.print("Digite o terceiro número: ");
        n3 = input.nextInt();
        if(n1 > n2 && n1 > n3){
            System.out.printf("O primeiro número é o maior!\nNúmero: %d", n1);

        } else if (n2 > n3 && n2 > n1) {
            System.out.printf("O segundo número é o maior!\nNúmero: %d", n2);
        }else {
            System.out.printf("O terceiro número é o maior!\nNúmero: %d", n3);
        }
    }
}
