import java.util.Scanner;
void main() {
    Scanner input = new Scanner(System.in);
    int temperatura, tempAcimaDeTrinta, count, somaTemperaturas;
    temperatura = 0;
    tempAcimaDeTrinta = 0;
    count = 0;
    somaTemperaturas=0;
    while(temperatura!= -111){
        System.out.print("Temperatura: ");
        temperatura = input.nextInt();
        count++;
        somaTemperaturas+=temperatura;
        if (temperatura > 30){
            tempAcimaDeTrinta++;
        }
    }
    System.out.printf("Temperatura média do dia: %d°\nTemperatura acida de 30° foi registrada ao menos %d vezes!", (somaTemperaturas+111)/(count-1), tempAcimaDeTrinta);


}