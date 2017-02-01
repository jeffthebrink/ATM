import java.util.Scanner;

public class ATM {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        //welcome message
        System.out.println("Hello, and welcome to the ATM.");


        NamePrompt namePrompt = new NamePrompt();
        DoWhat doWhat = new DoWhat();

        //prompt for name If I enter nothing, throw an exception
        namePrompt.enterName();

        //Prompt me for what I would like to do
        //1. Check my balance, 2. Withdraw Funds or 3. Cancel
        doWhat.enterOption();
    }

}
