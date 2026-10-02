import java.util.Scanner;
void main(){
    Scanner input = new Scanner(System.in);
    double salario, maiorSalario,pessoaEntrevistada, salarioDaPopulacao;
    int qntSalarioMinimo, numeroFilhos,somaNumeroFilhos;
    somaNumeroFilhos=0;
    pessoaEntrevistada=0;
    maiorSalario=0;
    qntSalarioMinimo=0;
    salarioDaPopulacao=0;
    int decisao;
    System.out.print(">> Pesquisa <<");
    do{
        System.out.print("\nsalário: R$");
        salario=input.nextDouble();
        System.out.print("quantidade de filhos: ");
        numeroFilhos=input.nextInt();
        somaNumeroFilhos+=numeroFilhos;
        if(salario<=1729.00){
            qntSalarioMinimo++;
        }
        if (salario>maiorSalario){
            maiorSalario=salario;
        }
        pessoaEntrevistada++;
        salarioDaPopulacao+=salario;

        System.out.print("(1) - Continuar | (2) - Sair: ");
        decisao=input.nextInt();
    }while(decisao!=2);
    System.out.printf("Média do salário da população: R$%.2f", salarioDaPopulacao/pessoaEntrevistada);
    double mediaFilhos=(double)somaNumeroFilhos/pessoaEntrevistada;
    System.out.printf("\nMédia do número de filhos dos entrevistados: %.2f", mediaFilhos);
    System.out.printf("\nMaior salário: %.2f", maiorSalario);
    System.out.printf("\nPercentual de pessoas com salário de até 1 salário mínimo: %.2f%%", (qntSalarioMinimo/pessoaEntrevistada)*100);



}