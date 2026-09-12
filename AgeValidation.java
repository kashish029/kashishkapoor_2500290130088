import java.util.Scanner;
public class AgeValidation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(x: "Enter age");
        int a=sc.nextInt();
        try{
            checkAge(a);
        } catch(AgeInvalidException a){
            System.out.println(a);
        } finally{
            sc.close();
        }

    }
    static void checkAge(int age) throws AgeInvalidException{
        if(age<18) 
            throw new AgeInvalidException("Age is not valid to vote");
        System.out.println(x: "Eligible is vote");
    }
}
class AgeInvalidException extends Exception{
    AgeInvalidException(String msg){
        super(msg);
    }
}