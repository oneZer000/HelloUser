import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = in.nextLine();
        System.out.printf("Привет, %s!", name);
    }
}
