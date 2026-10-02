import java.util.Scanner;
void main(){
    Scanner input=new Scanner(System.in);
    String[]diaDaSemana=new String[5];
    int[]temperaturas=new int[5];
    int somaDasTemperaturas=0;
    for(int i=0;i<temperaturas.length;i++){
        switch(i){
            case 0:
                System.out.print("Digite a temperatura da Segunda-Feira: ");
                temperaturas[i]=input.nextInt();
                somaDasTemperaturas+=temperaturas[i];
                diaDaSemana[i]="Segunda-Feira";
                break;
            case 1:
                System.out.print("Digite a temperatura da Terça-Feira: ");
                temperaturas[i]=input.nextInt();
                somaDasTemperaturas+=temperaturas[i];
                diaDaSemana[i]="Terça-Feira";
                break;
            case 2:
                System.out.print("Digite a temperatura da Quarta-Feira: ");
                temperaturas[i]=input.nextInt();
                somaDasTemperaturas+=temperaturas[i];
                diaDaSemana[i]="Quarta-Feira";
                break;
            case 3:
                System.out.print("Digite a temperatura da Quinta-Feira: ");
                temperaturas[i]=input.nextInt();
                somaDasTemperaturas+=temperaturas[i];
                diaDaSemana[i]="Quinta-Feira";
                break;
            case 4:
                System.out.print("Digite a temperatura da Sexta-Feira: ");
                temperaturas[i]=input.nextInt();
                somaDasTemperaturas+=temperaturas[i];
                diaDaSemana[i]="Sexta-Feira";
                break;
            default:
                System.out.print("\nErro!");
        }
    }
    double temperaturaMediaSemana=(double)somaDasTemperaturas/temperaturas.length;
    System.out.printf("Temperatura média da semana: %.2f°C", temperaturaMediaSemana);
    for(int i=0;i<temperaturas.length;i++){
        if(temperaturas[i]>temperaturaMediaSemana){
            System.out.printf("\n%s teve temperatura acima da média: %d",diaDaSemana[i],temperaturas[i]);
        }
    }
}

