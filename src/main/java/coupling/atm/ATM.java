package coupling.atm;

public class ATM {
    private String state;
    // ...
    public void serviceCustomers() {
        // ...
        while (state.equals("RUNNING")) {
            int readerStatus = CardReader.NO_CARD;
            // ...
        }
    }
}
