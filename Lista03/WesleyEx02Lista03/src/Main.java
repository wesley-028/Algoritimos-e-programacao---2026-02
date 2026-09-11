import java.util.Scanner;
void main(){
    //Formula equação 2° = ax²+bx+c=0
    //Delta = b²-4ac
    //Bhaskara = -b +-RaizDelta / 2.a

    double a,b,c,delta,x1,x2, raizDelta;
    Scanner input = new Scanner(System.in);
    System.out.print("Cálculo de raízes em uma equação de segundo grau!\nCom a seguinte forma: ax² +bx + c = 0");
    System.out.print("\nDigite o coeficiente a: ");
    a = input.nextDouble();
    if (a != 0){
        System.out.print("Digite o coeficiente b: ");
        b = input.nextDouble();
        System.out.print("Digite o coeficiente c: ");
        c = input.nextDouble();
        delta = (b * b) - 4 * a * c;
        System.out.printf("Temos: %.1fx² %+.1fx %+.1f = 0", a, b, c);
        if (delta == 0 ){
            x1 = -b / (2 * a);
            System.out.printf("\nA equação tem duas raízes reais iguais: x¹ = x² = %.2f", x1);
        } else if (delta > 0) {
            raizDelta = Math.pow(delta, 0.5);
            x1 = (-b + raizDelta) / (2 * a);
            x2 = (-b - raizDelta) / (2 * a);
            System.out.printf("\nEquação resolvida!\nx¹ = %.2f | x² = %.2f", x1, x2);
        }else {
            System.out.printf("\nNão existem raízes reais!\nDelta: %.2f", delta);
        }

    }else {
        System.out.print("Operação inválida!\n(a) não pode ser igual a zero");
    }

}