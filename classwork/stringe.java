
import java.util.Arrays;

public class stringe {
    public static void main(String[] args) {
       String myString="MyName";
        String myString2="MyNamee";
        //String myNewString="MyName"+"MyNamee";
        String myNewString=myString.concat(myString2);
        int lenOfString= myNewString.length();
        char myChar= myString.charAt(2);
        String mySentence="Hello my name is nutter";
        String[] words=mySentence.split(" "); 
        System.out.println(Arrays.toString(words));
        String newSubString1= myString.substring(1,6);
        System.out.println(newSubString1);
        System.out.println(myString.toLowerCase());
        System.out.println(myString.toUpperCase());
        System.out.println(myString.equals("myname"));
        System.out.println(myString.equalsIgnoreCase("myname"));
        System.out.println(myString.contains("an"));
        System.out.println(myString.startsWith("My"));
        System.out.println(myString.endsWith("e"));
    }
    
    
}
