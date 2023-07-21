import java.io.CharArrayReader;
import java.lang.reflect.Array;

public class Main {
    public static void main (String[]args){
        String string1="Hello";
        String string2="How are you?";
        char[] charArray= (string1.substring(0,2)+string2.substring(string2.length()-2)).toCharArray();
         System.out.println(charArray);
    }
}
