/**
 * Created by jeffbrinkley on 2/1/17.
 */
public class NamePrompt {
    String name;

    //enter the customer name, use scanner from library
    void enterName() {
        System.out.println("Please enter your first name.");
        name = ATM.scanner.nextLine();
        System.out.println("Welcome, " + name + "!");

    }


}
