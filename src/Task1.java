import java.util.Scanner;

public class Task1 {
    public static void main() {
        Scanner scan = new Scanner(System.in);
        String enteredWord;
        System.out.println("Enter word to see if palindrome.");
        enteredWord=scan.nextLine();
        String enteredWord2="";

        for(int i=enteredWord.length(); i>0; i--){
            enteredWord2 += enteredWord.substring(i-1,i);
        }
        if(enteredWord.equalsIgnoreCase(enteredWord2)){
            System.out.println("You got a palindrome!");
        }else{
            System.out.println(enteredWord2+" is not a panlindrome to "+ enteredWord);
        }
    }
}