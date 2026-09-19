import java.util.Scanner;
void main() {
    Scanner input = new Scanner(System.in);
    int passwd, senha1, count, contagemRegressiva;
    passwd = 221920;
    count = 0;
    contagemRegressiva = 3;
    while(count != 3){
        System.out.print("\nDigite a senha: ");
        senha1 = input.nextInt();
        if (senha1 != passwd){
            contagemRegressiva--;
            System.out.printf("Incorreto tente novamente!\n%d tentativas restantes de login.", contagemRegressiva);
            count++;
        }else{
            System.out.printf("Autorizado!\nTentativas: %d", count);
            break;
        }
        }
}