package Controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import View.Interface;

public class Application {

    private Scanner scanner;

    public Application() {
        scanner = new Scanner(System.in);
        run();
        scanner.close();
    }

    private boolean finishApplication() {
        while (true) {
            Interface.msgFinishApplication();
            String input = scanner.nextLine().trim().toUpperCase();
            if (input.equals("Y")) {
                Interface.msgfinishedProgram();
                return true;
            } else if (input.equals("N")) {
                return false;
            } else {
                Interface.msgInvalidInput(input);
            }
        }
    }

    // Calls the printNumbers method to process the provided numbers.
    // The loop continues until the finishApplication method returns true.
    // Chama o método printNumbers para processar os números fornecidos. 
    // O loop continua até que o método finishApplication retorne true.
    private void run() {
        boolean continueApp = true;
        while (continueApp) {
            int numberOne = 0;
            int numberTwo = 0;

            try {
                Interface.msgRequestNumber(1);
                numberOne = scanner.nextInt();
                scanner.nextLine();

                Interface.msgRequestNumber(2);
                numberTwo = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                Interface.msgInvalidInput();
                scanner.nextLine();
                continue; // Restart the loop
            }

            try {
                printNumbers(numberOne, numberTwo);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                continue;
            }
            continueApp = !finishApplication();
        }
    }

    private void printNumbers(int numberOne, int numberTwo) throws IllegalArgumentException {
        if (numberOne > numberTwo)
            throw new IllegalArgumentException(Interface.msgSecondGreaterThanFirst());
        else if(numberOne == numberTwo) {
            Interface.msgPrintingNumber();
        }
        int value = numberTwo - numberOne;
        for (int i = 1; i <= value; i++) {
            Interface.msgPrintingNumber(i);
        }
    }
}
