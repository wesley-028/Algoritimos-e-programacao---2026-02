import java.util.Scanner;
void main(){
    Scanner input = new Scanner(System.in);
    int soma, limiteInferior, limiteSuperior;
    soma=0;
    System.out.print("Limite inferior: ");
    limiteInferior = input.nextInt();
    System.out.print("Limite Superior: ");
    limiteSuperior = input.nextInt();
    if(limiteInferior<=limiteSuperior){
        for(; limiteInferior<=limiteSuperior;limiteInferior++){
            System.out.print("\n"+limiteInferior);
            soma+=limiteInferior;
        }
    }else{
        for(;limiteInferior>=limiteSuperior; limiteInferior--){
            System.out.print("\n"+limiteInferior);
            soma+=limiteInferior;
        }
    }
    System.out.printf("\nSoma dos números no intervalo:  %d", soma);
}