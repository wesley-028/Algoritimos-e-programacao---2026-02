public class Main {
    public static void main(String[] args){
        int a,b, temp;
        a = 9;
        b = 10;
        temp = a;
        System.out.printf("A --> %d\nB --> %d\n", a,b);
        a = b;
        b = temp;
        System.out.println("\n///////////");
        System.out.printf("\nA --> %d\nB --> %d", a, temp);
    }
}