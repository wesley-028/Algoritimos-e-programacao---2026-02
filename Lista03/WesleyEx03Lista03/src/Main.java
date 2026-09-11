/// 1 ML = 20 gotas = 500mg
/// 1 gota = 25mg
/// conta para quantidade de gotas = mg / 25
import java.util.Scanner;

void main(){
    Scanner input = new Scanner(System.in);
    int idade, dosagem; double massaCorporea;
    System.out.print("Massa corpórea(Kg) do paciente: ");
    massaCorporea = input.nextDouble();
    System.out.print("Idade do paciente: ");
    idade = input.nextInt();
    if (idade >= 12 && massaCorporea >= 60){
        System.out.printf("Idade: %d anos\nMassa corpórea: %.0fkg\nDosagem para este paciente: 1000mg, 40 Gotas", idade, massaCorporea);
    } else if (idade >= 12 && massaCorporea < 60) {
        dosagem = 875;
        System.out.printf("Idade: %d anos\nMassa corpórea: %.0fkg\nDosagem para este paciente: %dmg, %d Gotas", idade, massaCorporea, dosagem, dosagem / 25);

    } else if (idade < 12 && massaCorporea > 30) {
        dosagem = 750;
        System.out.printf("Idade: %d anos\nMassa corpórea: %.0fkg\nDosagem para este paciente: %dmg, %d Gotas", idade, massaCorporea, dosagem, dosagem / 25);

    } else if (idade < 12 && massaCorporea > 24) {
        dosagem = 500;
        System.out.printf("Idade: %d anos\nMassa corpórea: %.0fkg\nDosagem para este paciente: %dmg, %d Gotas", idade, massaCorporea, dosagem, dosagem / 25);
    } else if (idade < 12 && massaCorporea > 16) {
        dosagem = 375;
        System.out.printf("Idade: %d anos\nMassa corpórea: %.0fkg\nDosagem para este paciente: %dmg, %d Gotas", idade, massaCorporea, dosagem, dosagem / 25);
    } else if (idade < 12 && massaCorporea > 9) {
        dosagem = 250;
        System.out.printf("Idade: %d anos\nMassa corpórea: %.0fkg\nDosagem para este paciente: %dmg, %d Gotas", idade, massaCorporea, dosagem, dosagem / 25);
    }else {
        dosagem = 125;
        System.out.printf("Idade: %d anos\nMassa corpórea: %.0fkg\nDosagem para este paciente: %dmg, %d Gotas", idade, massaCorporea, dosagem, dosagem / 25);
    }

}