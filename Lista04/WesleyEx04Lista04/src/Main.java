import java.util.Scanner;
void main(){
    Scanner input=new Scanner(System.in);
    String[]diaDaSemana=new String[5];
    double[]valorVenda=new double[5];
    double somaDasVendas=0;
    for(int i=0;i<valorVenda.length;i++){
        switch(i){
            case 0:
                System.out.print("Venda da Segunda-Feira: ");
                valorVenda[i]=input.nextDouble();
                somaDasVendas+=valorVenda[i];
                diaDaSemana[i]="Segunda-Feira";
                break;
            case 1:
                System.out.print("Venda da Terça-Feira: ");
                valorVenda[i]=input.nextDouble();
                somaDasVendas+=valorVenda[i];
                diaDaSemana[i]="Terça-Feira";
                break;
            case 2:
                System.out.print("Venda da Quarta-Feira: ");
                valorVenda[i]=input.nextDouble();
                somaDasVendas+=valorVenda[i];
                diaDaSemana[i]="Quarta-Feira";
                break;
            case 3:
                System.out.print("Venda da Quinta-Feira: ");
                valorVenda[i]=input.nextDouble();
                somaDasVendas+=valorVenda[i];
                diaDaSemana[i]="Quinta-Feira";
                break;
            case 4:
                System.out.print("Venda da Sexta-Feira: ");
                valorVenda[i]=input.nextDouble();
                somaDasVendas+=valorVenda[i];
                diaDaSemana[i]="Sexta-Feira";
                break;
            default:
                System.out.print("\nErro!");
        }
    }
    System.out.printf("Faturamento total acumulado:R$%.2f\nMédia diária de vendas na semana: R$%.2f", somaDasVendas, somaDasVendas/valorVenda.length);
    for(int i=0;i<valorVenda.length;i++){
        if(valorVenda[i]<(somaDasVendas/valorVenda.length)){
            System.out.printf("\n%s ficou abaixo da média: R$%.2f",diaDaSemana[i],valorVenda[i]);
        }
    }
}
