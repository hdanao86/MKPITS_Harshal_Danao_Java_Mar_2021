//Let's see a simple example of java custom exception.

class InvalidAgeException extends Exception{
    InvalidAgeException(String  s){
        super(s);
    }
}
public class CustomExceptionex1 {
    static void validate(int age)throws InvalidAgeException{
        if(age<18)
            throw new InvalidAgeException("age not valid");
        else
            System.out.println("welcome to vote");
    }

    public static void main(String[] args) {
        try {
            validate(20);
        }catch (Exception e)
        {
            System.out.println("exception occurs : " + e );
        }
        System.out.println("rest of the code...");
    }
}
