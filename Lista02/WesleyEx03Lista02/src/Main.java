import java.util.Scanner;
public  static void main(String[] args){
    int numero;
    Scanner input = new Scanner(System.in);
    System.out.print("Digite um número inteiro: ");
    numero = input.nextInt();
    if (numero % 2 == 0){
        System.out.printf("O número %d é par!\nSeu quadrado é: %d", numero, numero * numero);

    }else{
        System.out.printf("O número %d é impar!\nSeu cubo é: %d", numero, numero*numero*numero);
    }
}
