package Battle;

public class Display {
    public void printMenu(){
        System.out.println("Battleships is starting.......");
        System.out.println("\n"+" # #  ( )\n" +
                "                                  ___#_#___|__\n" +
                "                              _  |____________|  _\n" +
                "                       _=====| | |            | | |==== _\n" +
                "                 =====| |.---------------------------. | |====\n" +
                "   <--------------------'   .  .  .  .  .  .  .  .   '--------------/\n" +
                "     \\                                                             /\n" +
                "      \\_______________________________________________WWS_________/\n" +
                "  wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww\n" +
                "wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww\n" +
                "   wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww \n" +
                "\n" +
                "\n");
    }
    public void printMessages (String message){
        System.out.println(message);
    }

    public void printMainMenuOptions(){
        System.out.println("press: \n"+
                 "\t 0 - play\n"+
                "\t 1 - print game rules \n"+
                "\t 2 - Exit\n");
    }

    public void printExitMessage(){
        System.out.println("Have a nice day");
    }

    public void gameRules(){
        System.out.println("the rules");
    }
    public void  printBoard (Board board){
        System.out.println("   ");
        for (int i = 0; i < board.getSizeX(); i++) {
            if (1<10){
                System.out.println(i+ "  ");

            }else {
                System.out.println(i+ " ");
            }

        }
        System.out.println();
        for (int row = 0; row < board.getSizeX(); row++) {
            if (row<10){
                System.out.println(row+ "  ");

            }else {
                System.out.println(row+ " ");

            }
            for (int col = 0; col < board.getSizeY(); col++) {
                switch (board.getSquare(row,col).getCharacter()){
                    case '0':
                        System.out.println(" 0 ");
                        break;
                    case 'H':
                        System.out.println("X");
                    case 'S':
                        System.out.println("S" );
                    case 'M'  :
                        System.out.println("M");

                }
            }
            System.out.println();


        }

        }
    }



