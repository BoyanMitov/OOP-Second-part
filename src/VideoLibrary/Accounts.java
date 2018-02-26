package VideoLibrary;
import java.util.Date;
import java.util.Scanner;

public class Accounts extends Tape {
    private String firstName;
    private String familyName;
    private byte yearOfBirth;
    private int accountNumber = 1;
    private java.util.Date dateCreated;
    Scanner input = new Scanner(System.in);

    public Accounts() {
        System.out.println("Enter your first name: ");
        this.firstName = input.nextLine();
        System.out.println("Enter your family name: ");
        this.familyName = input.nextLine();
        System.out.println("Enter your age: ");
        this.yearOfBirth = input.nextByte();
        this.dateCreated = new java.util.Date();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public byte getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(byte yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void accountInformation() {
        String s = " ";
        s += "\nFirst Name: " + firstName;
        s += "\nLast Name: " + familyName;
        s += "\nAge: " + yearOfBirth;
        s += "\nYour account number: " + accountNumber++;
        if (yearOfBirth >= 18) {
            System.out.println("You can take porn tapes, but find a girl dude!");
        } else
            System.out.println("You are under 18 you can`t take porn tapes, use internet if you want to beat the meat!");
        s += "\nDate account created: " + dateCreated;
        s += "\n -----------------------------------";
        System.out.println("=============Account information=============");
        System.out.println(s);
    }
}
