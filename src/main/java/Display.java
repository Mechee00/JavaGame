import static java.lang.System.out;

public class Display {

    public static void errorMessage(int menuType) {
        switch (menuType) {
            case 0: // Main Menu
                out.println("\n!!! ERROR !!! Option not available, please choose again. !!! ERROR !!!");
                out.print(">  Please enter the alphabet of your desired game: ");
                return;
            case 1: // Hangman
                out.println("!!! ERROR !!! Illegal character, please enter a letter from {a-z} only. !!! ERROR !!!");
                return;
            case 2: // Scissor Rock Paper
                out.println("!!! ERROR !!! Option not available, please enter {0}, {1}, or {2} only. !!! ERROR !!!");
                return;
            case 3: // Tic-Tac-Toe
                out.println("\n\n!!! ERROR !!! Illegal input detected. Please enter value {1-9} only. !!! ERROR !!!");
                return;
            case 4: // Flip and Match
                out.println("\n\n!!! ERROR !!! Invalid input. Please enter value {1-20} only.         !!! ERROR !!!");
                return;
            case 5: // Five Dice
                return;
            case 6: // Unexpected Error Occured
                out.println("\n!!! ERROR !!! Unexpected event occured. Program will go to main menu. !!! ERROR !!!\n");
                return;
            case 7: // Continue Game?
                out.println("\n!!! ERROR !!! Option not available, please choose again. !!! ERROR !!!");
                out.print(">  Please enter {Y} or {y} for Yes and {N} or {n}: ");
                return;
            case 11:
                out.println("!!! ERROR !!! You have guessed this letter, please choose letter. !!! ERROR !!!");
                return;
            case 31:
                out.println(
                        "\n\n!!! ERROR !!! Number already taken, please select form the avalable table. !!! ERROR !!!");
                return;
            case 41:
                out.println(
                        "\n\n!!! ERROR !!! Number already taken, please select form the avalable table. !!! ERROR !!!");
                return;
            default:
                out.println("!!! ERROR !!! Unexpected input detected. !!! ERROR !!!");
                return;
        }
    }

    public static void gameOver() {

        switch (Input.getGameOption()) {
            case 'a':
                out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
                if (Game.getResult() == 1) { // If the user won
                    if (Game.getResult() == 0) {
                        out.println("+++   Awesome! You didn't even miss a letter!             +++\n");
                    } else if (Game.getResult() == 1) {
                        out.println("+++   Great Job! You missed just once!                    +++\n");
                    } else {
                        out.println(
                                "+++   Well Done! Too bad you missed " + Game.getResult()
                                        + " times.              +++\n");
                    }
                } else { // If the user lose
                    out.println("+++   Opps, the word is: " + Game.getHangmanWord());
                    out.println("+++   Better luck next time!\n");
                }
                out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
                break;
            case 'c':
                out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
                if (Game.getResult() == 0) { // If the game is a tie
                    out.println("+++   What a great match! It is a tie!                    +++\n");
                } else if (Game.getResult() == 1) { // If the computer won
                    out.println("+++   Too bad, the Computer Wins!                         +++\n");
                } else if (Game.getResult() == 2) { // If the player won
                    out.println("+++   Congratulations! You are smarter than the computer! +++\n");
                }
                out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
                break;
            default:
                break;
        }

        out.println(">>>                       GAME OVER                       <<< ");
        out.println(">>>                     Continue? Y/N                     <<< ");
        out.print(">>> ");
        return;
    }

    public static void mainMenu() {
        out.println("+++++++++++++++++++++++++++++++++++++++++\n");
        out.println("              Java Games");
        out.println("\n+++++++++++++++++++++++++++++++++++++++++\n");
        out.println(">----------------------------------------");
        out.println(">  Options   |  Description");
        out.println(">----------------------------------------");
        out.println(">     A      |  Hangman");
        out.println(">     B      |  Scissor, Rock, Paper");
        out.println(">     C      |  Tic-Tac-Toe");
        out.println(">     D      |  Flip and Match");
        out.println(">     E      |  Five Dice");
        out.println(">----------------------------------------");
        out.print(">  Please enter the alphabet of your desired game: ");
        return;
    }

    public static void hangman() {
        out.println("\n\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        out.println("+++             Welcome to the Hangman Game!             ++++");
        out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        out.println("++++++++++++++++++++++++   Rule   +++++++++++++++++++++++++++");
        out.println("+++   1. You are given a random word wintin 10 letters    +++");
        out.println("+++   2. You have 10 chances to guess all the letters     +++");
        out.println("+++   3. Only one letter is allowed for each guess        +++");
        out.println("+++   4. All letters are in small capital                 +++");
        out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        return;
    }

    public static void scissorRockPaper() {
        out.println("\n\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        out.println("+++       Welcome to the Scissor Paper Rock Game!        ++++");
        out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        out.println("++++++++++++++++++++++++   Rule   +++++++++++++++++++++++++++");
        out.println("++++++++++   Digit   +++++++++++++++   Represents   +++++++++");
        out.println("+++            0            |          Scissor            +++");
        out.println("+++            1            |          Rock               +++");
        out.println("+++            2            |          Paper              +++");
        out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        return;
    }

    public static void ticTacToe() {
        out.println("\n\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        out.println("+++           Welcome to the Tic-Tac-Toe Game!           ++++");
        out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        out.println("++++++++++++++++++++++++   Rule   +++++++++++++++++++++++++++");
        out.println("+++   1. Select a number (1-9) to place your symbol       +++");
        out.println("+++   2. Form a straight line with 3 matching symbol      +++");
        out.println("+++   3. Horizontal, Vertical, and diagonal lines         +++");
        out.println("+++      accepted                                         +++");
        out.println("+++   4. Player will be represented by 'X'                +++");
        out.println("+++   4. Computer will be represented by 'O'              +++");
        out.println("+++                                                       +++");
        out.println("+++                   Numbering Diagram                   +++");
        out.println("+++                      1 | 2 | 3                        +++");
        out.println("+++                     ---|---|---                       +++");
        out.println("+++                      4 | 5 | 6                        +++");
        out.println("+++                     ---|---|---                       +++");
        out.println("+++                      8 | 7 | 9                        +++");
        out.println("+++                                                       +++");
        out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        return;
    }

}
