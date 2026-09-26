import java.util.Scanner;
void main(){
    Scanner input = new Scanner(System.in);
    int soma, limiteInferior, limiteSuperior;
    soma=0;
    System.out.print("Limite inferior: ");
    limiteInferior = input.nextInt();
    System.out.print("Limite Superior: ");
    limiteSuperior = input.nextInt();
    while(limiteInferior+1<limiteSuperior){
        limiteInferior++;
        soma+=limiteInferior;
        if(limiteInferior%2==0){
            System.out.printf("\nPares: %d", limiteInferior);
        }
    }
    System.out.printf("\nSoma dos Números dentro do intervalo: %d", soma);
}