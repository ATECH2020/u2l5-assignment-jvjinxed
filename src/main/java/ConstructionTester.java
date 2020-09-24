import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double taxRate;
        int lumberCost = 8;
        int windowCost = 11;
        int numBoards;
        int numWindows;
        double total;

        System.out.println("Enter the sales tax rate:");
        taxRate = in.nextDouble();
        
        System.out.println("How many boards do you need?");
        numBoards = in.nextInt();

        System.out.println("How many windows do you need?");
        numWindows = in.nextInt();

        Construction machine = new Construction(lumberCost, windowCost, taxRate);

        total = machine.lumberCost(numBoards) + machine.windowCost(numWindows);

        System.out.println("Total: " + total);

        System.out.print("Grand Total: " + machine.grandTotal(total));
    }
}