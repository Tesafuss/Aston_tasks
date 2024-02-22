import java.util.Scanner;

public class Task1
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое целое число a =");
        int a = in.nextInt();
        System.out.println("Введите второе целое число b =");
        int b = in.nextInt();
        multitask(a, b);
    }

    static void multitask(int a, int b){
        if(a > b){
            System.out.println("a > b");
        }else if(a < b){
            System.out.println("a < b");
        }else{
            System.out.println("a = b");
        }

        int sum = a + b;
        int sub = a - b;
        int mult = a * b;
        int div = a / b;
        System.out.println("a + b = " + sum);
        System.out.println("a - b = " + sub);
        System.out.println("a / b = " + div);
        System.out.println("a * b = " + mult);
    }
}