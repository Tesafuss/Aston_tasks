import java.util.Scanner;

public class Task2
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первую строку:");
        String a = in.nextLine();
        System.out.println("Введите вторую строку:");
        String b = in.nextLine();
        compareStrins(a, b);
    }

    static void compareStrins(String a, String b){
        if(a.equals(b)){
            System.out.println("Строки идентичны");
        }else{
            System.out.println("Строки неидентичны");
        }
    }
}