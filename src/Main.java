import java.lang.reflect.Array;

public class Main {
    public static void main (String[]args){
        String string1="Hello";
        String string2="How are you?";
        String firstTwoWord=string1.substring(0,2) ;
        String lastTwoWord=string2.substring(string2.length()-2);
        String charArray = firstTwoWord+lastTwoWord;
        System.out.println(charArray);
    }
}
