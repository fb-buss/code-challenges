package View;

public class Interface {

    public static void msgRequestNumber(int number) {
        System.out.printf("\nEnter the %dº number: ", number);
    }

    public static void msgFinishApplication() {
        System.out.print("\nFinish the program? -> [[Y]es] [[N]o]: ");
    }

    public static void msgfinishedProgram() {
        System.out.println("\nProgram finished successfully\n");
    }

    private static String invalidInput() {
        return "Invalid input. Please enter ";
    }

    public static void msgInvalidInput() {
        System.out.println(invalidInput() + "a number.");
    }

    public static void msgInvalidInput(String yesOrNo) {
        System.out.println(invalidInput() + "Yes or No.");
    }

    public static void msgPrintingNumber() {
        System.out.println("Printing number 0");
    }

    public static void msgPrintingNumber(int number) {
        System.out.println("Printing number " + number);
    }

    public static String msgSecondGreaterThanFirst() {
        return "The second parameter must be greater than the first.";
    }
}
