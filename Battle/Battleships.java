package Battle;

public class Battleships {

    private Display display;
    private Game game = new Game();
    private Input input;

    public Battleships(){
        display = new Display();}
        
        public void start(){
        
        display.printMenu();
        mainMenu();

    }

    private void mainMenu() {
        int choice;
        boolean exit = false;
        input = new Input();

        while(!exit){
            display.printMainMenuOptions();
            System.out.println("Enter your choice");
            System.out.println();
            choice = input.getIntegerMenuOption();
            switch (choice){
                case 0:
                    display.printMessages("you choose to play");
                    game.gameLogic();

                    break;
                case 1:
                    System.out.flush();
                    display.gameRules();
                    break;
                case 2:
                    display.printMessages("you choose to exit");
                    ExitGame();
                    break;
            }
        }
    }
    public void ExitGame(){
        display.printExitMessage();
    }

}
