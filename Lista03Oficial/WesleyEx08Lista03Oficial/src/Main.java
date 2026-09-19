import java.util.Scanner;
void main(){
    Scanner input = new Scanner(System.in);
    int doacoes, idDoacao;
    double valorDoacao, totalDaDoacao, menorDoacao, maiorDoacao;
    System.out.print(">>>> TECH ONG <<<<");
    System.out.print("\nQuantidade de doações hoje: ");
    doacoes = input.nextInt();
    totalDaDoacao = 0;
    idDoacao = 0;
    maiorDoacao = 0;
    menorDoacao = 0;
    boolean primeiroNumero = true;
    while(doacoes > idDoacao){
        idDoacao++;
        System.out.printf("Valor da %d° doação: ", idDoacao);
        valorDoacao = input.nextDouble();
        totalDaDoacao += valorDoacao;
        if (primeiroNumero){
            maiorDoacao = valorDoacao;
            menorDoacao = valorDoacao;
            primeiroNumero = false;
        }else{

            if (valorDoacao > maiorDoacao){
                maiorDoacao = valorDoacao;

            }
            if (valorDoacao < menorDoacao){
                menorDoacao = valorDoacao;
            }
        }
    }
    System.out.printf("""
                          Total de doações: %d
                          Valor total arrecadado: R$%.2f
                          Maior doação: R$%.2f
                          Menor doação: R$%.2f""", doacoes, totalDaDoacao, maiorDoacao, menorDoacao);

}
