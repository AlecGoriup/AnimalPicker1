import java.util.Scanner;

public class AnimalPicker1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String animalChoice;

        System.out.println("Which animal would you like to see: a dog or a cat");

        animalChoice = input.nextLine();

        if (animalChoice.equals("dog")) {
            System.out.println("  __      _\no\'\')}____//\n `_/      )\n (_(_/-(_/");

        } else if (animalChoice.equals("cat")) {
            System.out.println("  ^~^  ,\n (\'Y\') )\n /   \\/ \n(\\|||/)");

        }

    }
}