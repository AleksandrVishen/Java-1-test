import java.util.Scanner;

public class KeyboardInput {
   public static void main(String[] args) {
        System.out.println("Введите имя: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        
        System.out.println("Привет, " + name + "!");
    }
}
