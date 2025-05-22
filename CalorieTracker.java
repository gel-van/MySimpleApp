import java.util.Scanner;

public class CalorieTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("         ------- Calorie Tracker --------");
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("------- Food Calories Reference Table -------");
        System.out.printf("%-20s%s\n", "Food", "Calories");
        System.out.printf("%-20s%s\n", "Eggs", "155");
        System.out.printf("%-20s%s\n", "Oatmeal", "150");
        System.out.printf("%-20s%s\n", "Chicken Breast", "165");
        System.out.printf("%-20s%s\n", "Salad", "100");
        System.out.printf("%-20s%s\n", "Rice (1 cup)", "205");
        System.out.printf("%-20s%s\n", "Banana", "89");
        System.out.printf("%-20s%s\n", "Apple", "95");
        System.out.printf("%-20s%s\n", "Bread (1 slice)", "80");

        System.out.println();
        System.out.printf("%23s\n", "Meal Type");
        String[] mealType = {"Braekfast", "Lunch", "Dinner"};
        for (String meal : mealType) {
            System.out.println(meal);
        }

        System.out.println();

        System.out.println("Breakfast");
        System.out.print("Food: ");
        String breakfast = scanner.nextLine();
        System.out.print("calories: ");
        double calories1 = scanner.nextDouble();
        scanner.nextLine(); // consume leftover newline

        System.out.println();

        System.out.println("Lunch");
        System.out.print("Food: ");
        String lunch = scanner.nextLine();
        System.out.print("calories: ");
        double calories2 = scanner.nextDouble();
        scanner.nextLine(); // consume leftover newline

        System.out.println();

        System.out.println("Dinner");
        System.out.print("Food: ");
        String dinner = scanner.nextLine();
        System.out.print("calories: ");
        double calories3 = scanner.nextDouble();

        double total = calories1 + calories2 + calories3;

        System.out.println();
        System.out.println("Calories Table");
        System.out.println("----------------------------------------");
        System.out.printf("%-12s%-20s%s\n", "Meal", "Food", "Calories");
        System.out.println("----------------------------------------");
        System.out.printf("%-12s%-20s%.2f\n", "Breakfast", breakfast, calories1);
        System.out.printf("%-12s%-20s%.2f\n", "Lunch", lunch, calories2);
        System.out.printf("%-12s%-20s%.2f\n", "Dinner", dinner, calories3);
        System.out.println("----------------------------------------");
        System.out.printf("%-32s%.2f\n", "total calories", total);
        System.out.println();

        System.out.printf("You consumed %.2f calories today.\n", total);
    }
}
