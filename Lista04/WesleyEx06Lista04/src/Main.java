import java.util.Scanner;
import java.util.ArrayList;
void main(){
    ArrayList<Integer> numeroErrado=new ArrayList<>();
    Scanner input=new Scanner(System.in);
    int numeroSecreto=22;
    int quantidadeDeTentativas=0;
    int numero=0;
    System.out.print(">>> Jogo de adivinhação <<<");
    for(int i=0; numeroSecreto!=numero;i++){
        quantidadeDeTentativas++;
        System.out.printf("\nDigite o %d° palpite: ", i+1);
        numero= input.nextInt();
        numeroErrado.add(numero);
        if(numero>numeroSecreto){
            System.out.print("Palpite incorreto, tente um número menor!");
        }else{
            System.out.print("Palpite incorreto, tente um número maior!");
        }
    }
    System.out.printf("\nParábens, você acertou! número secreto: %d\nTentativas: %d", numeroSecreto, quantidadeDeTentativas);
    System.out.print("\nPalpites:");
    for(int i=0;i<numeroErrado.size();i++){
        System.out.printf("\n%d) %d",i+1,numeroErrado.get(i));
    }
}