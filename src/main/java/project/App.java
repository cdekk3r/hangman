package project;

import java.util.Scanner;

public class App {
    private final Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

    private void run() {

        printMainMenu();
        int mainMenuSelection = promptForMenuSelection("Please choose an option: ");
        while(true) {
            // Main menu loop
            
            if(mainMenuSelection == 1) {
                    String spaces = createSpaces();
                    String word = generateWord();
                    System.out.println(spaces);
                    int count = word.length();

                    String letterSelection = promptForLetterSelection("Guess a letter: ");

                    if(word.indexOf(letterSelection) == -1) {
                        count--;
                        if(count == 0) {
                            System.out.println("Game Over! The word was " + word);
                            printMainMenu();
                        }
                        System.out.println("Wrong! " + count + " guesses left!");
                    } else {

                        System.out.println("Correct! Guess again.");
                        String updatedSpaces = "";

                        for(int i = 0; i<word.length(); i++) {
                            if(word.charAt(i) == letterSelection.charAt(0)) {
                                updatedSpaces += letterSelection;
                            } else {
                                updatedSpaces += "__ ";
                            }
                        }
                        spaces = updatedSpaces;
                    }
            }
            else if (mainMenuSelection == 0){
                break;
            }
        }

    }

    private void printMainMenu() {
        System.out.println("1: New Game");
        System.out.println("0: Exit");
        System.out.println();
    }

    private int promptForMenuSelection(String prompt) {
        System.out.print(prompt);
        int menuSelection;
        try {
            menuSelection = Integer.parseInt(keyboard.nextLine());
        } catch (NumberFormatException e){
            menuSelection = -1;
        }
        return menuSelection;
    }

    private String promptForLetterSelection(String prompt) {
        System.out.print(prompt);
        String letterSelection;
        // try {
            letterSelection = keyboard.nextLine();
        // } 
        // catch (NumberFormatException e) {
        //     letterSelection = -1;
        // }
        return letterSelection;
    }

    private String generateWord() {
        return "happy";
    }

    private String createSpaces() {
        String word = generateWord();
        int length = word.length();
        String spaces = "";
        while(length > 0) {
            spaces += "__ ";
            length--;
        }
        return spaces;
    }

}