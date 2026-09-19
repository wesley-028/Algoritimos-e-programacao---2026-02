import java.util.Scanner;
void main(){
    Scanner input = new Scanner(System.in);
    int numero;
    System.out.print("Digite um número: ");
    numero = input.nextInt();
    for (int mutl = 0; mutl<=10; mutl++){
        System.out.printf("\n%d x %d = %d", numero,mutl, numero*mutl);
    }
}
