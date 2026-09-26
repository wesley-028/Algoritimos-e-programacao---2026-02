import java.util.Random;
void main(){
    Random random = new Random();
    int somaIdade[]=new int[5];
    int[] idades= new int[100];
    char[] notas=new char[100];
    char[] notasOpcoes={'A','B','C','D','E'};
    int[] quantidades=new int[5];
    double diferencaBC;
    int[] maioresIdades=new int[5];
    for(int i=0;i<100;i++){
        idades[i]=random.nextInt(60)+10;
        notas[i]=notasOpcoes[random.nextInt(notasOpcoes.length)];
        switch(notas[i]){
            case'A':
                quantidades[0]++;
                somaIdade[0]+=idades[i];
                if(idades[i]>maioresIdades[0]){
                    maioresIdades[0]=idades[i];
                }
                break;
            case'B':
                quantidades[1]++;
                somaIdade[1]+=idades[i];
                break;
            case'C':
                quantidades[2]++;
                somaIdade[2]+=idades[i];
                break;
            case'D':
                quantidades[3]++;
                somaIdade[3]+=idades[i];
                if(idades[i]>maioresIdades[1]){
                    maioresIdades[1]=idades[i];
                }
                break;
            case'E':
                quantidades[4]++;
                somaIdade[4]+=idades[i];
                if(idades[i]>maioresIdades[2]) {
                    maioresIdades[2]= idades[i];
                }
                break;
            default:
                System.out.println("Nota inválida!");
        }
    }
    System.out.printf("Quantidade de respostas ótimo %d", quantidades[0]);
    if(quantidades[2]>0){
        diferencaBC=(double)(quantidades[1]-quantidades[2])/quantidades[2] * 100;
        System.out.printf("\nDiferença percentual entre as avaliações Bom e regular: %.2f%%",diferencaBC);
    }else{
        System.out.print("\nNinguém deu nota C");
    }
    if(quantidades[3]>0){
        double mediaIdadeNotaRuim= (double)somaIdade[3]/quantidades[3];
        System.out.printf("\nMedia da idade de pessoas que deram nota ruim: %.2f",mediaIdadeNotaRuim);
    }else{
        System.out.print("\nNinguém deu nota D");
    }if(quantidades[4]>0){
        double porcetagemPessimo=(double)quantidades[4]/idades.length*100;
        System.out.printf("\nPercentagem de pessoas que deram nota péssimo: %.2f%%\nMaior idade que deu essa nota: %d", porcetagemPessimo, maioresIdades[2]);
    }else{
        System.out.print("\nNinguém deu nota E");
    }if(quantidades[0]>0&&quantidades[3]>0){
        System.out.printf("\nDiferença da maior idade de quem respondeu ótimo e a maior idade de quem respondeu ruim: %d", Math.abs(maioresIdades[0]-maioresIdades[1]));
    }

}
