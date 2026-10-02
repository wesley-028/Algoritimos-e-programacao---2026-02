import java.util.Scanner;
void main(){
    Scanner input = new Scanner(System.in);
    int numero;
    int resultado = 1;
    System.out.print("Digite um número inteiro para fatorar: ");
    numero = input.nextInt();
    for (int fator = numero; fator >=1; fator--){
        resultado *= fator;
    }
    System.out.printf("o fatorial de %d é %d", numero, resultado);
}
