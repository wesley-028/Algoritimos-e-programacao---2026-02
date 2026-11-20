//Exemplo de uso do Buscador de CEP, mano, eu acho que voce consegue impedir atráves do main que o usuário confirme um endereço vazio!
import java.util.Scanner;

void main() {
    Scanner input = new Scanner(System.in);
    String cep, rua, numeroCasa, bairro;
    BuscaCEP buscar = new BuscaCEP();
    System.out.print("Digite o CEP para consultar: ");
    cep = input.nextLine();
    try {
        //aqui eu crio o objeto endereço que já é criado usando a class BuscaCEP onde realiza a consulta e já cria o endereço como deve ser
        Endereco endereco = buscar.consultarEndereco(cep);
        while (true) {
            //verifico se o retorno json veio com a rua nula, ou vazia a peço ao usuário para preencher tudo que o buscador não preencheu
            if (endereco.getRua() == null || endereco.getRua().isBlank()) {

                System.out.printf("Cidade: %s", endereco.getCidade());

                System.out.print("\nRua: ");
                rua = input.nextLine();

                System.out.print("Bairro: ");
                bairro = input.nextLine();

                System.out.print("Número: ");
                numeroCasa = input.nextLine();
                //uso um dos setters que criei para mudar os campos que o clinte alterar, no caso de uma cidade com um cep único
                endereco.setEndereco(rua, bairro, numeroCasa);

            } else {

                System.out.print(endereco.getEndereco());

                System.out.print("\nN°: ");
                // se o reterno do json retorna uma rua preenchida aqui peço o número da casa
                numeroCasa = input.nextLine();

                endereco.setNumeroCasa(numeroCasa);
            }
            //Mostro o endereço completo e peço para o usuário/cliente confirmar seu endereço
            System.out.printf("\nEndereço:\n%s", endereco.getEndereco());

            System.out.print(
                    "\nConfirmar endereço?\n1 - Sim\n2 - Não\nOpção: "
            );

            int confirmarEndereco =
                    Integer.parseInt(input.nextLine().trim());

            if (confirmarEndereco == 1) {
                System.out.println("Endereço confirmado!");
                break;
            }

            if (confirmarEndereco != 2) {
                System.out.println("Opção inválida!");
                continue;
            }

            System.out.print("""
                    Informe a opção incorreta:
                    1 - CEP
                    2 - RUA
                    Opção:
                    """);

            int opcaoIncorreta =
                    Integer.parseInt(input.nextLine().trim());

            if (opcaoIncorreta == 1) {

                System.out.print("Digite um novo CEP para consultar: ");
                cep = input.nextLine();

                endereco = buscar.consultarEndereco(cep);

            } else if (opcaoIncorreta == 2) {

                System.out.print("Digite o nome da rua: ");
                rua = input.nextLine();

                endereco.setRua(rua);

            } else {
                System.out.println("Opção inválida!");
            }
        }
} catch (RuntimeException e) {
        System.out.print("Erro: " + e.getMessage());
    }
}