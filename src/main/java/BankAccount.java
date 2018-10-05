import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;

    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        accountType = accountCategory;
        ownerName = name;
        Bank.totalAccounts++;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String str) {
        ownerName = str;
    }

    public BankAccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(BankAccountType bat) {
        accountType = bat;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double ab) {
        accountBalance = ab;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double ir) {
        interestRate = ir;
    }

    public double getInterestEarned() {
        return interestEarned;
    }

    public void setInterestEarned(double ie) {
        interestEarned = ie;
    }
}
