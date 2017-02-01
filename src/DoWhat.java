/**
 * Created by jeffbrinkley on 2/1/17.
 */
public class DoWhat {

    int selection;
    double withdrawAmount;
    String selectionName;
    double newBalance;

        //customer enters ATM option to perform
    public void enterOption() throws Exception {
        System.out.println("What would you like to do?");
        System.out.println("Type 1 for balance check.");
        System.out.println("Type 2 for withdraw funds.");
        System.out.println("Type 3 for cancel.");

        selection = ATM.scanner.nextInt();

        if (selection == 1) {
            selectionName = "Balance Check";
        } else if (selection == 2) {
            selectionName = "Withdraw Funds";
        }
        else if (selection == 3) {
            selectionName = "Cancel";
        }
        System.out.println("You have selected " + selectionName);

        switch (selection) {
            case 1:
                System.out.println("Your balance is $100");
                break;
            case 2:
                System.out.println("How much money would you like to withdraw?");
                withdrawAmount = ATM.scanner.nextInt();

                if (withdrawAmount > 100) {
                    throw new Exception("You cannot withdraw more than your available balance!");
                } else if ((withdrawAmount <= 100) && (withdrawAmount > 0)) {
                    System.out.println("You may take your money.");
                    newBalance = 100 - withdrawAmount;
                    System.out.println("Your new account balance is $" + newBalance);
                    System.out.println("Have a nice day!");
                }
                break;
            case 3:
                System.out.println("Have a nice day.");
                break;
            default:
                throw new Exception("That is not a valid entry!");
        }
    }
}
