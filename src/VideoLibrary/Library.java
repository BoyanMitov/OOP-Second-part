package VideoLibrary;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Tape dieHard = new Tape("Die Hard One", "action", 1996, "18.02.2018", "20.02.2018", 1, true);
        Tape dieHard2 = new Tape("Die Hard Two", "action", 1998, "20.03.2019", "", 2, false);
        Tape prettyWoman = new Tape("Pretty Woman", "drama", 1999, "13.08.2017", "18.08.2017", 3, true);
        Tape showshank = new Tape("Showshank", "drama ", 2001, "", "", 4, false);
        Tape troy = new Tape("Troy", "action,drama", 2003, "20.03.2019", "24.03.2019", 5, true);


        while (true) {
            Accounts accounts = new Accounts();
            accounts.accountInformation();

            System.out.println("=============Available tapes=============");
            dieHard.availableTapes();
            dieHard2.availableTapes();
            prettyWoman.availableTapes();
            showshank.availableTapes();
            troy.availableTapes();

            System.out.println("Enter the number of free tape: ");
            switch (input.nextInt()) {
                case 1:
                    System.out.println("Tape number 1:");
                    dieHard.availableTapes();
                    System.out.println("Your choose is tape number 1.");
                    break;
                case 2:
                    System.out.println("Tape number 2:");
                    dieHard2.availableTapes();
                    System.out.println("Your choose is tape number 2.");
                    break;
                case 3:
                    System.out.println("Tape number 3:");
                    prettyWoman.availableTapes();
                    System.out.println("Your choose is tape number 3.");
                    break;
                case 4:
                    System.out.println("Tape Number 4:");
                    showshank.availableTapes();
                    System.out.println("Your choose is tape number 4.");
                    break;
                case 5:
                    System.out.println("Tape Number 5:");
                    troy.availableTapes();
                    System.out.println("Your choose is tape number 5.");
                    break;
            }
        }


    }
}

