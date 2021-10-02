import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of products: ");

        System.out.println("Product #1 data:");
        System.out.print("Common, used or imported (c/u/i)? ");
        System.out.print("Name: ");
        System.out.print("Price: ");
        System.out.print("Customs fee: ");
        System.out.print("Manufacture date (DD/MM/YYYY): ");

        System.out.println();
        System.out.println("PRICE TAGS:");

        input.close();
    }
}
