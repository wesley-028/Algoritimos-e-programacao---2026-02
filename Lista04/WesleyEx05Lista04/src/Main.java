import java.util.Scanner;
void main(){
    Scanner input=new Scanner(System.in);
    double[]pesoCaixas=new double[6];
    int[]count=new int[6];
    double pesquisaPeso;
    int indiceEncontrado=-1;
    for(int i=0;i<pesoCaixas.length;i++){
        System.out.printf("Peso da %d° caixa: ", i+1);
        pesoCaixas[i]= input.nextDouble();
        for(int j=0;j<=i;j++){
            if(pesoCaixas[i]==pesoCaixas[j]){
                count[j]++;
            }
        }
    }
    System.out.print("\nPeso para pesquisar: ");
    pesquisaPeso=input.nextDouble();
    for(int i=0; i<pesoCaixas.length;i++){
        if(pesquisaPeso==pesoCaixas[i]){
            indiceEncontrado=i;
            break;
        }
    }
    if(indiceEncontrado!=-1){
        System.out.printf("O peso %.2f foi encontrado %d vezes!", pesoCaixas[indiceEncontrado], count[indiceEncontrado]);
    }else{
        System.out.print("Valor não encontrado na amostragem!");
    }
}