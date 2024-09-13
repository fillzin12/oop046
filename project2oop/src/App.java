import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String[] levelmember = { "Silver", "Gold", "Platinum" };

        System.out.print("Type your Member name: ");
        String name = scanner.nextLine();

        System.out.println("Chose your Member level");
        for (int i = 0; i < levelmember.length; i++) {
            System.out.println((i) + ": " + levelmember[i]);
        }
        
        System.out.print("Chose your Member level: ");
        int level = scanner.nextInt();

        System.out.println("Enter your price: ");
        double price = scanner.nextDouble();
        scanner.close();

        if (level == 2) {
            Member Platinum = new Platinum(name, price);
            System.out.println("Platinum info");
            Platinum.display();
        }
        if (level == 1) {
            Member Gold = new Gold(name, price);
            System.out.println("Gold info");
            Gold.display();
        }
        if (level == 0) {
            Member Silver = new Silver(name, price);
            System.out.println("Silver info");
            Silver.display();
        }
    }
}
