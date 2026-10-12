package ConditionStatement.SwitchCase;
import java.util.*;
public class Basic {
    public static void main(String[] args) {
        // int number=2;

        // switch(number){
        //     case 1:
        //         System.out.println("One");
        //         break;
        //     case 2:
        //         System.out.println("Two");
        //         break;
        //     case 3:
        //         System.out.println("Three");
        //         break;
        //     default:
        //         System.out.println("Other");
        // }


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Character");
        char ch=sc.next().charAt(0);

        switch(ch){
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
    }
}
