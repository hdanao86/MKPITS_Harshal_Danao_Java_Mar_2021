//WAP TO ACCEPT A CHARACTER FROM THE USER AND PRINT WHETHER IT IS VOWEL OR NOT.
//USING SWITCH CASE.
import java.util.*;
public class SwitchVowel {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char ch;
        System.out.println("enter any character ");
        ch = sc.next().charAt(0);
        switch (ch)
        {
            case 'a' :
                System.out.println("vowel");
                break;
            case 'e' :
                System.out.println("vowel");
                break;
            case 'i' :
                System.out.println("vowel");
                break;
            case 'o' :
                System.out.println("vowel");
                break;
            case 'u' :
                System.out.println("it is vowel");
                break;
            default:
                System.out.println("Its is not vowel");
        }

    }
}
