package UNIT_1;

//Step 2 Continues
public class UserDefinedException {
    public void validate(int age) throws InvalidAgeException {
        if(age<18){
            throw new InvalidAgeException("Not eligible to vote,Age less than 18...");

        }else{
            System.out.println("Eligible to vote...");
        }
    }
}
