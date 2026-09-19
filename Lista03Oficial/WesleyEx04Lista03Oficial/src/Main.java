import java.util.Scanner;
void main(){
    Scanner input = new Scanner(System.in);
    int limite, inicio;
    System.out.print("Digite um número: ");
    inicio = 0;
    limite = input.nextInt();

    while(inicio < limite){
        System.out.println("Praticando lógica");
        inicio++;
    }
}