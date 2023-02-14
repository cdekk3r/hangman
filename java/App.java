import java.util.Scanner;

public class App {
    private final Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

    private void run() {
        while(true) {
            // Main menu loop
            printMainMenu();
            int mainMenuSelection = promptForMenuSelection("Please choose an option: ");
            if(mainMenuSelection == 1) {
                System.out.println("All competitions here");
            }
            else if (mainMenuSelection == 2){
                System.out.println("All teams here");
            }
            else if (mainMenuSelection == 0){
                break;
            }
        }

    }

    private void printMainMenu() {
        System.out.println("1: Competitions");
        System.out.println("2: Teams");
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


}