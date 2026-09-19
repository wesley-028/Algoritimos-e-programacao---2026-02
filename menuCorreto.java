import java.util.Scanner;
void main(){
    Scanner input = new Scanner(System.in);
    int opcao, quantidadeSaque, quantidadeDepositos;
    opcao =0;quantidadeDepositos =0;quantidadeSaque=0;
    double saldo, deposito, saque;
    saldo = 1000;
    System.out.print("\n >>>> TESTE CAIXA ELETRÔNICO <<<< ");
    while (opcao != 4) {
        mostrarMenu();
        System.out.print("\nOpção desejada: ");
        if (input.hasNextInt()) {
            opcao = input.nextInt();
        } else {
            System.out.print("Digite apenas os números inteiros representados pelo menu.");
            input.next();
            continue;
        }
        if (opcao == 1) {
            System.out.printf("Saldo atual: R$%.2f", saldo);
        } else if (opcao == 2) {
            System.out.printf("Saldo disponível: R$%.2f", saldo);
            System.out.print("\nValor que deseja depositar: ");
            while (!input.hasNextDouble()) {
                System.out.print("\nDigite apenas numeros para depositar!");
                System.out.print("\n Valor que deseja depositar: ");
                input.next();

            }
            deposito = input.nextDouble();
            if (podeDepositar(deposito)) {
                saldo = depositar(saldo, deposito);
                quantidadeDepositos++;
                System.out.printf("""
                        Depósito realizado com sucesso!
                        Valor do depósito: R$%.2f
                        Saldo atual: R$%.2f
                        Quantidade de depositos hoje: %d""", deposito, saldo, quantidadeDepositos);
            } else {
                System.out.printf("""
                        Depósito inválido!
                        Depósito não pode ser negativo e igual zero.
                        Saldo atual: R$%.2f""", saldo);
            }

        } else if (opcao == 3) {
            System.out.printf("Saldo disponível: R$%.2f", saldo);
            System.out.print("\nValor que deseja sacar: ");
            while (!input.hasNextDouble()) {
                System.out.print("\nDigite apenas números para sacar!");
                System.out.print("Valor que deseja sacar: ");
                input.next();
            }
            saque = input.nextDouble();
            if (podeSacar(saldo, saque)) {
                saldo = sacar(saldo, saque);
                quantidadeSaque++;
                System.out.printf("""
                        Saque realizado com sucesso!
                        Valor do saque: R$%.2f
                        Saldo atual: R$%.2f
                        Saques realizados hoje: %d""", saque, saldo, quantidadeSaque);
            } else {
                System.out.printf("""
                        Saque não realizado!
                        Saque precisa ser igual ou menor que o saldo disponível e maior que zero
                        Saldo disponível: R$%.2f""", saldo);
            }
        }else if(opcao == 4){
            System.out.print("Goodbye...");
        }else{
            System.out.print("\nOpção inválida!");
        }
    }


}

static void mostrarMenu(){
    System.out.println("""
            \n
            ==== Menu =====
            1 - Consultar Saldo
            2 - Depositar
            3 - Sacar
            4 - Sair""");
}
static  boolean podeDepositar(double deposito){
    return deposito >0;
}
static double depositar(double saldoA, double deposito){
    return saldoA + deposito;

}
static boolean podeSacar(double saldo, double saque){
    return saque > 0 && saque<=saldo;
}
static double sacar(double saldoB, double saque) {
    return saldoB - saque;
}
