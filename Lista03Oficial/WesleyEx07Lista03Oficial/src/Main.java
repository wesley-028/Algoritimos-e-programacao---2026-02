import java.util.Scanner;
void main(){
    Scanner input = new Scanner(System.in);
    double nota, soma;
    int count, idAluno;
    soma = 0;
    count = 0;
    idAluno = 0;
    System.out.println(" >>>> Calculadora de notas <<<<");
    do {
        idAluno++;
        System.out.printf("Digite a nota do %d° aluno: ", idAluno);
        nota = input.nextDouble();
        soma += nota;
        count++;
    }while(nota >= 0);
    if (count-1 == 0){
        System.out.print("\nSem notas para somar!");
    }else{
        System.out.printf("\nTotal de notas somadas: %d\nMédia das notas somadas: %.2f", count-1, (soma+1)/(count-1));
    }
}