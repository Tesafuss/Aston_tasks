import java.util.Scanner;

public class Sukhin_Java11 {
    public static void main(String[] args) {
    System.out.println("Задание 2.1:");
    compareInt();
    System.out.println();

    System.out.println("Задание 2.2:");
    compareStrins();
    System.out.println();

    System.out.println("Задание 2.3:");
    isEven();
    System.out.println();
    }

    static void compareInt(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое целое число a =");
        int a = in.nextInt();
        System.out.println("Введите второе целое число b =");
        int b = in.nextInt();

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

    static void compareStrins(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первую строку:");
        String a = in.nextLine();
        System.out.println("Введите вторую строку:");
        String b = in.nextLine();

        if(a.equals(b)){
            System.out.println("Строки идентичны");
        }else{
            System.out.println("Строки неидентичны");
        }
    }

    static void isEven(){
        int[] arr = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String result = "";
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                String str1 = Integer.toString(arr[i]);
                result = String.join(" ", result, str1);
            }
        }
        System.out.println(result.substring( 1));
    }
}
