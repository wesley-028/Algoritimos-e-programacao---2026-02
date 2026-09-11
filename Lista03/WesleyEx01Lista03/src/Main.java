import java.util.Scanner;

void main(){
    Scanner input = new Scanner(System.in);
    System.out.print("Digite o número para calcular a função! f(x): ");
    double x = input.nextDouble();
    if (x <= 1){
        System.out.printf("f(%.2f) = 1", x);
    } else if (x > 1 && x <= 2) {
        System.out.printf("f(%.2f) = 2", x);
    } else if (x > 2 && x <= 3) {
        System.out.printf("f(%.2f) = %.2f", x, x * x);
    }else{
        System.out.printf("f(%.2f) = %.2f", x, x * x * x);
    }
}
