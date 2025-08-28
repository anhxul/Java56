public class MyATM {
    public static void main(String[] args) {
        UserCreatedBalanceException UBE = new UserCreatedBalanceException();
        try {
            UBE.validate(5000);   // valid debit
            UBE.validate(12000);  // should throw exception
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}